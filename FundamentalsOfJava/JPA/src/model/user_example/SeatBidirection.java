package model.user_example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seat_bidirection")
public class SeatBidirection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	
	@OneToOne(mappedBy = "seat")
	private ClientBidirection client;

	public SeatBidirection() {}
	
	public SeatBidirection(String code) {
		super();
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ClientBidirection getClient() {
		return client;
	}

	public void setClient(ClientBidirection client) {
		this.client = client;
	}
	
}
