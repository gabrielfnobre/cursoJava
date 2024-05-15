package model.user_example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/* Aqui temos a implementação bi-direcional de cliente, como cliente é a nossa classe que representa a 
 * entidade principal do nosso relacionamento veja que a implementação dela não muda...
 * */

//Fizemos o mapeamendo da classe para a entidade "client-bidirection", passando o nome da classe para
//o persistence.xml...
@Entity
@Table(name = "client_bidirection")
public class ClientBidirection {

	//Fizemos o mapeamento do atributo "id" para a coluna de id da entidade gerando o auto-incremento
	//automaticamente...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//Também fizemos o mapeamento do relacionamento entre o atributo seat e o id da entidade seat_bi-
	//direction, o que gerou a coluna "seat_bidirection_id" na nossa entidade, e usamos o unique para
	//que não tenhamos nenhum valor repetido nessa coluna... 
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
