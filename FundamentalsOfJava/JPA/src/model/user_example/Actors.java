package model.user_example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/* Aqui podemos ver como fizemos o relacionamento N:M entre a tabela "movies" e "actors", onde a classe 
 * Actors é a classe secundária no relacionamento N:M. Veja abaixo como fizemos a implementação...
 * */

//Primeiro definimos que essa classe seria mapeada para a entidade "actors" no banco de dados, e passa-
//mos o nome dessa classe para o arquivo "persistend.xml"...
@Entity
@Table(name = "actors")
public class Actors {

	//Geramos um id auto-incremental para a entidade...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Geramos um atributo name para capturar os nomes dos atores...
	private String name;
	
	//Geramos uma lista de filmes para capturar os objetos de filmes aos quais os atores pertencem. Mas
	//note que a relação está sendo mapeada pela classe "Movies" usando o atributo "actors".
	
	//Mas o mais interessante a se notar é o atributo "cascade" estar sendo usado nesta classe. Por que
	//usar ele novamente, se já estamos usando o cascade na classe "Movies"? Isso é justamente por que
	//a relação entre essas duas classes é bi-direcional e podemos ter elementos entre as 2 classe que
	//podem precisar ser mapeados anteriormente para fazermos nossas operações. Um bom exemplo disso é
	//o que acontece com o filme "Indiana Jhones", ele só é capturado em cascata por que existe aqui
	//na classe "Actors" um atributo "cascade" ativo para persistência.
	@ManyToMany(mappedBy = "actors", cascade = CascadeType.PERSIST)
	//Note que não inicializamos o ArrayList no momento da declaração do atributo, isso foi proposital
	//para podermos mostrar um outro método de inicialização de valores usados pelos desenvolvedores 
	//ao usar Listas junto a relacionamentos N:M, veja mais no método getMovies...
	private List<Movies> movies;
	
	//Geramos o construtor padrão como é mandatório do JPA...
	public Actors() {}

	//Geramos um construtor para pegar os nomes dos atores...
	public Actors(String name) {
		super();
		this.name = name;
	}

	//Abaixo temos os métodos getters and setters comuns, com uma ressalva no método "getMovies"...
	
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

	//Veja aqui uma outra maneira utilizada por muitos desenvolvedores para não chamar listas nulas du-
	//rante suas operações N:M com JPA, eles utilizam uma validação para ver se o atributo não está nu-
	//lo, caso esteja, a variável é inicializada usando um ArrayList vazio...
	public List<Movies> getMovies() {
		if(movies == null) {
			this.movies = new ArrayList<>();
			return movies;
		}
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	
}
