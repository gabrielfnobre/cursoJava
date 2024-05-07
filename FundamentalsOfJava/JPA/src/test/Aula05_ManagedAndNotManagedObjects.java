package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.user_example.User_BD;

//	OBJETO GERIDO E NÃO GERIDO

//	No Hibernate temos o conceito de objeto gerido e não gerido, o que isso significa?
//	Esse termo acontece sempre que estamos falando do contexto transacional, um contexto
//	transacional é quando o Hibernate habilita o Java a fazer mudanças no Banco de Dados,
//	fora do contexto transacional o Hibernate não pode fazer mudanças no Banco de Dados.

//	Porém o contexto transacional tem um grande calcanhar de Aquiles, ele está sempre no
//	automático - ou seja, qualquer mudança feita é realizada na hora - isso é ruim por 
// 	que acaba atrasando o poder de processamento do Hibernate.

//  Essa automatização dos updates é o que chamamos de "gerência de objeto", quando as 
//	atualizações estão habilitadas o Objeto está no contexto de "Objeto gerido", quando
//	estão desabilitadas o objeto está no contexto de "Não Gerido".

//	A boa notícia é que dá para desligar a gerência de objeto e ligá-la somente quando 
//	quisermos. Geralmente, para não carregar nossas aplicações, nós fazemos toda a mani-
//	pulação de dados como objeto "não gerido" e quando os objetos estão manipulados nós
//	fazemos por assim dizer ligamos a chave do "objeto gerido" e todas as atualizações
//	são feitas de uma vez.

//	Veja no exemplo abaixo como fazemos isso...

public class Aula05_ManagedAndNotManagedObjects {
	public static void main(String[] args) {
		
		//Fazemos a ligação do projeto com o banco de dados...
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Criamos um objeto qualquer, pegando uma determinada tupla...
		User_BD user = em.find(User_BD.class, 8L);
		
		//Abrimos o contexto transacional...
		em.getTransaction().begin();
		//Fizemos a mudança do valor...
		user.setName("Gabrielou");
		//Note que a mudança é feita automaticamente, pois o contexto transacional por padrão
		//sempre está como objeto gerido...
		System.out.println(user.getName());
		em.getTransaction().commit();
		
	
		//2º EXEMPLO...
		//Abrimos uma conexão novamente...
		em.getTransaction().begin();
		System.out.println();
		//Usando o método "detach" de EntityManager nós desabilitamos a gerência de objetos...
		em.detach(user);
		//Setamos um novo nome...
		user.setName("Gabriel");
		//Note que a mudança não é feita, no banco em si, pois a gerência de objeto está tran-
		//cada...
		user = em.find(User_BD.class, 8L);
		System.out.println("Resultado com o detach... " + user.getName());

		//Setamos novamente e em seguida usamos o "merge" para habilitar a gerência de objetos...
		user.setName("Gabriel");
		em.merge(user);
		//Note que após isso o valor realmente é mudado em banco...
		System.out.println("Resultado após merge... " + user.getName());
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
