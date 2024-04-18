package JDBC.JDBC_Archives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class Update_Register_using_JDBC {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DB_curso_java.getConnection();
		String name;
		String newCode;
		String sqlSearch = "SELECT code, name FROM people WHERE code = ?";
		String sqlName = "UPDATE people SET name = ? WHERE code = ?";
		String sqlCode = "UPDATE people SET code = ? WHERE code = ?";
		String sqlAll = "SELECT * FROM people";
		
		PreparedStatement pstmt = connection.prepareStatement(sqlSearch);
		
		Scanner into = new Scanner(System.in);
		System.out.print("Informe o código de registro que você deseja alterar: ");
		String code = into.next();
		into.nextLine();
		pstmt.setString(1, code);
		
		ResultSet resultCode = pstmt.executeQuery();
		if(resultCode.next()) {
			System.out.println(resultCode.getInt("code") + " - " + resultCode.getString("name"));
			
			System.out.print("Gostaria de mudar o nome? (y/n):");
			String confirm = into.next();
			if(confirm.equals("y")) {
				into.nextLine();
				System.out.println("Informe o novo nome: ");
				name = into.nextLine();
				PreparedStatement pstmtName = connection.prepareStatement(sqlName);
				pstmtName.setString(1, name);
				pstmtName.setString(2, code);
				pstmtName.execute();
			}
			
			System.out.println("Gostaria de mudar o código? (y/n):");
			confirm = into.next();
			if(confirm.equals("y")) {
				into.nextLine();
				System.out.println("Informe o novo código: ");
				newCode = into.next();
				PreparedStatement pstmtCode = connection.prepareStatement(sqlCode);
				pstmtCode.setString(1, newCode);
				pstmtCode.setString(2, code);
				pstmtCode.execute();
				code = newCode;
			}
			
			System.out.println("O resultado obtido foi:");
			pstmt = connection.prepareStatement(sqlSearch);
			pstmt.setString(1, code);
			resultCode = pstmt.executeQuery();
			while(resultCode.next()) {
				System.out.println(resultCode.getInt("code") + " - " + resultCode.getString("name"));
			}
			
			System.out.print("Deseja consultar todos os itens atuais? (y/n): ");
			confirm = into.next();
			if(confirm.equals("y")) {
				pstmt = connection.prepareStatement(sqlAll);
				resultCode = pstmt.executeQuery();
				while(resultCode.next()) {
					System.out.println(resultCode.getInt("code") + " - " + resultCode.getString("name"));
				}
			}
		} else {
			System.out.println("Esse registro não existe!\nEsses são os registros atuais:");
			pstmt = connection.prepareStatement(sqlAll);
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
