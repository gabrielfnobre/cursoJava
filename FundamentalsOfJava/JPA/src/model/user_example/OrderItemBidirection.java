package model.user_example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_item_bidirection")
public class OrderItemBidirection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private OrderBidirection order;
	
	@Column(nullable = false)
	private int quantity;

	@Column(nullable = false)
	private Double price;
	
	public OrderItemBidirection() {}
	
	public OrderItemBidirection(OrderBidirection order, Product product, int quantity) {
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
