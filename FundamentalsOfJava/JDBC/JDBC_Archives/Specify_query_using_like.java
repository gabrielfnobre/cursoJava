package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//	Veja a explicação da aula logo após o código...

public class Specify_query_using_like {
	//Tratamos a exceção checkada de PreparedStatement...
	public static void main(String[] args) throws SQLException {
		
		//Abrimos uma conexão com o banco de dados...
		Connection connection = DB_curso_java.getConnection();
		
		//Note que no nosso select usamos a palavra reservada "LIKE" para encontrar
		//qualquer texto que for passado pelo usuário, mas não usamos o sinal de 
		//escape na string, isso por que na classe PreparedStatement o sinal de es-
		//cape "%" é interpretado como um texto literal, mesmo que coloquemos as 
		//áspas sobre ele, e por isso ele não encontra a interrogação como índice 
		//do PreparedStatement para fazer a atribuição de valor.
		//Lembrando que optamos por usar o PreparedStatement por causa da segurança
		//contra SQL Injection.
		String sql = "SELECT * FROM people WHERE name LIKE ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		//Usamos o scanner para pegar o texto passado pelo usuário...
		Scanner value = new Scanner(System.in);
		System.out.println("Gets all names that contains: ");
		String name = value.nextLine();
		
		//Veja que fizemos a concatenação dos escapes dentro do método "setString"
		//dessa forma o PreparedStatement passa o valor corretamente para o execute-
		//Query logo abaixo...
		pstmt.setString(1, "%" + name + "%");
		ResultSet result = pstmt.executeQuery(); //Retornamos a busca para um ResultQuery...
		
		//Usamos um while para retornar a busca e imprimir todos os valores que contém
		//a palavra que foi passada pelo usuário...
		while(result.next()) {
			System.out.println(result.getString("name"));
		}
		
		value.close();
		connection.close();
		
	}
}

/*	ESPECIFICANDO CONSULTAS COM O USO DO LIKE

	No SQL nós podemos especificar nossas consultas ao banco a partir de um texto
	passado onde nós desejamos que todos os registros que tenham esse texto, ou 
	comecem, ou finalizem com um determinado texto sejam encontadas.
	
	Para isso usamos a palavra reservada "LIKE" e o escape de "%" que determina no
	SQL o seguinte: 
		
		%palavra = esse escape determina que todo registro que tenha quaisquer ca-
					racteres antes do texto "palavra" sejam encontrados;
					
		palavra% = esse escape determina que todo registro que comece com o texto
					"palavra" e termine com qualquer texto, sejam encontrados;
					
		%palavra% = esse escape determina que qualquer resgistro que contenha o
					texto "palavra" seja encontrado, não importa onde esteja loca-
					lizado o texto.
					
	Neste exemplo vamos usar a palavra reservada LIKE e o escape % para que o JDBC
	possa encontrar todos os registros que contenham a palavra que for passada por
	nós por através do scanner.
	
	Veja no código acima como fizemos...
*/



