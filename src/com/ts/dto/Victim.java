package com.ts.dto;

public class Victim {
	private int victimId;
	@Override
	public String toString() {
		return "Victim [victimId=" + victimId + ", victimFullName=" + victimFullName + ", victimUserName="
				+ victimUserName + ", victimMobileNo=" + victimMobileNo + ", victimEmailId=" + victimEmailId
				+ ", victimPassword=" + victimPassword + "]";
	}
	private String victimFullName;
	private String victimUserName;
	private String victimMobileNo;
	private String victimEmailId;
	private String victimPassword;
	public int getVictimId() {
		return victimId;
	}
	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}
	public String getVictimMobileNo() {
		return victimMobileNo;
	}
	public void setVictimMobileNo(String victimMobileNo) {
		this.victimMobileNo = victimMobileNo;
	}
	
	
	public String getVictimFullName() {
		return victimFullName;
	}
	public void setVictimFullName(String victimFullName) {
		this.victimFullName = victimFullName;
	}
	public String getVictimUserName() {
		return victimUserName;
	}
	public void setVictimUserName(String victimUserName) {
		this.victimUserName = victimUserName;
	}
	public String getVictimEmailId() {
		return victimEmailId;
	}
	public void setVictimEmailId(String victimEmailId) {
		this.victimEmailId= victimEmailId;
	}
	
	public String getVictimPassword() {
		return victimPassword;
	}
	public void setVictimPassword(String victimPassword) {
		this.victimPassword = victimPassword;
	}
	

}
