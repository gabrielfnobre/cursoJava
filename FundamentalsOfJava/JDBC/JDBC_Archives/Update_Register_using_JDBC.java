package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//	Veja a explicação da aula após o código abaixo...

public class Update_Register_using_JDBC {
	//Tratamos a excessão checkada de PreparedStatement...
	public static void main(String[] args) throws SQLException {
		
		//Abrimos uma conexão com o banco de dados...
		Connection connection = DB_curso_java.getConnection();
		
		//As variáveis name e code servirão para colhermos o código e o nome da pes-
		//soa que desejamos mudar.
		String name;
		String newCode;
		
		//Abaixo temos 4 tipo de consultas, uma para procurar por um código especí-
		//fico que desejamos modificar, outra para atribuir um nome novo, outra pa-
		//ra atribuir um código novo e outra para mostrar todos os registros.
		String sqlSearch = "SELECT code, name FROM people WHERE code = ?";
		String sqlName = "UPDATE people SET name = ? WHERE code = ?";
		String sqlCode = "UPDATE people SET code = ? WHERE code = ?";
		String sqlAll = "SELECT * FROM people";
		
		//Iniciamos com um PreparedStatement que irá procurar um registro específi-
		//co que for passado pelo usuário.
		PreparedStatement pstmt = connection.prepareStatement(sqlSearch);
		
		//Usamos o Scanner para pegar o registro de usuário via código...
		Scanner into = new Scanner(System.in);
		System.out.print("Informe o código de registro que você deseja alterar: ");
		String code = into.next();
		into.nextLine(); //Esse nextLine() de Scanner serve para limpar o buffer.
		pstmt.setString(1, code);
		
		//Recebemos o valor do registro específico que procuramos para confirmar ao
		//usuário se é esse registro mesmo que ele deseja excluir...
		ResultSet resultCode = pstmt.executeQuery();
		if(resultCode.next()) {
			System.out.println(resultCode.getInt("code") + " - " + resultCode.getString("name"));
			
			//Perguntamos ao usuário se ele gostaria de mudar o nome...
			System.out.print("Gostaria de mudar o nome? (y/n):");
			String confirm = into.next();
			if(confirm.equals("y")) {
				into.nextLine(); //Limpando o buffer para o scanner receber um valor diferente...
				System.out.println("Informe o novo nome: ");
				name = into.nextLine();
				PreparedStatement pstmtName = connection.prepareStatement(sqlName);
				pstmtName.setString(1, name);
				pstmtName.setString(2, code);
				pstmtName.execute();
			}
			
			//Perguntando ao usuário se ele gostaria de mudar o código...
			System.out.println("Gostaria de mudar o código? (y/n):");
			confirm = into.next();
			if(confirm.equals("y")) {
				into.nextLine(); //Limpando o buffer para o scanner receber um valor diferente...
				System.out.println("Informe o novo código: ");
				newCode = into.next();
				PreparedStatement pstmtCode = connection.prepareStatement(sqlCode);
				pstmtCode.setString(1, newCode);
				pstmtCode.setString(2, code);
				pstmtCode.execute();
				code = newCode; //Novo código é atribuído a variável code...
			}
			
			//Mostrando ao usuário o resultado das operações...
			System.out.println("O resultado obtido foi:");
			pstmt = connection.prepareStatement(sqlSearch);
			pstmt.setString(1, code);
			resultCode = pstmt.executeQuery();
			while(resultCode.next()) {
				System.out.println(resultCode.getInt("code") + " - " + resultCode.getString("name"));
			}
			
			//Dando ao usuário a chance de ver todos os registros após o UPDATE...
			System.out.print("Deseja consultar todos os itens atuais? (y/n): ");
			confirm = into.next();
			if(confirm.equals("y")) {
				pstmt = connection.prepareStatement(sqlAll);
				resultCode = pstmt.executeQuery();
				while(resultCode.next()) {
					System.out.println(resultCode.getInt("code") + " - " + resultCode.getString("name"));
				}
			}
		} else { //O else serve para caso o usuário passe um código inexistente...
			System.out.println("Esse registro não existe!\nEsses são os registros atuais:");
			pstmt = connection.prepareStatement(sqlAll); //Todos os registros são mostrados para que o usuário perceba que o código passado realmente não existe.
			resultCode = pstmt.executeQuery();
			while(resultCode.next()) {
				System.out.println(resultCode.getInt("code") + " - " + resultCode.getString("name"));
			}
		}
		
		into.close();
		pstmt.close();
		connection.close();
	}
}


/*	FAZENDO UPDATES COM JDBC
	
	Nesta aula vamos fazer um serviço mais elaborado com UPDATE, onde será possível 
	que, por através do nosso programa, o java nos pergunte se desejarmos fazer UP-
	DATE em algum registro, em qual registro e fazer as mudanças necessárias.
	
	Veja no código acima como fizemos isso...
	
*/





