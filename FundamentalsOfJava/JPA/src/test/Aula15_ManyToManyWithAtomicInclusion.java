package test;

import infra.DAO.DAO;
import model.user_example.Actors;
import model.user_example.Movies;

// MUITOS PARA MUITOS COM INCLUSÃO ATÔMICA!

/* Na aula anterior vimos como podemos gerar um relacionamento N:M entre duas classes que mapeiam essa relação com o 
 * Banco de Dados. Porém, vimos como a inclusão ficou trabalhosa, pois tínhamos que lembrar toda vez de fazer a in-
 * clusão de forma bi-direcional entre as 2 classes, do contrário teríamos inconsistências nas nossas entidades.
 * 
 * Nesta aula vamos ver como podemos fazer essa inclusão de uma forma mais rápida e sem se preocupar com a inclusão
 * correta dos dados nas 2 tabelas.
 * 
 * Vamos fazer um relacionamento muitos para muitos entre as tabelas Actors e Movies, onde um ator pode ter partici-
 * pado de vários filmes, assim como vários filmes podem ter vários atores neles.
 * 
 * Veja também as classes Actors e Movies para ver as implementações...
 * */

public class Aula15_ManyToManyWithAtomicInclusion {
	public static void main(String[] args) {
		
		//Começamos criando os nossos atores...
		Actors harrison = new Actors("Harrison Ford");
		Actors carrie = new Actors("Carrie Fisher");
		
		//Depois geramos os nossos filmes...
		Movies starWars = new Movies("Star Wars", 9.3);
		Movies indianaJhones = new Movies("Indiana Jhones", 8.9);
		
		//Após isso, veja como a inclusão foi fácil...
		starWars.addActors(harrison);
		starWars.addActors(carrie);
		
		indianaJhones.addActors(harrison);
		
		//Depois geramos um objeto DAO passando a classe Movie para que ela capture todas as características neces-
		//sárias dessa classe, pois vamos querer gerar uma inserção atômica, por isso o DAO tem que conhecer todas
		//as características da classe e os objetos que ela vai precisar da outra classe para fazer uma inserção 
		//em cascade...
		DAO<Movies> dao = new DAO<>(Movies.class);
		
		//Agora note que, fazemos apenas a inserção do filme "Star Wars" e milagrosamente, todos os demais filmes
		//dos atores que passamos em Star Wars são inclusos inclusive o filme do "Indiana Jhones", afinal o JPA
		//reconhece que o ator "Harrison Ford" também fez esse filme, por isso ele também faz a inclusão deste
		//filme!
		dao.atomicInclusion(starWars);
		
		//E aqui fechamos a conexão, veja agora as classes Movies e Actors para entender melhor como fizemos essa
		//implementação...
		dao.close();
	}
}
