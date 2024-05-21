package model.user_example.Aula18_Embeddable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Essa classe foi construída para ser utilizada como exemplo da nossa classe @Embeddable, note que apenas possuin-
 * do um atributo da classe Address (nossa classe anotada com o @Embeddable) nós automáticamente possuímos também
 * todos os atributos dessa classe como colunas nas nossas tabelas...
 * */

//Nossa classe possuidora precisa ser mapeada pelo JPA...
@Entity
@Table(name = "employees")
public class Employess {

	//Designamos um id auto-incremental...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//E aqui temos o nosso atributo Address, note que apenas o fato do atributo ser do tipo Address ele já irá pos-
	//suir os atributos dessa que foram declarados nesta classe...
	private Address address;
	
	public Employess() {}

	public Employess(String name, Address address) {
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
