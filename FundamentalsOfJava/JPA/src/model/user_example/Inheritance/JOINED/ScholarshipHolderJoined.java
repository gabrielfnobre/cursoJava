package model.user_example.Inheritance.JOINED;

import javax.persistence.Entity;

@Entity
public class ScholarshipHolderJoined extends StudentJoined{

	private int scholarship;

	public ScholarshipHolderJoined() {}

	public ScholarshipHolderJoined(Long registration, String name, int scholarship) {
		super();
		this.setName(name);
		this.setRegistration(registration);
		this.scholarship = scholarship;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	
}
