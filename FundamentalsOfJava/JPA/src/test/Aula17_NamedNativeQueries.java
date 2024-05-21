package test;

import infra.DAO.DAO;
import model.user_example.MovieNote;

// USANDO NAMED NATIVE QUERIES

/* Named Native Queries são muito semelhantes as Named Queries, ambas permitem que utilizemos código SQL interno
 * ou externo nas nossas aplicações JPA, porém, enquanto as Named Queries utilizam jpql para fazer operações SQL
 * diretamente sobre os objetos em vez de as tabelas, o Named Native Query utiliza diretamente o SQL, fazendo 
 * operações diretas sobre as tabelas.
 * 
 * A vantagens de desvantagens em relação as Named Queries e as Named Native Queries:
 * 
 * 	Named Queries:
 * 		* Vantagens: Por usar jpql elas se tornam portáteis, pois podem ser operadas sobre qualquer banco de da-
 * 					dados atribuídos ao JPA. Trabalham somente sobre as entidades mapeadas, o que garante certa
 * 					segurança ao banco de dados e a validação da conexão com o banco da dados é feita no momen-
 * 					to da instacialização do EntityManagerFactory, evitanto falhas em tempo de execução;
 * 
 * 		* Desvantagem: Só pode ser operada sobre entidades diretamente, não podemos gerar uma classe não mapea-
 * 						da só para trazer resultados, todas tem que ser mapeadas. Além disso, ela não suporta
 * 						comandos SQL diretamente, não sendo capaz de fazer algumas consultas que só são possí-
 * 						veis em SQL;
 * 
 * 	Named Native Queries:
 * 		* Vantagens: Podem usar SQL diretamente, ou seja, qualquer comando que for possível utilizar usando o
 * 					SQL também será possível de usar nas Named Native Queries. Trazem resultados mais rápidos
 * 					do que queries feitas em jpql, pois não precisam de fazer uma série de validações feitas
 * 					no jpql, e não precisam transformar jpql em SQL para operar sobre o BD. Podem ser opera-
 * 					das sobre classes não mapeadas, através de um simples comando SQL podemos trazer resulta-
 * 					dos de consultas rápidas sem a necessidade de mapear uma classe para isso. Sem falar que 
 * 					podem fazer consultas bem mais complexas que o jpql.
 * 
 * 		* Desvantagens: Não são muito boas para inserções e updates, pois perdemos todas as validações e in-
 * 						terações com os nosso objetos nas classes, o que nos daria mais flexibilidade e con-
 * 						fiança quanto as validações. Sem falar que perdemos a validação da conexão com o BD
 * 						que temos no Named Query, se houver falha na conexão ela ocorrerá em tempo de execu-
 * 						ção.
 * 
 * Veja abaixo um exemplo de Named Native Query que utilizamos na classe "MovieNote", uma classe não mapeada
 * pelo JPA, para criarmos o nosso comando SQL geramos ele dentro de uma tag "named-native-query" no nosso
 * arquivo orm.xml, vale a pena dar uma olhada...
 * */

public class Aula17_NamedNativeQueries {
	public static void main(String[] args) {
		
		//Geramos um DAO para termos a conexão com o banco de dados, passando a classe não mapeada "Movie-
		//Notes...
		DAO<MovieNote> movieNote = new DAO<>(MovieNote.class);
		
		//Utilizamos também um método "queryAverageMovies" criado especificamente para esse exemplo, para
		//capturarmos o valor de média dos filmes por através do nome da nossa Named Native Query...
		Double average = movieNote.queryAverageMovies("getGeneralAverageOfMovies").getAverage();
		
		//Veja o valor da média...
		System.out.printf("%.1f", average);
	}
}
