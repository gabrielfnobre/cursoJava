package model.user_example;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Aqui temos o exemplo da nossa entidade orders mapeada para a classe "Orders" note que como
 * a classe Orders está do lado 1:N da relação, e a relação é unidirecional, ela não recebe
 * nenhuma annotation para representar a relação com a classe OrderItem.
 * 
 * Veja a implementação completa abaixo...
 * */

//Temos o mapeamento para a entidade "orders" - (não pode ser "order" se não dá erro)
@Entity
@Table(name = "orders")
public class Orders {

	//Temos o nosso "id" mapeado para a PK da entidade usando auto-incremento...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String date;
	
	//Passamos para o construtor padrão a chamada do construtor que nós criamos passando
	//um objeto Date que captura a data atual...
	public Orders() {
		this(new Date());
	}
	
	//Aqui está o construtor que nós criamos, que recebe um objeto Date com a data atual
	//note que precisamos converter esse objeto para uma string, visto que o Banco de Da-
	//dos não pode receber um objeto do tipo Date, daria erro...
	public Orders(Date date) {
		super();
		Date dateString = new Date();
		this.date = dateString.toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	//Temos também uma conversão do objeto Date recebido no método setter do atributo
	//date para string, para não termos erro...
	public void setDate(Date date) {
		Date dateString = new Date();
		this.date = dateString.toString();
	}

}
