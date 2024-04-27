package DAO.Archives;

import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		
		List<Person> people = PersonDAO.load();
		
		for(Person p: people) {
			System.out.println(" ID: " + p.getId() + " - " + p.getName());
		}
		System.out.println();
		
		PersonDAO.create("Rafates");
		PersonDAO.read(111);
		PersonDAO.update(111, "Mary Cate");
		PersonDAO.delete(118);
		
		for(Person p: people) {
			System.out.println(" ID: " + p.getId() + " - " + p.getName());
		}
		System.out.println();
		
		PersonDAO.create("Abelha");
		
	}
}
