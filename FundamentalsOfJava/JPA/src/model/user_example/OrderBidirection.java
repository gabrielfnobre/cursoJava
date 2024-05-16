package model.user_example;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order_bidirection")
public class OrderBidirection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String date;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItemBidirection> items;
	
	public OrderBidirection() {
		this(new Date());
	}
	
	public OrderBidirection(Date date) {
		super();
		String dateString = date.toString();
		this.setDate(dateString);
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

	public void setDate(String date) {
		String dateString = date.toString();
		this.date = dateString;
	}
	
	
}
