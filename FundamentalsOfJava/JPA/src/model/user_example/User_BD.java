package model.user_example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_BD {
	
	@Id
	private Long id;
	private String name;
	private String email;
	
	public User_BD(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
