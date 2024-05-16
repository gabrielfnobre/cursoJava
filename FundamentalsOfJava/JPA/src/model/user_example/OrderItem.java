package model.user_example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* Abaixo temos a representação da classe que mapeia o itens do pedido para a entidade "order_item".
 * É nesta classe que nós fazemos o mapeamento do relacionamento 1:N com as entidades "orders" e 
 * "products".
 * 
 * Essa relação foi mapeada para acontecer de forma unidirecional onde a entidade order_item terá a
 * preferência no relacionamento, tendo os ids das demais entidades como FK nas suas colunas.
 * 
 * Veja como fizemos isso...
 * */

//Aqui fizemos o mapeamento da Entidade "order_item" para a classe "OrderItem"...
@Entity
@Table(name = "order_item")
public class OrderItem {

	//Definimos também um id auto-incremento para essa entidade...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Aqui geramos um atributo que vai receber os objetos da classe Orders, note que já estabelece-
	//mos um relacionamento com essa classe de 1:N unidirecional, ou seja, não importa quantos 
	//itens de pedido nós criarmos, eles sempre deverão referenciar a um único pedido, podemos ter 
	//vários itens referenciando para 1 único pedido.
	@ManyToOne
	private Orders order;
	
	//Aqui geramos o atributo que vai receber os objetos da classe Product, note que já establece-
	//mos um relacionamento com essa classe de 1:N unidirecional, ou seja, não importa quantos
	//itens de pedido nós criarmos, eles sempre deverão referenciar a um único produto, podemos 
	//ter vários itens que fazem referência a 1 único pedido.
	@ManyToOne
	private Product product;
	
	//Aqui nós mapeamos o atributo "quantity" para representar a coluna de quantidade de produtos
	//adquiridos numa compra. Essa coluna não poderá receber valores nulos.
	@Column(nullable = false)
	private int quantity;
	
	//Aqui nós mapeamos o atributo "price" para representar o preço do produto. Essa coluna não 
	//poderá receber valores nulos. Embora o objeto product já contenha o preço do produto, opta-
	//mos por ter esse atributo no item de pedido para armazenar o valor atual do produto no mo-
	//mento da compra, visto que o preço de um produto pode mudar...
	@Column(nullable = false)
	private Double price;
	
	//Temos um método construtor, o que é mandatório para trabalhar com JPA...
	public OrderItem() {}
	
	//E temos um método construtor personalizado, onde recebemos um pedido, um produto e o valor
	//da quantidade de produtos que desejamos adquirir. E usando os métodos get e set, passamos
	//os valores para os nossos atributos que contém cada um destes objetos...
	public OrderItem(Orders order, Product product, int quantity) {
		super();
		this.setOrder(order);
		this.setProduct(product);
		this.setQuantity(quantity);
	}

	//Abaixo temos os métodos getters e setters, com a ressalva do método setProduct que é um 
	//tanto incomum...
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	//Note que no método setProduct nós já setamos o valor do preço do produto, isso faz
	//com que o produto receba o preço do momento da compra, em vez do preço de produto 
	//que pode variar com o tempo...
	public void setProduct(Product product) {
		this.product = product;
		if(product != null && this.price == null) {			
			this.setPrice(product.getPrice());
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
