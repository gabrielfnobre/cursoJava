package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//	Veja a explicação da aula após o código abaixo...

public class Delete_with_JDBC {
	//Fizemos o tratamento da excessão checkada de PreparedStatement...
	public static void main(String[] args) throws SQLException {
		
		//Abrimos a conexão com nosso banco de dados...
		Connection connection = DB_curso_java.getConnection();
		
		//Usando o scanner pedimos para o usuário escolher entre 1 das 3 opções...
		Scanner into = new Scanner(System.in);
		System.out.print("Que tipo de exclusão deseja fazer?\n"
				+ "(1) Deleta um registro específico pelo código;\n"
				+ "(2) Deleta todos os registros entre dois valores de código passados;\n"
				+ "(3) Deleta todos os registros a partir de um valor de código passado;\n\n"
				+ "Escolha uma das opções acima: ");
		int code = into.nextInt();
		into.nextLine(); //Para limpar o buffer do scanner...
		
		//Temos 3 comandos DELETE diferentes para fazer os 3 tipos de operação...
		String sqlOne = "DELETE FROM people WHERE code = ?";
		String sqlBetween = "DELETE FROM people WHERE code >= ? AND code <= ?";
		String sqlBiggerThan = "DELETE FROM people WHERE code >= ?";
		
		//Inicializamos as variáveis do PreparedStatement que executará um determina-
		//do comando SQL a partir do valor que foi passado pelo usuário ao escolher 
		//as opções, e uma variável contadora que receberá o número de linhas afeta-
		//das por através do método "executeUpdate"...
		PreparedStatement pstmt;
		int lines_affected = 0;
		
		//Aqui temos a condicional caso o usuário deseje deletar apenas 1 registro...
		if(code == 1) {
			pstmt = connection.prepareStatement(sqlOne);
			
			System.out.print("Qual o código do registro a ser deletado? ");
			String codeDelete = into.next();
			into.nextLine(); //Para limpar o buffer do scanner...
			
			pstmt.setString(1, codeDelete);
			
			lines_affected = pstmt.executeUpdate(); //O comando é executado e o número de linhas afetadas é capturado.
			
		} else if(code == 2) { //Aqui temos a condicional para deletar valores entre 2 códigos passados...
			pstmt = connection.prepareStatement(sqlBetween);
			
			System.out.print("De qual até qual valor você deseja deletar?\n"
					+ "Digite o 1º Valor: ");
			String codeFirstValue = into.next();
			into.nextLine();
			System.out.print("Digite o 2º valor: ");
			String codeSecondValue = into.next();
			into.nextLine();
			
			pstmt.setString(1, codeFirstValue);
			pstmt.setString(2, codeSecondValue);
			
			lines_affected = pstmt.executeUpdate(); //O comando é executado e o número de linhas afetadas é capturado.
			
		} else if(code == 3) { //Aqui temos a condicional para deletar valores a partir de 1 código passado para todos os valores acima...
			pstmt = connection.prepareStatement(sqlBiggerThan);
			
			System.out.print("A partir de qual valor deseja fazer a exclusão? ");
			String codeValue = into.next();
			pstmt.setString(1, codeValue);
			
			lines_affected = pstmt.executeUpdate(); //O comando é executado e o número de linhas afetadas é capturado.
		}
		
		//Aqui temos uma condicional para exibir se alguma alteração foi feita ou não
		if(lines_affected <= 0) {
			System.out.println("Nenhuma linha foi afetada.");
		} else {
			System.out.println("Exclusão feita com sucesso!");
		}
		
		System.out.println("Linhas afetadas: " + lines_affected);
		
		into.close();
		connection.close();
	}
}

/*	DELETANDO REGISTROS COM JDBC

	Nesta aula vamos treinar a exclusão de registros. Geralmente quando desejamos 
	fazer a exclusão de registros num banco de dados usamos 3 tipos de operações 
	diferentes:
	
		* Excluir 1 registro específico;
		* Excluir vários registros entre um valor e outro;
		* Excluir vários registros a partir de 1 determinado valor;
		
	Fizemos um programa acima onde o usuário poderá escolher entre 1 destas 3 opcões
	e fazer a exclusão a partir de valores passados por ele.
	
	Lembrando que, sempre que usamos UPDATE e DELETE no SQL não podemos esquecer de
	forma alguma da cláusula WHERE, do contrário, todos os nossos registros da ta-
	bela serão perdidos.
	
	Veja acima como fizemos as exclusões...

*/





