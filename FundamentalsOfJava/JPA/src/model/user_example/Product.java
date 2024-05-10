package model.user_example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// SOBRE A CRIAÇÃO DE TABELAS E INTEGRAÇÃO COM O HIBERNATE

//	Aqui temos a classe Products que também será criada no nosso banco de dados, por padrão
//	temos que declarar todas as nossas classes no arquivo persistence.xml (dê uma olhada lá
//	e você verá que a classe foi declarada).
//	Dê uma olhada no código abaixo para aprender algumas annotations a mais que nós utiliza-
//	mos aqui que nós não tinhamos utilizado no exemplo da classe User_BD...

@Entity												//Neste exemplo além do Entity nós estamos usando a annotation "Table", essa annotation define
@Table(name = "products", schema = "curso_java")	//alguns parametros para a nossa tabela como "nome da tabela", "qual schema estamos usando" en-
public class Product {								//tre outras coisas. Observação importante! Se a tabela já tiver sido criada no banco, as vali-
													//dações que terão maior peso são as do banco e não a do JPA.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_name", length = 200, nullable = false) //Note que também estamos usando "Column", para mostra ao JPA especificamente qual
	private String name;										//é a coluna que desejamos mapear, também pré-definimos a quantidade de caracteres
																//aceitáveis e a não nulidade.
	@Column(name = "prod_price", nullable = false, precision = 11, scale = 2)	//Veja que para valores de ponto flutuante podemos escolher o to-
	private Double price;														//tal de caracteres numéricos bem como quantas casas após a vírgu-
																				//la nós poderemos utilizar por através do atributo "scale" da an-
	public Product() {}															//notation Column.
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
