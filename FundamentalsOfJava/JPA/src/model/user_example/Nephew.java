package model.user_example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/* Abaixo temos a implementação de um relacionamento N:M entre as classes Nephew e Uncle, note que no nosso 
 * exemplo a classe Nephew NÃO SERÁ a classe principal como representante do relacionamento, em vez disso 
 * optamos por usar a classe Uncle como principal. Veja a implementação logo abaixo...
 * */

//Primeiro mapeamos a classe Nephew para a entidade "nephews" no BD...
@Entity
@Table(name = "nephews")
public class Nephew {

	//Geramos um id auto-incremental para ela...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Também temos um atributo que receberá o nome dos sobrinhos...
	private String name;
	
	//E aqui está o pulo do gato!
	//Usamos a annotation @ManyToMany junto ao atributo "mappedBy" para mostrar que temos um relacionamento
	//N:M com a classe "Uncle", porém, a nossa classe não será a principal representante do relacionamento
	//e sim a classe "Uncle" por através do atributo "nephews".
	//Mas talvez você se pergunte, mas num relacionamento N:M não são ambas as classes bi-direcionais? Por
	//que deixar uma como principal no lugar de outra?
	//Realmente, o relacionamento será bi-direcional, porém no mundo do BD relacional será gerada uma 3ª 
	//tabela que receberá o nome das 2 entidades separado por um underline, a 1 coluna dessa tabela recebe-
	//rá como parâmetro justamente os valores da tabela principal do relacionamento, o mappedBy neste caso
	//servirá apenas para identificar qual é a classe principal que deve representar essa primeira coluna
	//da 3ª tabela, que no nosso caso será a tabela "uncles_nephews".
	
	//Note que o nosso atributo relacionado recebe uma lista de objetos de Uncle, e que já inicializamos a
	//lista para que pudéssemos fazer inserções no banco de dados a partir dos métodos "add" de ArrayList...
	@ManyToMany(mappedBy = "nephews")
	private List<Uncle> uncles = new ArrayList<>();
	
	//Temos um método construtor padrão declarado, como é mandatório do JPA...
	public Nephew() {}

	//Temos um método construtor que receberá como parãmetro o nome dos sobrinhos...
	public Nephew(String name) {
		super();
		this.name = name;
	}

	//E abaixo temos os nossos métodos getters and setters...
	
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

	public List<Uncle> getUncles() {
		return uncles;
	}

	public void setUncles(List<Uncle> uncles) {
		this.uncles = uncles;
	}
	
}
