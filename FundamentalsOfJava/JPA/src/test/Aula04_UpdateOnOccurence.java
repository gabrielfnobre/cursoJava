package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.user_example.User_BD;

// FAZENDO UPDATE DE UM REGISTRO PELO HIBERNATE

//	Veja abaixo como podemos fazer update das ocorrências usando o Hibernate...

public class Aula04_UpdateOnOccurence {
	public static void main(String[] args) {
		
		//Primeiro fazemos abrimos a interação com o Banco de Dados...
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Para fazer Updates é necessário que o Hibernate abra uma transação, somente com a
		//transação é possível fazer alterações....
		em.getTransaction().begin();
		
		//Depois escolhemos o registro que queremos fazer o update, usando o find...
		User_BD user = em.find(User_BD.class, 7L);
		
		//Usando os métodos setters comumente usados na orientação a objeto nós atribuímos
		//os valores novos que desejamos que a ocorrência tenha...
		user.setName("Fagundes");
		user.setEmail("fagundes@mail.com");
		
		//Também é necessário fazer um commit, para que o Hibernate possa finalizar a ope-
		//ração...
		em.getTransaction().commit();
		
		System.out.println(user.getName());
		
		em.close();
		emf.close();
		
	}
}
