package test;

import java.util.List;

import infra.DAO.DAO;
import model.user_example.Actors;
import model.user_example.Movies;

// USANDO NAMED QUERIES PARA EXECUTAR COMANDOS JPQL

/* No JPA existe uma ferramenta muito poderosa que podemos utilizar para executar comantos jpql sem a necessidade
 * de implementar toda a lógica de uma consulta SQL criando métodos nas nossas classes mapeadas ou nos nossos 
 * DAOs. Podemos apenas criar um método genérico que poderá executar qualquer comando SQL por através de jpql, es-
 * sa ferramenta poderosa são as Named Queries.
 * 
 * Named Queries são consultas jpql que podemos armazenar em um arquivo xml externo ou na própria classe por atra-
 * vés da annotation "@NamedQuery", onde podemos passar um nome para uma consulta jpql e poderemos chamar essa 
 * consulta quando desejarmos por através do seu nome, passando todos os parâmetros que o jpql pedir.
 * 
 * Veja como podemos fazer isso, vamos usar os 2 exemplos, tanto usando Named Queries num arquivo externo chamado
 * "orm.xml" quando na própria classe Actors, onde vamos fazer algumas consultas nomeadas...
 * */

public class Aula16_QueryUsingNamedQueries {
	public static void main(String[] args) {
		
		//Note que geramos um objeto DAO passando os parâmetros de Movies...
		DAO<Movies> moviesDAO = new DAO<>(Movies.class);
		
		//Usando uma Named Query chamada "movies_note_bigger_than" vamos chamar uma jpql que consulta todos os fil-
		//mes que tiverm nota igual ou maior a nota que passarmos como parâmetro no nosso método "queryNamed" esse
		//método irá nos retornar não apenas uma lista com os nomes dos filmes, mas como usamos "fetch" no jpql, 
		//também poderemos capturar os nomes dos atores que participaram nestes filmes, veja...
		List<Movies> movies = moviesDAO.queryNamed("movies_note_bigger_than", "note", 8.5);
		
		//Usando laços for encadeados vamos pegar o nome dos filmes e os nomes dos atores que participaram neles...
		for(Movies movie: movies) {
			System.out.println("\n Movie: " + movie.getName());
			for(Actors actor: movie.getActors()) {
				System.out.println("actor: " + actor.getName());
			}
			System.out.println("\n");
		}
		
		//Note que os valores pegos na consulta muda quando aumentamos o parâmetro da nota dos filmes para 9...
		movies = moviesDAO.queryNamed("movies_note_bigger_than", "note", 9.0);
		
		for(Movies movie: movies) {
			System.out.println("\nMovie: " + movie.getName());
			for(Actors actor: movie.getActors()) {
				System.out.println("actor: " + actor.getName());
			}
			System.out.println("\n");
		}
		
		
		//Aqui temos um segundo exemplo, esse se baseia numa Named Query gerada dentro da classe e não dentro de
		//um arquivo xml externo. Geramos um Objeto DAO passando a classe "actors" como parâmetro...
		DAO<Actors> actorsDAO = new DAO<>(Actors.class);
		
		//Por através de um método do DAO que recebe como parâmetro apenas o nome da Named Query, vamos querer cap-
		//turar todos os registros que existirem na tabela actors por através da jpql "show_me_all_actors"...
		List<Actors> actors = actorsDAO.queryNamedNoParams("show_me_all_actors");
		
		//E aqui fazemos um for para mostrar os nomes de todos os registros...
		for(Actors actor: actors) {
			System.out.println(actor.getName());
		}
		
		//Veja nos arquivos "orm.xml", "persistence.xml" e nas classes: "DAO" e "Actors" como as Named Queries fo-
		//ram implementadas...
	}
}
