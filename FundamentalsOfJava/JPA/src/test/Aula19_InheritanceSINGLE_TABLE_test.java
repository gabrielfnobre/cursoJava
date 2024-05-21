package test;

import infra.DAO.DAO;
import model.user_example.Inheritance.SINGLE_TABLE.ScholarshipHolder;
import model.user_example.Inheritance.SINGLE_TABLE.Student;

public class Aula19_InheritanceSINGLE_TABLE_test {
	public static void main(String[] args) {
		
		DAO<Student> studentDAO = new DAO<>(Student.class);

		Student student = new Student(104L, "August");
		ScholarshipHolder scholarshipHolder = new ScholarshipHolder(530L, "Fernand", 1000);
		
		studentDAO
			.atomicInclusion(student)
			.atomicInclusion(scholarshipHolder)
			.close();
	}
}
