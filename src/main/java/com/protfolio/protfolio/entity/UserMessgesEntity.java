package com.protfolio.protfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_meassge")
public class UserMessgesEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String subjects;
	
    private String user_name;
    
    private String email;
    
    private String message;

	public UserMessgesEntity(int id, String subjects, String user_name, String email, String message) {
		super();
		this.id = id;
		this.subjects = subjects;
		this.user_name = user_name;
		this.email = email;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserMessgesEntity [id=" + id + ", subjects=" + subjects + ", user_name=" + user_name + ", email="
				+ email + ", message=" + message + "]";
	}


}
