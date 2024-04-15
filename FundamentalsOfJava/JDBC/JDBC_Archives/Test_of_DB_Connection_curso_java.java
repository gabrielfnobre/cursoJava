package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*  Essa classe foi criada apenas com o objetivo de testarmos se a classe "DB_curso_
 	java realmente estava acessando o banco correto.
*/

public class Test_of_DB_Connection_curso_java {
	public static void main(String[] args) throws SQLException {
		
		Connection connection_DB_curso_java = DB_curso_java.getConnection(); 
		Statement stmt = connection_DB_curso_java.createStatement();
		stmt.execute("CREATE DATABASE curso_java");
		System.out.println("Database is created sucessful");
		
		connection_DB_curso_java.close();
	}
}
