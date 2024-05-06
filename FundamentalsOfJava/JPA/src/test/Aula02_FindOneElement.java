package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.user_example.User_BD;

// ENCONTRANDO ELEMENTOS POR ATRAVÉS DO ID...
//	Nessa aula vimos brevemente como fazer um select de um elemento por através de seu ID
//	Veja o código abaixo para relembrar...

public class Aula02_FindOneElement {
	public static void main(String[] args) {
		
		//Primeiro, como vimos na aula 01 precisamos estabelecer uma conexão com o banco de dados
		//passado no persistence.xml...
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Criamos uma pequena lista e um consumer para capturar os nomes pegos no BD...
		List<String> names = new ArrayList<String>();
		Consumer<String> printNames = p -> System.out.println(p);
		
		//Aqui criamos uma instancia de usuário que vamos usar várias vezes...
		User_BD user; 
		
		//Por através da instância nós usamos o objeto de User_BD passando o nosso EntityManager 
		//usando o método "find", esse método é capaz de capturar um elemento pelo Id que foi 
		//passado.
		user = em.find(User_BD.class, 1L); //O método precisa de receber o objeto da classe e o id do elemento...
		names.add(user.getName()); //--> Djalma

		user = em.find(User_BD.class, 6L); //Note que para cada id passado, temos um resultado diferente no getName...
		names.add(user.getName()); //--> Ethan

		user = em.find(User_BD.class, 7L);
		names.add(user.getName()); //--> Fábio

		user = em.find(User_BD.class, 10L);
		names.add(user.getName()); //--> Igor
		
		//OBSERVAÇÃO IMPORTANTE:
		//A classe User_BD precisa ter um método construtor padrão para que possamos capturar elementos
		//para leitura!!! Do contrário teremos um InstantiationException no nosso Hibernate.
		
		//Imprimindo a lista de nomes...
		names.forEach(printNames);
		
		em.close();
		emf.close();
		
	}
}
