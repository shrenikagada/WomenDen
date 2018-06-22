package com.ts.dto;

public class Professional {
	private int professionalId;
	private String professionalFullName;
	private String professionalUserName;
	private String professionalEmailId;
	private String professionalUserId;
	private String professionalPassword;
	public int getProfessionalId() {
		return professionalId;
	}
	public void setProfessionalId(int professionalId) {
		this.professionalId = professionalId;
	}
	public String getProfessionalFullName() {
		return professionalFullName;
	}
	public void setProfessionalFullName(String professionalFullName) {
		this.professionalFullName = professionalFullName;
	}
	public String getProfessionalUserName() {
		return professionalUserName;
	}
	public void setProfessionalUserName(String professionalUserName) {
		this.professionalUserName = professionalUserName;
	}
	public String getProfessionalEmailId() {
		return professionalEmailId;
	}
	public void setProfessionalEmailId(String professionalEmailId) {
		this.professionalEmailId = professionalEmailId;
	}
	public String getProfessionalUserId() {
		return professionalUserId;
	}
	public void setProfessionalUserId(String professionalUserId) {
		this.professionalUserId = professionalUserId;
	}
	public String getProfessionalPassword() {
		return professionalPassword;
	}
	public void setProfessionalPassword(String professionalPassword) {
		this.professionalPassword = professionalPassword;
	}
	@Override
	public String toString() {
		return "Professional [professionalId=" + professionalId + ", professionalFullName=" + professionalFullName
				+ ", professionalUserName=" + professionalUserName + ", professionalEmailId=" + professionalEmailId
				+ ", professionalUserId=" + professionalUserId + ", professionalPassword=" + professionalPassword + "]";
	}  
}
