package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*	Essa é uma classe criada apenas com o objetivo de acessarmos ao Banco de Dados
 	curso_java de uma forma mais fácil sem ter que ficar passando url, login e senha
 	toda vez.
*/

public class DB_curso_java {
	
	public static Connection getConnection() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
			String user = "root";
			String password = "Gasbre-645050";
			
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
		
	}
	
}
