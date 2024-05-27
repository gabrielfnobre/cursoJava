package model.user_example.Inheritance.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/* Aqui nós temos a implementação da classe mãe no relacionamento de herança para a estratégia do tipo TABLE_PER_CLASS,
 * nesse relacionamento vamos gerar 2 tabelas independentes uma da outra, onde uma irá conter apenas os atributos da 
 * classe mãe, mapeados em colunas, e a outra irá conter apenas os atributos da classe filha mapeados nas colunas que
 * pertencem a classe mãe e aos atributos que forem gerados na classe filha.
 * 
 * No nosso caso na nossa classe mãe vamos ter o estudante, que irá ter como atributos o número de registro e o nome, 
 * enquanto na classe filha, que irá simular um bolsista, que terá os mesmos atributos que aluno, mas em adição terá 
 * o atributo com o valor da bolsa.
 * 
 * Veja a implementação logo abaixo...
 * */

//Aqui temos a declaração de que nossa classe será mapeada para uma entidade, como nossas classes irão pertencer a en-
//tidades diferentes, podemos definir nomes para elas como quisermos...
@Entity
//Aqui declaramos que essa herança será mapeada seguindo a estratégia do tipo "TABLE_PER_CLASS"...
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "student_table_per_class")
public class StudentTABLE_PER_CLASS {

	//Usaremos a coluna "registration" como a PK da nossa tabela...
	@Id
	private Long registration;
	private String name;
	
	//Como é mandatório do JPA, temos o nosso método construtor padrão declarado...
	public StudentTABLE_PER_CLASS() {}

	//E aqui temos o método construtor customizado, para criarmos instâncias já passando o número de registro e o nome
	//dos alunos...
	public StudentTABLE_PER_CLASS(Long registration, String name) {
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
