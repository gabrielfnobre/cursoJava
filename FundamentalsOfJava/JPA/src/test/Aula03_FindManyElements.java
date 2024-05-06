package test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.user_example.User_BD;

//	FAZENDO BUSCA PARA VÁRIOS ELEMENTOS NO BANCO DE DADOS:

//	Nós podemos também fazer uma busca maior de elementos no banco de dados em vez de buscar
// 	1 item por vez, veja como...

public class Aula03_FindManyElements {
	public static void main(String[] args) {
		
		//Primeiro, nós criamos um objeto EntityManagerFactory para colher os dados do nosso
		//banco designado no xml, e uma EntityManager para abrir conexão com o banco de da-
		//dos correto.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Abaixo temos uma expressão JPQL. Mas o que raios é uma expressão JPQL?
		//JPQL significa Java Persistence Query Language, a grosso modo é uma linguagem SQL
		//porém orientada a objeto, em vez de ser orientada as entidades do banco de dados.
		//Veja no exemplo abaixo, que em vez de usarmos o nome da tabela no banco de dados,
		//todos os comandos em JPQL são direcionados para os nomes das classes e atributos
		//do objeto.
		String jpql = "SELECT U FROM User_BD U";
		//Aqui temos um objeto do tipo "TypedQuery", que são listas que recebem os resultados
		//da busca feita com jpql a partir de um determinado objeto que foi mapeado em JPA.
		TypedQuery<User_BD> query = em.createQuery(jpql, User_BD.class);
		//O método "setMaxResults" limita a nossa busca a um número "x" de ocorrências...
		query.setMaxResults(5);
		
		//Passamos todas as ocorrências retornadas na lista de TypedQuery para uma lista de
		//usuários que foi armazenada em um List...
		List<User_BD> users = query.getResultList();
		
		//Com a lista armazenada em um List, fica fácil fazer comandos lambda com os nossos
		//objetos do tipo "User_BD"...
		users.forEach(u -> {
			System.out.println("ID: " + u.getId() +
					" | Name: " + u.getName() + 
					"\t| Email: " + u.getEmail());
		});
		
		//=================================================================================
		//SEGUNDO EXEMPLO:
		//=================================================================================
		//Fizemos a mesma busca que foi feita no exemplo acima, mas, em vez de criar um
		//TypedQuery e uma string separada para o JPQL nós atribuímos tudo ao List e dessa
		//vez sem designar um número máximo de ocorrências...
		List<User_BD> users2 = em.createQuery(
				"SELECT U FROM User_BD U",
				User_BD.class
				)
				.getResultList();
		
		users2.forEach(u -> {
			System.out.println("ID: " + u.getId() +
					"\t | Name: " + u.getName() + 
					"\t| Email: " + u.getEmail());
		});
		
		em.close();
		emf.close();
	}
}
