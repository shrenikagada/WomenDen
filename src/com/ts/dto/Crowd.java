package com.ts.dto;

public class Crowd {
	private String location;
	private String crowdZone;
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
	public String getCrowdZone() {
		return crowdZone;
	}
	public void setCrowdZone(String crowdZone) {
		this.crowdZone = crowdZone;
	}
	@Override
	public String toString() {
		return "Crowd [location=" + location + ", crowdZone=" + crowdZone + ", photo=" + photo + "]";
	}
	
	
}
