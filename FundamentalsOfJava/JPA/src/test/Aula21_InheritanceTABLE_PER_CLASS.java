package test;

import infra.DAO.DAO;
import model.user_example.Inheritance.TABLE_PER_CLASS.ScholarHolderTABLE_PER_CLASS;
import model.user_example.Inheritance.TABLE_PER_CLASS.StudentTABLE_PER_CLASS;

//HERANÇA COM TABLE_PER_CLASS

/* No exemplo desta aula, vamos simular como fazer a estratégia TABLE_PER_CLASS, veja o diagrama abaixo para entender como 
* essa estratégia acontece entre o paradigma O.O e o BD Relacional:
* 
*                           ____________             __________________
*                          |  |  _|_____|___      __|___________|___   |
* 		Class Animal {	   |  |	|	 | 	    |    |    |      |      |  |    Class Mammal extends Animal {
*                          |  | | id | name |    | id | name | type |  |						     |
* 			private id;____|  | |____|______|    |____|______|______|  |______private id;		     |
* 			private name;_____| |____|______|    |____|______|______|  |______private type;          |
*								   		      	          |__________________________________________|
*		}                                                                  
*                                                                            }
* 
* Nessa estratégia note que temos 2 classes, a classe "Animal" que possuí os atributos "id" e "name" e a classe "Mammal" que
* herda os atributos "id" e "name" de animal e além disso possuí mais um atributo, o "type". Veja como fica a ligação com o
* banco de dados quando usamos o modelo TABLE_PER_CLASS, nesse modelo nós geramos 2 tabelas contendo todos os atributos tan-
* to pertencente a classe mãe, como colunas na tabela que mapeia a classe mãe, como temos todos os atributos herdados da 
* classe mãe e gerados na classe filha na tabela que mapeia a classe filha.
* 
* Isso acontece por que o TABLE_PER_CLASS gera 2 tabelas totalmente independentes de relacionamento entre si para mapear os 
* atributos da classe mãe e da classe filha. Diferente da JOINED, que mantém as PKs como relacionadas entre mães e filhas o 
* TABLE_PER_CLASS simplesmente gera tabelas separadas para cada classe da herança.
* 
* Veja abaixo como fizemos a implementação da nossa herança TABLE_PER_CLASS...
* */

public class Aula21_InheritanceTABLE_PER_CLASS {
	public static void main(String[] args) {
		
		//Primeiro geramos um objeto DAO passando os elementos da classe mãe como parâmetro...
		DAO<StudentTABLE_PER_CLASS> dao = new DAO<>(StudentTABLE_PER_CLASS.class);
		
		//Depois geramos 2 objetos que irão virar ocorrências nas tabelas que forem geradas pelo JPA, onde "Rafates" será
		//uma ocorrência da tabela de estudantes e "Augustino" será uma ocorrência da tabela dos bolsistas. Como o TABLE_
		//PER_CLASS não gera relacionamentos entre as tabelas, um estudante só poderá ser colocado na tabela de estudante
		//e um bolsista só poderá fazer parte da tabela de bolsistas...
		StudentTABLE_PER_CLASS student = new StudentTABLE_PER_CLASS(530L, "Rafates");
		ScholarHolderTABLE_PER_CLASS scholarshipHolder = new ScholarHolderTABLE_PER_CLASS(401L, "Augustino", 1000);
		
		//Abaixo fizemos a inserção atômica das nossas ocorrências. Veja no MySQL que Rafates foi para a tabela de estu-
		//dantes que só tem ele como estudante lá, e essa tabela só possuí 2 colunas, a de registro do estudante e o seu
		//nome. Enquanto Augustino foi para a tabela de bolsistas, onde também ele é a única ocorrência dessa tabela, po-
		//rém, além de ter as colunas de registro e nome, ela também tem a coluna que mostra o valor de bolsa que "Augusti-
		//no" recebe...
		dao
			.atomicInclusion(student)
			.atomicInclusion(scholarshipHolder)
			.close();
		
		//Agora vá até as classes StudentTABLE_PER_CLASS e ScholarHolderTABLE_PER_CLASS para ver como foi feita a implemen-
		//tação nas classes para a herança do tipo TABLE_PER_CLASS...
		
	}
}
