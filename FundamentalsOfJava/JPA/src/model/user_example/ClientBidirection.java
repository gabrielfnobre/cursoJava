package model.user_example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client_bidirection")
public class ClientBidirection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "seat_bidirection_id",unique = true)
	private SeatBidirection seat;
		
	public ClientBidirection() {}
	
	public ClientBidirection(String name, SeatBidirection seat) {
		super();
		this.name = name;
		this.seat = seat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SeatBidirection getSeat() {
		return seat;
	}

	public void setSeat(SeatBidirection seat) {
		this.seat = seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
