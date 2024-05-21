package test;

import infra.DAO.DAO;
import model.user_example.Inheritance.JOINED.ScholarshipHolderJoined;
import model.user_example.Inheritance.JOINED.StudentJoined;

public class Aula20_InheritanceJOINED {
	public static void main(String[] args) {
		
		DAO<StudentJoined> studentDAO = new DAO<>(StudentJoined.class);
		
		StudentJoined student = new StudentJoined(104L, "August");
		ScholarshipHolderJoined scholarshipHolder = new ScholarshipHolderJoined(530L, "Ferdnand", 1000);
		
		studentDAO
			.atomicInclusion(student)
			.atomicInclusion(scholarshipHolder)
			.close();
		
	}
}
