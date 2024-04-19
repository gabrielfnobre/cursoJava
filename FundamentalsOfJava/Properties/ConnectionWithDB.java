package Properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionWithDB {
	//Veja que na nossa classe main pegamos o arquivo .properties por através do mé-
	//todo da classe "GenerateProperties" e usando o método "testingConnection" vamos
	//capturar os valores do arquivo ".properties" e fazer um teste de acesso ao ban-
	//co de dados.
	public static void main(String[] args) {
		
		Properties prop = GenerateProperties.createProperties();
		testingConnection(prop);
	}
	
	//Esse método estabelece a lógica de captura e acesso ao banco de dados por a-
	//través de um arquivo ".properties"...
	private static void testingConnection(Properties prop) {
		final String url = prop.getProperty("db.url"); //Capturando valor a partir da chave para a url...
		final String user = prop.getProperty("db.user"); //Capturando valor a partir da chave para user...
		final String password = prop.getProperty("db.password"); //Capurando valor a partir da chave para password...
			
		//O try catch trata erros de conexão com banco de dados...
		try {
			System.out.println("Open connection with Data Base...");
			Connection connection = DriverManager.getConnection(url, user, password); //Gerando conexão a partir dos valores armazenados...
			
			//Passando comandos SQL ao banco MySQL e recebendo dados...
			Statement stmt = connection.createStatement();
			String sql = "SELECT * FROM estados";
			ResultSet result = stmt.executeQuery(sql);
			
			//Mostrando dados recebidos para provar que a conexão aconteceu...
			while(result.next()){
				System.out.println(result.getInt("id") + " - "
						+ result.getString("nome") + " | "
						+ result.getString("sigla") + " | "
						+ result.getString("regiao") + " | "
						+ result.getFloat("populacao"));
			}
				
			connection.close(); //Encerrando conexão...
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
