package DAO.Archives;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	
	public static List<Person> load(){
		String sql = "SELECT * FROM people";
		ResultSet query;
		List<Person> people = new ArrayList<>();
		try {
			Statement stmt = ConnectionDAO.getConnection().createStatement();
			query = stmt.executeQuery(sql);
			while(query.next()) {
				people.add(new Person(query.getInt("code"), query.getString("name")));
			}
			return people;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void create(String name){
		String sql = "INSERT INTO people (name) VALUES (?)";
		ResultSet query;
		try {
			PreparedStatement stmt = ConnectionDAO.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, name);
			int lineAffected = stmt.executeUpdate();
			if(lineAffected > 0) {
				query = stmt.getGeneratedKeys();
				if(query.next()) {					
					int id = query.getInt(1);
					System.out.println("\n\t" + lineAffected + " line is affected!");
					System.out.println("\tOne new line is created:");
					System.out.println("\tID: " + id + " - " + name);
					
					new Person(query.getInt(1), name);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void read(int id){
		String sql = "SELECT * FROM people WHERE code = ?";
		ResultSet query;
		try {
			PreparedStatement stmt = ConnectionDAO.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, id);
			query = stmt.executeQuery();
			if(query.next()) {
				System.out.println("Register called ---> ID: " + query.getInt("code") + " - " + query.getString("name"));
			} else {
				System.out.println("Register is not exists!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void update(int id, String name){
		String sql = "UPDATE people SET name = ? WHERE code = ?";
		try {
			PreparedStatement stmt = ConnectionDAO.getConnection().prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setInt(2, id);
			stmt.execute();
			System.out.println("Update sucessful");
			read(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(int id){
		String sql = "DELETE FROM people WHERE code = ?";
		int lineAffected;
		try {
			PreparedStatement stmt = ConnectionDAO.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			lineAffected = stmt.executeUpdate();
			if(lineAffected > 0) {				
				System.out.println("Register " + id + " is delete sucessful");
				read(id);
			} else {
				System.out.println("Register " + id + " already not exists");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
