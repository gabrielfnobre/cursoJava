package test;

import infra.DAO.DAO;
import model.user_example.Inheritance.JOINED.ScholarshipHolderJoined;
import model.user_example.Inheritance.JOINED.StudentJoined;

//HERANÇA COM JOINED

/* No exemplo desta aula, vamos simular como fazer a estratégia JOINED, veja o diagrama abaixo para entender como essa
* estratégia acontece entre o paradigma O.O e o BD Relacional:
* 
*                           ____________           ___________
*                          |  |  _|_____|___    __|_____|__   |
* 		Class Animal {	   |  |	|	 | 	    |  |    |      |  |    Class Mammal extends Animal {
*                          |  | | id | name |  | id | type |  |						     |
* 			private id;____|  | |____|______|  |____|______|  |______private type;		 |
* 			private name;_____| |____|______|  |____|______|  |__________________________|
*								   |		      |	  
*		}                          |______________|                }
* 
* 
* Nessa estratégia note que temos 2 classes, a classe "Animal" que possuí os atributos "id" e "name" e a classe "Mammal" que
* herda os atributos "id" e "name" de animal e além disso possuí mais um atributo, o "type". Veja como fica a ligação com o
* banco de dados quando usamos o modelo JOINED, nesse modelo nós geramos 2 tabelas e a relação entre elas é por através de
* relacionamento entre as suas PKs.
* 
* Note que cada tabela irá conter somente as colunas dos atributos que cada classe tem. (Informação importante! A tabela de 
* Mammal só recebe o atributo "id" para ter uma relação JOIN com a tabela Animal, fora isso os demais atributos só se tor-
* narão colunas nas tabelas que forem mapeadas nas respectivas classes.)
* 
* Essa é a estratégia JOINED, ela colocar divide dos objetos gerados entre classes mãe e filhas gerando uma tabela para cada
* mãe e filha da herança. E a forma de relacionar as tabelas é por através dos valores das PKs.
* 
* Veja abaixo como fizemos a implementação da nossa herança JOINED...
* */

public class Aula20_InheritanceJOINED {
	public static void main(String[] args) {
		
		//Primeiro geramos um DAO genérico para mapear todos os valores existentes na classe mãe...
		DAO<StudentJoined> studentDAO = new DAO<>(StudentJoined.class);
		
		//Criamos um objeto para cada classe para mostrar como elas vão se relacionar entre si no banco de dados...
		StudentJoined student = new StudentJoined(104L, "August");
		ScholarshipHolderJoined scholarshipHolder = new ScholarshipHolderJoined(530L, "Ferdnand", 1000);
		
		//Fizemos a inclusão atômica dos 2 objetos, agora olhe no banco de dados e note que na tabela de Students vamos ter 
		//2 ocorrências, afinal August e Ferndand são estudantes, portanto pertencem a classe mãe. Mas note que Ferdand por
		//ser um bolsita, será a única ocorrência da tabela filha, e que lá terá apenas o seu valor "id" que faz a relação 
		//com o mesmo valor "id" da tabela de students, e o valor da bolsa que "Ferdnand" recebe...
		studentDAO
			.atomicInclusion(student)
			.atomicInclusion(scholarshipHolder)
			.close();
		
		//Veja agora as classes StudentJoined e ScholarshipHolderJoined para entender melhor como fizemos a implementação da
		//herança usando a estratégia "JOINED...
		
	}
}
