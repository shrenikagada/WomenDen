package com.ts.dto;

public class Post {
	private int complaintId;
	private String post;
	private int victimId;
	private int professionalId;
	private String photo;
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	
	
	public Post() {
		super();
	}	
	
	public Post(String post, int victimId, int professionalId) {
		super();
		this.post = post;
		this.victimId = victimId;
		this.professionalId = professionalId;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getVictimId() {
		return victimId;
	}

	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}

	public int getProfessionalId() {
		return professionalId;
	}

	public void setProfessionalId(int professionalId) {
		this.professionalId = professionalId;
	}

	@Override
	public String toString() {
		return "Post [complaintId=" + complaintId + ", post=" + post + ", victimId=" + victimId + ", professionalId="
				+ professionalId + ", photo=" + photo + "]";
	}


}
