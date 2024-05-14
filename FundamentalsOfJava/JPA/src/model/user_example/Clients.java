package model.user_example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/* A missão do mapeamento 1:1 entre as classes Clients e Seat é figurar um mapeamento 1:1 onde
 * um cliente só poderá ter 1 acento, assim como 1 acento só poderá ser um cliente, em uma ar-
 * quibancada.
 * 
 * Veja abaixo as annotations que utilizamos para isso...
 * */

//Usando Entity e Table, identificamos qual será a entidade mapeada no banco de dados, obvia-
//mente já incluímos a classe Clients no persistence.xml!
@Entity
@Table(name = "clients")
public class Clients {
	
	//Abaixo temos o nosso ID auto-incremento gerado...
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//E aqui está o pulo do gato, usamos 2 annotations para representar o relacionamento 1:1 
	//entre as classes Clients e Seat, a @OneToOne é usada para mostrar que uma relação 1:1
	//foi gerada com o objeto da classe relacionada - geralmente essa annotation é utilizada 
	//na classe que mais será utilizada pela nossa aplicação.
	//Perceba que estamos usando também a annotation @JoinColumn, essa annotation garante a
	//não duplicidade na coluna seat_id, que será a coluna FK da tabela clients, que recebe-
	//rá os ids dos acentos.
	//OBSERVAÇÕES: Poderíamos ter criado um Long representando o id do acento, mas em vez 
	//disso optamos por pegar o objeto inteiro, por que isso? Lembre-se que estamos usando
	//OO com BD, podemos ter o melhor dos 2 mundos. Vale mais a pena pegar o objeto inteiro
	//para podermos utilizar todos os seus atributos e métodos como desejarmos.
	@OneToOne(cascade = CascadeType.PERSIST) 		//O cascade é usado para que o nosso código possa fazer operações em cascata, no caso estamos usando a operação
	@JoinColumn(name = "seat_id", unique = true)	//"PERSIST", mas podemos fazer outras operações como "MERGE", "REMOVE", "DETACH" e outras. Para que servem ope-
	private Seat seat;								//rações em cascata? Geralmente quando uma operação necessita que outra seja feita primeiro, podemos chamar es-
	private String name;							//sa operação implícitamente por através do cascade. Por exemplo veja a aula 9 para ver um exemplo de cascade...
	
	
	//Temos um método construtor padrão, necessário para que o JPA execute seus comandos...
	public Clients() {}
	
	//Temos também o método que será utilizado para atribuir um assento a um cliente no mo-
	//mento em que o cliente é instanciado...
	public Clients(String name, Seat seat) {
		super();
		this.seat = seat;
		this.name = name;
	}

	//Abaixo nossos métodos getters and setters...
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
