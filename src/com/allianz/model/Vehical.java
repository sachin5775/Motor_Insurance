package com.allianz.model;

public class Vehical {
	private String source, category;
	private String plateNumber;
	private String manufacture, type, color;
	private String registrationDate;
	private String pendingFines;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getPendingFines() {
		return pendingFines;
	}

	public void setPendingFines(String pendingFines) {
		this.pendingFines = pendingFines;
	}

	@Override
	public String toString() {
		return "Vehical [source=" + source + ", category=" + category + ", plateNumber=" + plateNumber
				+ ", manufacture=" + manufacture + ", type=" + type + ", color=" + color + ", registrationDate="
				+ registrationDate + ", pendingFines=" + pendingFines + "]";
	}

	public Vehical(String source, String category, String plateNumber, String manufacture, String type, String color,
			String registrationDate, String pendingFines) {
		super();
		this.source = source;
		this.category = category;
		this.plateNumber = plateNumber;
		this.manufacture = manufacture;
		this.type = type;
		this.color = color;
		this.registrationDate = registrationDate;
		this.pendingFines = pendingFines;
	}

	public Vehical() {
		
	}

}
