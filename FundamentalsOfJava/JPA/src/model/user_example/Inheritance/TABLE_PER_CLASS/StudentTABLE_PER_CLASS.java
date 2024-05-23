package model.user_example.Inheritance.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "student_table_per_class")
public class StudentTABLE_PER_CLASS {

	@Id
	private Long registration;
	private String name;
	
	public StudentTABLE_PER_CLASS() {}

	public StudentTABLE_PER_CLASS(Long registration, String name) {
		super();
		this.registration = registration;
		this.name = name;
	}

	public Long getRegistration() {
		return registration;
	}

	public void setRegistration(Long registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
