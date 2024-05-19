package model.user_example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/* Aqui temos a implementação do relacionamento entre Movies e Actors, veja como fizemos o relacionamento
 * e porque a inclusão em cascade foi possível...
 * */

//Primeiro mapeamos a classe para a entidade "movies" passando o nome da classe para o "persistence.xml"
@Entity
@Table(name = "movies")
public class Movies {

	//Geramos um id auto-incremental para a entidade...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Alguns atributos necessários para capturar o nome e nota que deram ao filme...
	private String name;
	private Double note;
	
	//Aqui identificamos o relacionamento como N:M e usamos o cascade para persistência, para que o JPA 
	//possa fazer a inserção de quaisquer registros necessários para os nossos comandos por através do
	//DAO.
	
	//Note também que estamos usando alguma annotation nova, a "@JoinTable", essa annotation permite que
	//passemos para o classe mapeadora da entidade o nome da 3ª tabela que será gerada para o relaciona-
	//mento N:M, usando o atributo "joinColumns" podemos passar o nome da coluna que estamos usando pa-
	//ra referenciar a PK e usando o atributo "inverseJoinColumns podmeos passar a coluna que iremos
	//receber como FK da outra entidade. Note que podemos até atribuir os nomes que quisermos a essas
	//colunas.
	
	//DETALHE IMPORTANTE: Essas atribuições de nomes só são possíveis de serem feitos a partir do lado 
	//da classe que está mapeando a relação N:M como principal...
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
		name = "actors_movies",
		joinColumns = @JoinColumn(name="movie_id", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name="actor_id", referencedColumnName = "id")
	)
	//Criamos um ArrayList para receber os valores de Actors, note que já inicializamos ele, pois a não
	//inicialização poderia nos impedir de fazer operações de busca dos elementos e validações como ve-
	//remos mais abaixo nos métodos getters and setters...
	private List<Actors> actors = new ArrayList<>();
	
	//Criamos um construtor padrão como é mandatório do JPA...
	public Movies() {}

	//Criamos um construtor para receber o nome e a nota dos filmes...
	public Movies(String name, Double note) {
		super();
		this.name = name;
		this.note = note;
	}

	//Abaixo temos os nossos métodos getters and setters, veja mais abaixo um método especial que cria-
	//mos para validar a inserção dos atores sem prejudicar a consistência do nosso banco...
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public List<Actors> getActors() {
		return actors;
	}
	
	//Criamos o método "addActors" para que pudéssemos fazer inserção dos atores aos nossos filmes e
	//ao mesmo tempo fazer a inserção dos filmes aos atores na classe "Actors". Veja que para fazer 
	//a inserção primeiro checkamos se o objeto ator não está nulo e se ele não já existe como ator
	//participante daquele filme. Se tudo estiver certo fazemos a inserção do ator no filme.
	//Após isso, temos uma segunda inserção a fazer, a inserção do filme para aquela ator. Mas veja
	//que antes de fazer a inserção, primeiro checkamos se aquele filme não já existe para aquele
	//ator, se não existir, aí sim fazemos a inserção do filme. Assim, garantimos a não duplicidade
	//de valores no nosso banco.
	public void addActors(Actors actor) {
		if(actor != null && !getActors().contains(actor)) {
			getActors().add(actor);
			
			if(!actor.getMovies().contains(this)) {
				actor.getMovies().add(this);
			}
		}
	}
	
}
