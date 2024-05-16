package model.user_example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* Abaixo temos a representação da classe 
 * */

@Entity
@Table(name = "order_item")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Orders order;
	
	@ManyToOne
	private Product product;
	
	@Column(nullable = false)
	private int quantity;
	
	@Column(nullable = false)
	private Double price;
	
	public OrderItem() {}
	
	public OrderItem(Orders order, Product product, int quantity) {
		super();
		this.setOrder(order);
		this.setProduct(product);
		this.setQuantity(quantity);
	}

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
