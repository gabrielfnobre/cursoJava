package model.user_example.Inheritance.JOINED;

import javax.persistence.Entity;

/* Aqui temos o exemplo do mapeamento de uma classe filha dentro de uma relação JOINED no JPA, note que essa classe simula
 * a relação de herança que um bolsita tem com a classe aluno. Onde o bolsista também é um aluno, porém, ele recebe valor
 * de bolsa, coisa que os alunos comuns não recebem.
 * 
 * Por isso, o JPA cria para nós 2 tabelas que irão fazer o JOIN, onde uma tabela irá referenciar a classe mãe StudentJoined
 * que irá conter os números de registro dos alunos e seus nomes, quanto a classe ScholarshipHolder, que herda de StudentJoi-
 * ned, irá conter apenas o número de registro (necessário para o JOIN) e o valor da bolsa que aluno recebe.
 * 
 * Veja abaixo como fizemos a implementação...
 * */

//Primeiro designamos que essa classe irá mapear um relacionamento com alguma tabela do nosso banco de dados...
@Entity
//Veja que a nossa classe atual extende de StudentJoined, que é uma classe que está mapeando uma relação com a estratégia
//JOINED, ou seja, automaticamente o JPA detecta que essa classe é uma filha na relação...
public class ScholarshipHolderJoined extends StudentJoined{

	//Veja que ScholarshipHolderJoined possuí um atributo á mais, que seria referente ao valor de bolsa que o aluno bolsis-
	//ta recebe...
	private int scholarship;

	//Temos um método construtor padrão declarado, como é mandatório do JPA...
	public ScholarshipHolderJoined() {}

	//Temos um método construtor customizado que irá receber como parâmetros o registro do aluno, seu nome e o seu valor de
	//bolsa que o mesmo recebe...
	public ScholarshipHolderJoined(Long registration, String name, int scholarship) {
		super();
		this.setName(name);
		this.setRegistration(registration);
		this.scholarship = scholarship;
	}
	
	//Abaixo temos os nossos métodos getters and setters para o atributo "scholarship" que foi gerado nesta classe, visto 
	//os demais métodos getters e setters já são capturados por herança...

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	
}
