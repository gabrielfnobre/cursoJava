package model.user_example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* E aqui temos a nossa classe Seat mapeada para a entidade "seats" no BD. Note que Seat não iden-
 * tifica nenhuma relação com a classe Clients, isso é proposital, pois geramos uma relação 1:1 
 * unidirecional, geralmente esse é o método mais utilizado para evitar que duplicidade de regis-
 * tros possa acontecer - pois apenas uma classe guardará o objeto relacionado da outra.
 * 
 * Veja abaixo como fizemos o mapeamento para a entidade...
 * */

//Identificamos a classe como mapeada para a Entidade "seats", e obviamente adicionamos a classe 
//ao no nosso persistence.xml...
@Entity
@Table(name = "seats")
public class Seat {
	
	//Também geramos um id auto-incremento...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	
	//Possuímos um método construtor padrão, o que é mandatório para trabalharmos com JPA...
	public Seat() {}

	//E aqui temos o método construtor que será utilizado para gerar nossas instâncias capturan-
	//o código identificador do asssento no atributo "code"
	public Seat(String code) {
		super();
		this.code = code;
	}

	//Abaixo temos nossos métodos getters and setters...
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return code;
	}

	public void setName(String name) {
		this.code = name;
	}
	
	

}
