package com.swopsolutions.beans;

public class User {

	private int user_id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int role_id;
	private String username;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String firstName, String lastName, String email, String password, int role_id,
			String username) {
		super();
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.role_id = role_id;
		this.username = username;
	}

	// Constructor without the ID
	public User(String firstName, String lastName, String email, String password, int role_id, String username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.role_id = role_id;
		this.username = username;
	}
	
	// Constructor without password
		public User( int user_id,String firstName, String lastName, String email, int role_id, String username) {
			super();
			this.user_id = user_id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.role_id = role_id;
			this.username = username;
		}
		
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + "username = " + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", password=" + password + ", email=" + email + ", role_id=" + role_id + "]";
	}

}
