package com.allianz.model;


public class User {
	private String name, password;
	private String gender;
	private String nationality;
	private String licence;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", gender=" + gender + ", nationality=" + nationality
				+ ", licence=" + licence + "]";
	}
	public User(String name, String password, String gender, String nationality, String licence) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.nationality = nationality;
		this.licence = licence;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
}
