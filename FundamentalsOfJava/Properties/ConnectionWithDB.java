package Properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionWithDB {
	public static void main(String[] args) {
		
		Properties prop = GenerateProperties.createProperties();
		testingConnection(prop);
	}
	
	private static void testingConnection(Properties prop) {
		final String url = prop.getProperty("db.url");
			final String user = prop.getProperty("db.user");
			final String password = prop.getProperty("db.password");
			
			try {
				System.out.println("Open connection with Data Base...");
				Connection connection = DriverManager.getConnection(url, user, password);
				
				Statement stmt = connection.createStatement();
				String sql = "SELECT * FROM estados";
				ResultSet result = stmt.executeQuery(sql);
				
				while(result.next()){
					System.out.println(result.getInt("id") + " - "
							+ result.getString("nome") + " | "
							+ result.getString("sigla") + " | "
							+ result.getString("regiao") + " | "
							+ result.getFloat("populacao"));
				}
				
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
