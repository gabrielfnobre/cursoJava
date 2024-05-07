package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.user_example.User_BD;

// REMOVENDO ELEMENTOS

//	Para remover elementos no Hibernate também é muito fácil, lembrando que para
//	remover elementos no Hibernate é necessário que o método "remove" esteja 
//	dentro de um contexto transacional.

//	Veja o exemplo abaixo para entender melhor...

public class Aula06_DeleteElement {
	public static void main(String[] args) {
		
		//Primeiro abrimos uma conexão com o banco de dados...
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Capturamos um objeto do banco para ser removido...
		User_BD user = em.find(User_BD.class, 19L);
		
		//Fazemos o teste para ver se o elemento existe...
		if(user != null) {
			//Note que apesar de usarmos o comando remove, ele não funciona se 
			//não estiver dentro de um contexto transacional...
			em.remove(user);
			System.out.println("Não acontece nada sem o transaction!!! \n");
		}
		
		//Fazemos o teste para ver se o elemento existe...
		if(user != null) {
			//Note que dentro do contexto transacional nós conseguimos fazer a 
			//remoção.
			em.getTransaction().begin();
			em.remove(user);
			System.out.println("Com o transaction o " + user.getName() + " foi removido!!!");
			em.getTransaction().commit();
		}
		
		em.close();
		emf.close();
		
	}
}
