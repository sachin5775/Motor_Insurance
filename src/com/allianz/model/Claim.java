package com.allianz.model;

import java.sql.Time;
import java.util.Date;

public class Claim {
	String contactNumber;
	String engineNumber, chassisNumber;
	Date date;
	Time time;
	String description ;
	String locatiuon;
	String vehicleInspectionAddress;
	Float kilometreReading;
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocatiuon() {
		return locatiuon;
	}
	public void setLocatiuon(String locatiuon) {
		this.locatiuon = locatiuon;
	}
	public String getVehicleInspectionAddress() {
		return vehicleInspectionAddress;
	}
	public void setVehicleInspectionAddress(String vehicleInspectionAddress) {
		this.vehicleInspectionAddress = vehicleInspectionAddress;
	}
	public Float getKilometreReading() {
		return kilometreReading;
	}
	public void setKilometreReading(Float kilometreReading) {
		this.kilometreReading = kilometreReading;
	}
	@Override
	public String toString() {
		return "Claim [contactNumber=" + contactNumber + ", engineNumber=" + engineNumber + ", chassisNumber="
				+ chassisNumber + ", date=" + date + ", time=" + time + ", description=" + description + ", locatiuon="
				+ locatiuon + ", vehicleInspectionAddress=" + vehicleInspectionAddress + ", kilometreReading="
				+ kilometreReading + "]";
	}
	public Claim(String contactNumber, String engineNumber, String chassisNumber, Date date, Time time,
			String description, String locatiuon, String vehicleInspectionAddress, Float kilometreReading) {
		super();
		this.contactNumber = contactNumber;
		this.engineNumber = engineNumber;
		this.chassisNumber = chassisNumber;
		this.date = date;
		this.time = time;
		this.description = description;
		this.locatiuon = locatiuon;
		this.vehicleInspectionAddress = vehicleInspectionAddress;
		this.kilometreReading = kilometreReading;
	}
	
	
}
