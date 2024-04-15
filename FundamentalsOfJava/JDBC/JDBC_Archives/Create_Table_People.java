package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// Veja a explicação da aula pós o código abaixo...

public class Create_Table_People {
	//Veja que a classe Statement exige que tratemos a sua exceção checkada...
	public static void main(String[] args) throws SQLException {
		
		//Fazemos a conexão utilizando a classe que criamos para facilitar a conexão
		//com o banco "curso_java"...
		Connection connection = DB_curso_java.getConnection();
		Statement stmt = connection.createStatement();
		
		//Aqui segue o comando SQL para a criação da tabela. 
		//Observações: Note que estamos usando uma string dividida e contatenada pa-
		//ra simular um texto escrito com quebra de linha, é possível fazer isso de 
		//uma maneira mais fácil no eclipse, se nós deixarmos o cursor o mouse den-
		//tro da string e apertarmos a tecla "enter" automaticamente o eclipse que-
		//bra a linha fazendo uma concatenação.
		stmt.execute("CREATE TABLE people ("
				+ "code INT AUTO_INCREMENT PRIMARY KEY,"
				+ "name VARCHAR(80) NOT NULL"
				+ ")");
		
		System.out.println("Table is created sucessful");
		connection.close();
	}
}

/*	CRIANDO A TABELA PESSOAS
 	
 	No código acima nós temos a criação de uma tabela utilizando o JBDC, note que 
 	o comando segue o padrão sempre utilizado pelo JBDC, porém na conectividade 
 	nós estamos utilizando a classe DB_curso_java que nós criamos para facilitar 
 	a conectidade com o banco de dados "curso_java".
 	
 	Veja como utilizamos no código acima...
 	
 */