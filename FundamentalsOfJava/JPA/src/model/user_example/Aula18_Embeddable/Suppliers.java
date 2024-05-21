package model.user_example.Aula18_Embeddable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Aqui temos a nossa classe Suppliers que foi desenvolvida apenas para vermos como funciona a relação de composição entre
 * a nossa classe embeddable - a classe Address - e a nossa classe mapeada que irá possuír os atributos de Address como 
 * colunas na sua tabela...
 * */

//Veja que a nossa classe precisa estar mapeada para poder reconhecer a annotation "@Embeddable" que está na classe Ad-
//dress...
@Entity
@Table(name = "suppliers")
public class Suppliers {

	//Designamos um id auto-incremental para ela...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//E aqui está o nosso atributo Address, note que só pelo fato de termos um atributo do tipo da classe que está com
	//a annotation @Embeddable, automáticamene nós possuiremos todos os atributos declarados para aquela determinada 
	//classe, ou seja, quando abrirmos o nosso banco de dados vamos perceber que temos 2 colunas adicionai para a tabe-
	//la que foi mapeada nessa classe, essas colunas são exatamente os atributos da nossa classe @Embeddable...
	private Address address;
	
	public Suppliers() {}

	public Suppliers(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
