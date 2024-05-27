package model.user_example.Inheritance.JOINED;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/* Aqui temos a implementação da Herança para a estratégia JOINED no JPA, que essa é a classe mãe, que no caso é a
 * classe que mapeia a relação entre um estudante e um bolsista. Note que o estudante deverá ter nome e registro, 
 * enquanto o bolsita, além de ter nome e registro também deverá ter um valor de bolsa.
 * 
 * Note que serão geradas 2 tabelas no BD, onde a tabela que mapear a classe StudentJoined irá conter os nomes de
 * todos os estudantes, não importa se forem bolsistas ou não, e a tabela que mapear os bolsistas deverá conter 
 * apenas.
 * 
 * Veja a implementação logo abaixo...
 * */

//Primeiro mapeamos a classe para a tabela que desejamos mapear...
@Entity
//Note que estamos usando a annotation de herança com a estratégia "JOINED" para que as 2 tabelas possam usar os 
//valores de "id" de forma compartilhada entre elas...
@Inheritance(strategy = InheritanceType.JOINED)
public class StudentJoined {
	
	//Abaixo designamos o registration como nossa PK e geramos a coluna de "name" dos alunos...
	@Id
	private Long registration;
	private String name;
	
	//Temos o nosso construtor padrão declarado na classe, como é mandatório do JPA...
	public StudentJoined() {}

	//E temos o nosso construtor customizado, para receber o valor de registro e o nome do aluno...
	public StudentJoined(Long registration, String name) {
		super();
		this.registration = registration;
		this.name = name;
	}

	//Abaixo temos os nossos métodos getters and setters...
	
	public Long getRegistration() {
		return registration;
	}

	public void setRegistration(Long registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
