package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// Veja explicação da aula após o código abaixo...

public class ConnectionTest {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSSL=true";
		/*	Explicação da url:
		   
		   	* jdbc:mysql 
		   		Identifica o tipo de driver que o jbdc irá utlizar, se 
		   		fosse outro SGBD no lugar o mysql, usaríamos o nome do sgbd em vez de 
		   		"mysql";
		   
		    * localhost:3306/wm
				
				"localhost" Refere-se ao IP da máquina que vamos buscar o banco de 
				dados, se não fosse o IP local, iríamos procurar por outro;
				
				"3306" se refere a porta que será utilizada no servidor. No caso do
				mysql, como a porta padrão é a 3306, não haveria necessidade de nem 
				mesmo usar o número da porta, mas colocamos a título de exemplo. Mas
				caso o MySQL estivesse atribuído a outra porta, deveríamos colocar
				explícitamente o número da porta correta;
				
				"/wm" se refere ao nome do banco que estamos utilizando, devemos co-
				locar o nome do banco neste caso;
				
				"?" o sinal de interrogação em qualquer busca por URL se refere a 
				entrada de parâmetros, significa que vamos passar parâmetros para o
				SGBD para que possamos fazer uma busca mais específica, passar coman-
				dos e coisas do tipo;
				
				"verifyServerCertificate=false" se refere a um certificado de segu-
				rança do banco de dados. No nosso caso não precisamos dessa certifi-
				cação, por isso nós mudamos a flag para "false";
				
				"&" é um separador de parâmetros da URL e também uma condicional pa-
				ra buscar parâmetros diferentes por através da condicional "AND";
				
				"useSSL=true" se refere ao uso de SSL para fazer uma conexão segura
				entre o jdbc e o banco de dados;
				
			*  
		 * */
		final String user = "root"; //nome do servidor
		final String password = "Gasbre-645050"; //senha
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		/*	Criamos uma conexão por através da classe "Connection, usando o Driver-
			Manager e o método "getConnection" passando a url, o nome do servidor e
			a senha para estabelecer uma conexão entre o JDBC e o banco de dados.
			
			OBSERVAÇÃO IMPORTANTE!!!
			O método getConnection de DriverManager possuí uma excessão checkada do
			tipo SQLException, nós temos que resolvê-la por através de um try-catch
			ou passá-la para frente usando throws. No caso deste exemplo, estamos
			usando throws.
		 */
		
		String sql = "SELECT * FROM estados;";
		/*	Criamos uma string com o comando SQL que desejamos executar */
		
		Statement stmt = connection.createStatement();
		/*	Por através da classe "Statement" nós iremos fazer a ponte entre as
			declarações SQL e a conexão com o banco de dados, para que o banco pos-
			sa receber os comandos SQL.
		*/
		
		ResultSet result = stmt.executeQuery(sql);
		/*	O ResultSet recebe um array de string com todos os valores do banco de
			dados por através do método "executeQuery".
		*/
		
		while(result.next()) {
			System.out.println(result.getString("nome"));
		}
		/*	Usamos o while para imprimir todos os valores pegos na coluna "nome". */
		
		connection.close();
		/*	Aqui fechamos a conexão com o banco de dados. Isso é importante para 
			evitar o carregamento desnecessário de memória;
		*/
	}

}

/*	ESTABELECIMENTO DE CONEXÃO COM BANCO A DADOS
	
	Para que possamos estabelecer uma conexão com o Banco de Dados usando o JDBC é 
	necessário que tenhamos o driver do SGBD que queremos utilizar. Neste exemplo
	vamos utilizar o MySQL (veja a observação).
	
	Para fazer essa conexão vamos precisar de usar classes e métodos do java.sql, 
	uma biblioteca embutida do Java que nos permite fazer essa conexão. Veja no 
	exemplo acima como podemos utilizar...

	OBS: Baixe o driver do mysql procurando por "mysql driver jdbc download" baixan-
	do o "connector/J", você irá receber um arquivo .jar que poderá ser incluso ao 
	build path do seu projeto.
*/

