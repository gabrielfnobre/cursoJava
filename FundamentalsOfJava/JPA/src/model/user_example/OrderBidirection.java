package model.user_example;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/* Aqui temos a classe que mapeia a integração com a entidade "order_bidirection" que mostra todos os
 * pedidos realizados. Note que essa classe possuí uma relação 1:N com a classe OrderItemBidirection
 * onde a nossa classe pode possuir vários (N) objetos relacionados a apenas 1 (1) objeto dessa clas-
 * se.
 * 
 * Porém, lembre-se que enquanto no mundo O.O podemos fazer essa representação sem gerar muitos pro-
 * blemas, não vamos fazer o mesmo no mundo do Banco de Dados relacional. Afinal, uma relação N:1 bi-
 * direcional poderia gerar muitos problemas de inconsistência e conflitos com o banco de dados.
 * 
 * Veja abaixo como fizemos essa relação...
 * */

//Mapeamos a classe para a entidade "order_bidirection" e colocamos o nome da classe no persistence.
//xml...
@Entity
@Table(name = "order_bidirection")
public class OrderBidirection {

	//Geramos um id auto-incremental...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Temos uma coluna para pegar a data do pedido da compra, lembrando que essa data tem que ser
	//sempre no formato de string...
	@Column(nullable = false)
	private String date;
	
	//Veja que usamos a annotation "OneToMany", pois desse lado da relação teremos vários objetos
	//da classe relacionada, ou seja, nós é que somos o lado "1" da relação 1:N, porém quem está
	//mapeando a relação é o lado "N", por isso temos que usar o atributo "mappedBy", do contrá-
	//rio teríamos nosso JPA geraria mais uma coluna para essa entidade, o que causaria uma rela-
	//ção 1:N bidirecional no banco, podendo gerar inconsistências. Note também que todos os va-
	//lores da classe relacionada que fizerem referência a um objeto dessa classe serão colocados
	//numa List de elementos, isso é feito de forma automática graças a annotation @OneToMany.
	
	//OBSERVAÇÃO IMPORTANTE: Veja na aula 13 que nós chamamos pelos itens do pedido de forma 
	//EAGER, e isso foi possível por que usamos o atributo "fetch" no modo "EAGER" do contrário
	//ele assumiria o valor padrão que é "LAZY" o que faria o faria com que os valores dos itens
	//nem aparecesse, pois no exemplo da aula, assim que chamamos pelo elemento já fechamos a 
	//conexão com o banco de dados. Caso tenha ficado em dúvidas, acesse a aula 13 para entender
	//melhor o que aconteceu...
	@OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
	private List<OrderItemBidirection> items;
	
	//Temos nosso construtor padrão, como é mandatório no JPA, ele já faz a atribuição da data 
	//atual para o atributo date graças ao método construtor que criamos abaixo...
	public OrderBidirection() {
		this(new Date());
	}
	
	//Aqui temos o método construtor que recebe a data atual e converte para string...
	public OrderBidirection(Date date) {
		super();
		String dateString = date.toString();
		this.setDate(dateString);
	}

	//Abaixo temos os métodos getters and setters, com uma ressalva no método setDate que recebe
	//um objeto Date como parâmetro mas o converte para uma string...
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		String dateString = date.toString();
		this.date = dateString;
	}

	public List<OrderItemBidirection> getItems() {
		return items;
	}

	public void setItems(List<OrderItemBidirection> items) {
		this.items = items;
	}
	
	
	
}
