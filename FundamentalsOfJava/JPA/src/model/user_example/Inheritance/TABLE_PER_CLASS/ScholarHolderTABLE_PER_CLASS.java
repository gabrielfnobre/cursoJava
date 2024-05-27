package model.user_example.Inheritance.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* Aqui nós temos um exemplo de uma classe filha mapeada numa relação de herança do tipo TABLE_PER_CLASS
 * nesse tipo de relação de herança, a nossa classe filha irá herdar somente o atributo "name", visto que
 * o atributo "registration" é a PK da classe mãe, e não desejamos ter uma relação de dependência entre 
 * as classes, visto que vamos querer gerar 2 tabelas independentes de relacionamento no banco de dados.
 * 
 * No nosso caso, estamos simulando o relacionamento de herança que existe entre alunos e alunos bolsis-
 * tas, onde, todo aluno bolsista é um aluno, mas nem todo aluno é um aluno bolsista. Por isso vamos ter
 * duas tabelas, uma só com aqueles que são alunos normais, e uma só com aqueles que são alunos bolsis-
 * tas. Diferente da herança do estilo JOINED, onde os alunos bolsistas estavam tanto na tabela de alunos
 * quanto na tabela de alunos bolsistas, aqui os bolsistas estarão apenas na tabela referente a eles, 
 * pois o TABLE_PER_CLASS não permite relacionamento entre as tabelas.
 * 
 * Veja a implementação logo abaixo...
 * */

//Aqui declaramos que a classe será mapeada para a tabela "schorlarshipholder", como vamos ter uma tabe-
//la para cada classe da herança, podemos escolher o nome da tabela que desejamos mapear...
@Entity
@Table(name = "scholarshipholder_table_per_classs")
//Veja que temos uma relação de herança com a classe "StudentTABLE_PER_CLASS", o que define que podemos
//usar uma herança do estilo "TABLE_PER_CLASS"...
public class ScholarHolderTABLE_PER_CLASS extends StudentTABLE_PER_CLASS {

	//Veja que em vez de puxar o nosso atributo "registration" por herança, nós criamos um novo, isso só
	//para que a nossa PK não faça referência a PK da nossa classe mãe, do contrário teriamos um relacio-
	//namento estre as tabelas, e a ideia do TABLE_PER_CLASS é não possuir relacionamento nenhum entre
	//tabelas e sim criar tabelas diferentes, como elas não vão compartilhar os valores de id, estamos
	//por assim dizer gerando nosso próprios ids...
	@Id
	private Long registration; 
	private int scholarship;
	
	//Temos um método construtor padrão declarado, como é mandatório do JPA...
	public ScholarHolderTABLE_PER_CLASS() {}

	//E temos o nosso método construtor customizado para gerar instâncias já passando os valores de re-
	//gistro, nome e valor da bolsa para os bolsistas...
	public ScholarHolderTABLE_PER_CLASS(Long registration, String name, int scholarship) {
		super();
		this.setRegistration(registration);
		this.setName(name);
		this.scholarship = scholarship;
	}

	//Abaixo temos os nosso métodos getters and setters, note que só não temos métodos getters and set-
	//ters para o atributo "name", pois esse é o único atributo que desejamos pegar o valor por heran-
	//ça...
	
	public int getScholarship() {
		return scholarship;
	}

	public Long getRegistration() {
		return registration;
	}

	public void setRegistration(Long registration) {
		this.registration = registration;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	
	
}
