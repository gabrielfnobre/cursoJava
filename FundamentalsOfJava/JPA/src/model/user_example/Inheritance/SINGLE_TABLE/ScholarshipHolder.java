package model.user_example.Inheritance.SINGLE_TABLE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/* E aqui temos a implementação da nossa classe ScholarshipHolder para simular os alunos bolsistas na relação de 
 * herança da estratégia SINGLE_TABLE. Veja como fizemos a implementação para identificá-la no Java...
 * */

//Primeiro a mapeamos a uma entidade do Banco de Dados...
@Entity
@Table(name = "scholarship_holder")
//Como estamos usando uma coluna Discriminator na nossa classe Mãe, temos que gerar um valor descriminador na co-
//luna descriminadora, que no nosso caso é a coluna "type". Nós definimos a sigla "SH" como descriminadora de to-
//das as ocorrências que forem do tipo aluno bolsista...
@DiscriminatorValue("SH")
//Fizemos nossa classe extender de Student...
public class ScholarshipHolder extends Student {

	//Note que geramos um atributo a mais para a nossa classe ScholarshipHolder, esse atributo irá receber o valor
	//da bolsa que o aluno irá receber...
	private int scholarship;
	
	//Temos um construtor padrão como é mandatório para as classes mapeadas pelo JPA...
	public ScholarshipHolder() {}

	//E temos um construtor customizado, onde vamos pegar o valor de registro do aluno, seu nome e valor de bolsa
	//que ele vai receber...
	public ScholarshipHolder(Long registration, String name, int scholarship) {
		super();
		this.setRegistration(registration);
		this.setName(name);
		this.scholarship = scholarship;
	}
	
	//Como já temos métodos getters and setters herdados da nossa classe mãe, precisamos definir apenas os getters
	//and setters dos atributos gerados somente na classe filha...

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	
	
	
}
