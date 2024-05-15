package model.user_example;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String date;
	
	public Orders() {
		this(new Date());
	}
	
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

	public void setDate(Date date) {
		Date dateString = new Date();
		this.date = dateString.toString();
	}

}
