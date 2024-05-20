package test;

import java.util.List;

import infra.DAO.DAO;
import model.user_example.Actors;
import model.user_example.Movies;

// USANDO NAMED QUERIES PARA EXECUTAR COMANDOS JPQL

/* No JPA existe uma ferramenta muito poderosa que podemos utilizar para executar comantos jpql sem a necessidade
 * de implementar toda a lógica de uma consulta SQL por através de métodos nas nossas classes ou nos nossos DAOs.
 * Esse método são as famosas "Named Queries".
 * 
 * Named Queries (Consultas Nomeadas), são consultas pré-preparadas, seja na nossa própria classe por através da
 * annotation @NamedQuery ou seja 
 * */

public class Aula16_QueryUsingNamedQueries {
	public static void main(String[] args) {
		
		DAO<Movies> moviesDAO = new DAO<>(Movies.class);
		
		List<Movies> movies = moviesDAO.queryNamed("movies_note_bigger_than", "note", 8.5);
		
		for(Movies movie: movies) {
			System.out.println("\n Movie: " + movie.getName());
			for(Actors actor: movie.getActors()) {
				System.out.println("actor: " + actor.getName());
			}
			System.out.println("\n");
		}
		
		movies = moviesDAO.queryNamed("movies_note_bigger_than", "note", 9.0);
		
		for(Movies movie: movies) {
			System.out.println("\nMovie: " + movie.getName());
			for(Actors actor: movie.getActors()) {
				System.out.println("actor: " + actor.getName());
			}
			System.out.println("\n");
		}
		
		DAO<Actors> actorsDAO = new DAO<>(Actors.class);
		List<Actors> actors = actorsDAO.queryNamedNoParams("show_me_all_actors");
		
		for(Actors actor: actors) {
			System.out.println(actor.getName());
		}
	}
}
