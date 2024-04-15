package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Veja a explicação da aula após o código abaixo...

public class Create_Database {
	public static void main(String[] args) {
				
		try {
			//Conforme exemplo abaixo veja que estabelecemos a conexão com o MySQL 
			//normalmente, como estamos acostumados. Note que não atribuímos nenhum
			//banco de dados, afinal desejamos criar um, não faz sentido que a cone-
			//xão seja pré-estabelecida com um banco específico.
			//Aqui cabe a ressalva de que toda getConnection deve ter a uma checked
			//exception tratada.
			String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
			String user = "root";
			String password = "Gasbre-645050";
			Connection connection = DriverManager.getConnection(url, user, password);
			
			//Abaixo criamos o statement para fazer as nossas declarações SQL que 
			//serão atribuídas ao banco...
			Statement smtm = connection.createStatement();
			smtm.execute("CREATE DATABASE curso_java"); //instrução de criação do banco..
			
			System.out.println("Database is created sucessful!");
			connection.close(); //Sempre fechamos o banco para não termos carregamento de memória desnecessário.
			
		} catch (SQLException e) { //No tratamento de erro incluímos uma mensagem caso alguém tente criar um banco que já existe.
			e.printStackTrace();
			System.out.println("Database already exists!");
		}
		
	}
}


/*	CRIANDO BANCO DE DADOS:

	No exemplo dessa aula vamos mostrar como criar um banco de dados utilizando o
	JDBC. Geralmente isso não é feito durante a produção de banco de dados na vida
	real, pois os bancos geralmente são criados com muito cuidado dentro da própria
	plataforma do SGBD.
	
	Mas a título de exemplo é bom mostrar que todo tipo de comando que é possível 
	fazer em SQL também é possível de ser feito no JDBC.
	
	Veja o código acima para entender o exemplo...

*/

