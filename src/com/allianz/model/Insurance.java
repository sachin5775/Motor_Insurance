package com.allianz.model;



public class Insurance {
	private String provider;
	private String insuranceNumber;
	private String insuranceValidDate;
	private User user;
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public String getInsuranceValidDate() {
		return insuranceValidDate;
	}
	public void setInsuranceValidDate(String insuranceValidDate) {
		this.insuranceValidDate = insuranceValidDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Insurance [provider=" + provider + ", insuranceNumber=" + insuranceNumber + ", insuranceValidDate="
				+ insuranceValidDate + ", user=" + user + "]";
	}
	public Insurance(String provider, String insuranceNumber, String insuranceValidDate, User user) {
		super();
		this.provider = provider;
		this.insuranceNumber = insuranceNumber;
		this.insuranceValidDate = insuranceValidDate;
		this.user = user;
	}
	public Insurance() {
		// TODO Auto-generated constructor stub
	}
	
}
