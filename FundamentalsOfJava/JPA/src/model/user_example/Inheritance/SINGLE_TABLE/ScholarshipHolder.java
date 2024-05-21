package model.user_example.Inheritance.SINGLE_TABLE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "scholarship_holder")
@DiscriminatorValue("SH")
public class ScholarshipHolder extends Student {

	private int scholarship;
	
	public ScholarshipHolder() {}

	public ScholarshipHolder(Long registration, String name, int scholarship) {
		super();
		this.setRegistration(registration);
		this.setName(name);
		this.scholarship = scholarship;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	
	
	
}
