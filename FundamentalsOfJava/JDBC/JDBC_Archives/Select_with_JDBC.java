package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//	Veja a explicação da aula após o código abaixo...

public class Select_with_JDBC {
	//Temos um tratamento de exceção checkada gerada pelo Statement...
	public static void main(String[] args) throws SQLException {
		
		//Aqui temos a geração na nossa conexão com o banco de dados e a criação de
		//um List que irá armazenar nossos objetos da classe Person...
		Connection connection = DB_curso_java.getConnection();
		List<Person> person = new ArrayList<Person>();
		
		//Aqui temos o nosso comando SELECT que busca por todos os registros da ta-
		//bela People...
		String sql = "SELECT * FROM people";
		
		//Precisaremos de um ResultSet para pegar todos os dados da tabela e nos de-
		//volver um array de dados onde poderemos colher as informações pelo índice
		//ou nome da coluna.
		Statement stmt = connection.createStatement();
		ResultSet result = stmt.executeQuery(sql); //executeQuery traz o array de dados
		
		//O while adiciona os objetos "Person" na List de Persons...
		while(result.next()) {
			person.add(new Person(result.getInt("code"), result.getString("name")));
		}
		
		//O laço for nos imprime cada resgistro que foi transformado em objeto da
		//classe "Person"...
		for(Person p: person) {
			System.out.println(p.getCode() + ": " + p.getName());
		}
		
		//Aqui fechamos a conexão com o banco de dados para evitar carregamento de 
		//memória desnecessário...
		stmt.close();
		connection.close();
		
	}
}

/*	SELECT UTILIZANDO O JDBC
 
 	Essa aula exemplifica como podemos usar o SELECT para fazer consultas no JDBC,
 	mas não apenas isso, ela também mostra como podemos passar dados pegos em uma 
 	tabela e redesenhá-los em um objeto de uma classe da nossa aplicação.
 	
 	Para isso criamos uma classe com o nome "Person" para simular os registros da
 	tabela "People" no nosso banco de dados. A classe Person é tão simples quanto
 	o banco de dados, possuí um constructor para pegar o código e o nome da pessoa
 	registrada no banco, assim como no banco temos apenas esses detalhes, o nome e
 	o código da pessoa. (Poderá dar uma olhada na classe "Person" que está nessa 
 	mesma pasta)
 	
 	Veja acima como o código foi implementado...
 
 */




