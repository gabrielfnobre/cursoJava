package model.user_example.Inheritance.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scholarshipholder_table_per_classs")
public class ScholarHolderTABLE_PER_CLASS extends StudentTABLE_PER_CLASS {

	@Id
	private Long registration; 
	private int scholarship;
	
	public ScholarHolderTABLE_PER_CLASS() {}

	public ScholarHolderTABLE_PER_CLASS(Long registration, String name, int scholarship) {
		super();
		this.setRegistration(registration);
		this.setName(name);
		this.scholarship = scholarship;
	}

	public int getScholarship() {
		return scholarship;
	}

	public Long getRegistration() {
		return registration;
	}

	public void setRegistration(Long registration) {
		this.registration = registration;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	
	
}
