package test;

import infra.DAO.DAO;
import model.user_example.Inheritance.SINGLE_TABLE.ScholarshipHolder;
import model.user_example.Inheritance.SINGLE_TABLE.Student;

// HERANÇA COM SINGLE TABLE

/* Por através do JPA também conseguimos simular o relacionamento de herança que existe no paradigma O.O para a realidade do 
 * banco de dados relacional. Mas para isso existem 3 estratégias que podemos usar, essas estratégias são: SINGLE_TABLE, 
 * TABLE_PER_CLASS e JOINED.
 * 
 * No exemplo desta aula, vamos simular como fazer a estratégia SINGLE_TABLE, veja o diagrama abaixo para entender como essa
 * estratégia acontece entre o paradigma O.O e o BD Relacional:
 *                          ____________        _______
 *                         |  |  _|_____|______|___    |
 * 		Class Animal {	   |  |	|	 | 	    |	   |   |      Class Mammal extends Animal {
 *                         |  | | id | name | type |   |						     |
 * 			private id;____|  | |____|______|______|   |_________private type;		 |
 * 			private name;_____| |____|______|______|    _____________________________|
 *								   |	|			   |	  
 *		}                          |____|______________|      }
 * 
 * Nessa estratégia note que temos 2 classes, a classe animal que possuí os atributos "id" e "name" e a classe "Mammal" que
 * herda os atributos "id" e "name" de animal e além disso possuí mais um atributo, o "type". Veja como fica a ligação com o
 * banco de dados quando usamos o modelo SINGLE_TABLE, nós geramos uma única tabela, onde o id será nossa PK, o name é com-
 * partilhado entre elas, mas o type só terá valor quando o animel for do tipo mamífero, quando o animal não for mamífero, a
 * coluna ficará com valor null.
 * 
 * É isso o que a estratégia SINGLE_TABLE faz, ela colocar todos os valores gerados na herança numa única tabela. A única 
 * forma de diferenciá-los é por através de 1 coluna que reflita um atributo próprio da classe filha.
 * 
 * Veja abaixo como fizemos a implementação da nossa herança SINGLE_TABLE...
 * */

public class Aula19_InheritanceSINGLE_TABLE_test {
	public static void main(String[] args) {
		
		//Veja que geramos um objeto DAO passando a classe Student e seus elementos como parâmetro...
		DAO<Student> studentDAO = new DAO<>(Student.class);

		//Geramos uma instância de student passando somente os valores de atributo que essa classe têm e geramos uma instân-
		//cia de scholarshipHolder que herda de student, e apenas acrescenta o valor da bolsa do aluno bolsista...
		Student student = new Student(104L, "August");
		ScholarshipHolder scholarshipHolder = new ScholarshipHolder(530L, "Fernand", 1000);
		
		//Veja que quando fazemos a inclusão de ambos apenas 1 tabela é gerada, onde o valor da bolsa é o único diferencial
		//entre as tuplas, pois os alunos bolsistas terão algum valor na coluna de bolsita, enquanto aqueles que não são 
		//bolsistas terão o campo para esta coluna como "null". Além disso, perceba que temos uma coluna adicional que não
		//possuí atributo nas classes, que é a coluna de "type", essa coluna foi criada para fazer diferencial entre os alu-
		//nos normais e os bolsistas por através de uma sigla. Veja como essa coluna foi implementada nas classes usando a
		//annotation @DiscriminatorColumn e @DiscriminatorValue...
		studentDAO
			.atomicInclusion(student)
			.atomicInclusion(scholarshipHolder)
			.close();
	}
}
