package model.user_example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/* Aqui na classe SeatBidirection temos a implementação da bi-direcionalidade aplicada na prática,
 * visto que a classe ClientBidirection já está implementando a coluna FK no banco de dados, não 
 * podemos ter uma coluna FK na entidade que representa o acento, visto que no banco de dados não
 * pode existir bi-direcionalidade.
 * 
 * Veja o que é necessário fazer no mundo OO para que a bi-direcionalidade aconteça somente no mun-
 * do OO e não vá para o mundo do Banco Relacional...
 * */

//Aqui temos a implementação com da classe mapeada para a nossa entidade "seat_bidirection" passan-
//do o nome da classe para o nosso persistence.xml...
@Entity
@Table(name = "seat_bidirection")
public class SeatBidirection {

	//Mapeamos também o atributo id para o id da entidade "seat_bidirection" passando o número como
	//auto-incremento...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	
	//E aqui está o segrego da não bi-direcionalidade do banco de dados, ao mesmo tempo que temos 
	//um objeto "client" que aponta para uma instância da classe ClientBidirection, temos também
	//o atributo "mappedBy" da annotation @OneToOne que já mostra para o JPA que o atributo "seat"
	//de ClientBidirection já está mapeando a relação 1:1 entre as classes, por isso o JPA não 
	//precisará criar uma coluna FK em "seat_bidirection" com os valores id de "client_bidirection.
	//É como se o atributo "mappedBy" dissesse ao JPA: "Ei o relacionamento já está feito lá no 
	//cliente não precisa gerar outro."
	@OneToOne(mappedBy = "seat")
	private ClientBidirection client;

	public SeatBidirection() {}
	
	//Ao mesmo tempo, veja que não precisamos receber o objeto de ClientBidirection no nosso cons-
	//trutor, pois isso já fica implícito quando chamamos pelo objeto SeatBidirection ao instanciar
	//a classe ClientBidirection, que recebe um objeto SeatBidirection na sua instancialização...
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
