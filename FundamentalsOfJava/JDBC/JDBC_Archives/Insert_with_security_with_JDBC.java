package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// 	Veja a explicação da aula logo após o código...

public class Insert_with_security_with_JDBC {
	//Passamos a exceção checkada do PreparedStatement para frente...
	public static void main(String[] args) throws SQLException {
		
		//Abrimos uma conexão com o nosso banco de dados.
		Connection connection = DB_curso_java.getConnection();
		
		//Utilizaremos o scanner para pegar os nomes dos usuários que desejamos...
		Scanner intoName = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String name = intoName.nextLine();
		
		//Aqui vemos a string que usuaremos para o PreparedStatement, note que no 
		//lugar de usarmos concatenação, nós colocamos os valores que vamos atri-
		//buir em formato de "?", quando o PreparedStatement encontra essas inter-
		//rogações ele sabe que elas são para inserção de valores e gera um índice
		//para cada interrogação (iniando para o falor 1).
		String sql = "INSERT INTO people (name, code) VALUES (?, ?)";
		
		//Aqui temos a criação do nosso objeto PreparedStatement, note que primei-
		//ro nós atribuímos a string ao método prepareStatement e só depois passa-
		//mos os valores que foram capturados a partir do usuário...
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, name); //Para inserir strings usamos o "setString"
		stmt.setInt(2, 100); //Para inserir inteiros o "setInt"
		stmt.execute();

		System.out.println("Name is assigned sucessful!");
		
		intoName.close();
		connection.close();
		
	}
}

/*	INSERÇÃO SEGURA COM JDBC
 
 	Nessa aula aprendemos a fazer inserções seguras no nosso banco de dados a partir
 	do JDBC. Por que inserções seguras? Por que no mundo dos Bancos de Dados existe 
 	um método de ataque muito famoso chamado "SQL injection".
 	
 	Esse tipo de ataque consiste em aplicar um comando SQL por através da entrada de
 	dados do usuário para aplicar algum tipo de golpe ou dano ao banco de dados, sen-
 	do capaz até de excluir um banco de dados inteiro ou ter acesso a informações 
 	sensíveis.
 	
 	Geralmente esse ataque tem sucesso quando desenvolvedores cometem um erro classí-
 	co ao desenvolverem seus bancos de dados: "a concatenação de strings". Por que 
 	uma simples concatenação é tão perigosa? Imagine que o seu comando SQL seja seja
 	uma string que contenha o seguinte comando...
 	
 		"INSERT INTO table (column) VALUES ('" + value + "');
 		
 		Um usuário honesto poderia passar apenas os dados que precisa, mas um malfei-
 		tor poderia passar algo do tipo:
 		
 		value'); DELETE * FROM people WHERE ('1' = '1
 		
 		Percebe agora o perigo de um usuário passar esse comando por através de um 
 		campo de entrada? Ele iria deletar toda a sua tabela!
 		
 	Para evitar esse tipo de ataque o JDBC utiliza uma classe especial chamada Pre-
 	paredStatement que em vez de contateção de strings, ela utiliza indexação de 
 	valores para inserção de valores por parte do usuário, isso tudo controlado 
 	dentro do código, onde o usuário não tem acesso.
 	
 	Veja como podemos fazer isso no exemplo acima...
 
 */





