package com.ts.dto;

public class Crimes {
	private String location;
	private String crime;
	private String photo;
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCrime() {
		return crime;
	}
	public void setCrime(String crime) {
		this.crime = crime;
	}
	@Override
	public String toString() {
		return "Crimes [location=" + location + ", crime=" + crime + ", photo=" + photo + "]";
	}
	
	
}
