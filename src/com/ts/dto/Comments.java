package com.ts.dto;

public class Comments {
	private int userId;
	@Override
	public String toString() {
		return "Comments [userId=" + userId + ", comment=" + comment + "]";
	}
	private String comment;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

	
}