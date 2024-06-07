package com.cart.spec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginEntity {

	@Id
	private String username;
	private String password;
	
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginEntity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
