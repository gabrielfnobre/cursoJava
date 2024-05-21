package model.user_example.Inheritance.JOINED;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class StudentJoined {
	
	@Id
	private Long registration;
	private String name;
	
	public StudentJoined() {}

	public StudentJoined(Long registration, String name) {
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
