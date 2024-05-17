package model.user_example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* Aqui temos a classe que mapeia a relação N:1 com a classe OrderBidirection. Essa classe representa a
 * entidade dos itens e pedido, e ela é a entidade principal para apresentar o relacionamento, tendo os
 * valores de id do pedido e dos produtos.
 * 
 * Em relação a tabela de pedidos e a tabela de produtos ela representa o "Muitos" (N) da relação, en-
 * quanto produtos e pedidos representa o "Um" (1). Veja abaixo como ficou o mapeamento...
 * */

//Mapeamos a tabela para a entidade "order_item_bidirection" e colocamos o nome da classe no persistence.
//xml...
@Entity
@Table(name = "order_item_bidirection")
public class OrderItemBidirection {

	//Geramos um id auto-incremental...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Aqui usamos o @ManyToOne para mostrar que temos uma relação N:1 com a tabela de products, e va-
	//mos capturar os objetos de products por através do atributo "product"...
	@ManyToOne
	private Product product;
	
	//Aqui usamos o @ManyToOne para mostrar que temos uma relação N:1 com a tabela de products, e va-
	//mos capturar os objetos de order por através do atributo "order"...
	@ManyToOne
	private OrderBidirection order;
	
	//Mapeamos também a coluna "não nula" da quantidade de produtos comprados...
	@Column(nullable = false)
	private int quantity;

	//Mapeamos a coluna "não nula" do preço atual em que o produto foi comprado...
	@Column(nullable = false)
	private Double price;
	
	//Como padrão do JPA temos o construtor padrão da classe mapeadora...
	public OrderItemBidirection() {}
	
	//E temos o nosso construtor customizado que recebe como parâmetro o número do pedido, o produto 
	//e a quantidade de produto comprado.
	public OrderItemBidirection(OrderBidirection order, Product product, int quantity) {
		super();
		this.setOrder(order);
		this.setProduct(product);
		this.setQuantity(quantity);
	}

	//Abaixo temos os métodos getters and setters, com uma ressalva para o método setProduct, que já
	//atribuí o preço atual para o atributo "price" no momento da sua atribuição...
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
		
		if(product != null && this.price == null) {
			this.setPrice(product.getPrice());
		}
	}

	public OrderBidirection getOrder() {
		return order;
	}

	public void setOrder(OrderBidirection order) {
		this.order = order;
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
