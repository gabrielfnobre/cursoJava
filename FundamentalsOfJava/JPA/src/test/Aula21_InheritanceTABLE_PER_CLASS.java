package test;

import infra.DAO.DAO;
import model.user_example.Inheritance.TABLE_PER_CLASS.ScholarHolderTABLE_PER_CLASS;
import model.user_example.Inheritance.TABLE_PER_CLASS.StudentTABLE_PER_CLASS;

public class Aula21_InheritanceTABLE_PER_CLASS {
	public static void main(String[] args) {
		
		DAO<StudentTABLE_PER_CLASS> dao = new DAO<>(StudentTABLE_PER_CLASS.class);
		
		StudentTABLE_PER_CLASS student = new StudentTABLE_PER_CLASS(530L, "Rafates");
		ScholarHolderTABLE_PER_CLASS scholarshipHolder = new ScholarHolderTABLE_PER_CLASS(401L, "Augustino", 1000);
		
		dao
			.atomicInclusion(student)
			.atomicInclusion(scholarshipHolder)
			.close();
		
	}
}
