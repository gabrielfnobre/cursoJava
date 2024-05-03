package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.user_example.User_BD;

public class Aula01_CreateTableAndInsertUser {
	public static void main(String[] args) {
		
		//O EntityManagerFactory, como o próprio nome diz é um Gerenciador de Fábricas de Entidade é por
		//através dele que nós identificamos o banco de dados que queremos operar. Ele recebe como parâ-
		//metro o nome do persistence-unit que nós declaramos no nosso xml.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		
		//O EntityManager, como o próprio nome diz é um Gerenciador de Entidades, por através dele nós
		//podemos estabelecer conexão com o persistence-unit que foi passado, além disso, o EntityMana-
		//ger é uma Interface que possuí os métodos para fazer o CRUD com o Banco de Dados.
		EntityManager em = emf.createEntityManager();
		
		//Aqui instanciamos um objeto mapeado de usuário...
		User_BD newUser = new User_BD("Djalma", "djalma@email.com");
		
		//Ao pedir para persistir o objeto, se o banco de dados não tiver sido criado, ele será criado
		//porém o objeto não será persistido, pois é necessário um comando transacional para que o Hi-
		//bernate funcione.
		em.persist(newUser);
		
		//Temos que fechar a conexão com o banco de dados em com a fábrica de entidades.
		em.close();
		emf.close();
		
	}
}
