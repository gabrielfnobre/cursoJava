package model.user_example.Inheritance.SINGLE_TABLE;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/* Note aqui que usamos apenas algumas annotations para simular a herança entre a nossa classe e o Banco de Dados
 * usando a estratégia de SINGLE_TABLE, ou seja, onde sabemos que vamos usar apenas 1 única tabela para simular o 
 * relacionamento de herança. Veja como fazemos ela acontecer...
 * */

//Começamos designando a nossa classe como uma entidade do banco...
@Entity
//Designamos a estratégia de herança como "SINGLE_TABLE"...
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//Devemos escolher uma coluna que irá fazer a descriminação entre os valores que pertencem a classe pai e os valo-
//res que pertencem as classes filhas, no nosso caso definimos que a coluna "type" irá fazer a distinção entre a-
//lunos bolsistas e não bolsistas...
@DiscriminatorColumn(name = "type")
//Podemos também delegar a classe um valor diferenciador característico aos objetos de uma determinada classe, a-
//qui definimos que os objetos de Student receberão a sigla "ST" na coluna para identificarmos que as ocorrências
//pertencem a classe "Student"...
@DiscriminatorValue("ST")
public class Student {

	//Definimos que a coluna "registration" será a nossa PK...
	@Id
	private Long registration;
	private String name;
	
	//Temos um método construtor Student padrão, como é mandatório para as classes mapeadas no JPA...
	public Student() {}

	//E temos um método construtor criado por nós para receber o número de registro e o nome dos aluno novos...
	public Student(Long registration, String name) {
		super();
		this.registration = registration;
		this.name = name;
	}

	//E abaixo nossos métodos getters and setters...
	
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
