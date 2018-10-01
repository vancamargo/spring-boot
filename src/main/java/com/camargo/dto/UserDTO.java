package com.camargo.dto;

import java.io.Serializable;

import com.camargo.domaim.User;

public class UserDTO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	private String email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}
}
