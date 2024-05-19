package model.user_example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/* Abaixo temos a implementação da relação N:M entre a classe Uncle e Nephew, relembrando que a
 * classe Uncle é a classe principal na representação do relacionamento entre elas...
 * */

//Primeiro definimos que a classe Uncle será mapeada para a entidade "uncles" no banco de dados...
@Entity
@Table(name = "uncles")
public class Uncle {
	
	//Geramos um id auto-incremental...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Um atributo para receber os nomes dos tios...
	private String name;
	
	//E aqui geramos uma lista que receberá os objetos da classe "Nephew", é neste atributo que 
	//faremos o mapeamento da relação, como essa classe será a principal representadora da rela-
	//ção, não precisamos usar o atributo "mappedBy" nela para mostrar um outro atributo mapea-
	//dor, pois já iremos avisar a classe "Nephew" que esse atributo será o mapeador. Note tam-
	//bém que já optamos por inicializar um array vazio em vez de fazer a inclusão dos sobrinhos
	//na chamada do método construtor, invez disso, optamos por incluir os sobrinhos posterior-
	//mente usando métodos add.
	
	//DETALHE IMPORTANTE! Sempre que temos uma relação N:M o JPA irá gerar uma 3ª tabela no BD,
	//essa tabela recerá o nome das classes relacionadas separadas por um underline entre elas
	//onde o primeiro nome sempre será o nome da classe principal do relacionamento. No nosso 
	//caso, essa 3ª tabela receberá o nome de "uncles_nephews".
	@ManyToMany
	private List<Nephew> nephews = new ArrayList<>();

	//Geramos um construtor padrão, como é mandatório para o JPA...
	public Uncle() {}

	//E geramos um construtor que receberá como parâmetro o nome dos tios...
	public Uncle(String name) {
		super();
		this.name = name;
	}

	//E abaixo temos nossos métodos getters and setters...
	
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

	public List<Nephew> getNephews() {
		return nephews;
	}

	public void setNephews(List<Nephew> nephews) {
		this.nephews = nephews;
	}
	
}
