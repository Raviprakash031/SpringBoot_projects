package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ProfileId;
	private String TenthDetails;
	private String diplomaDetails;
	private String graduationDetails;
	public Profile(int profileId, String tenthDetails, String diplomaDetails, String graduationDetails) {
		super();
		ProfileId = profileId;
		TenthDetails = tenthDetails;
		this.diplomaDetails = diplomaDetails;
		this.graduationDetails = graduationDetails;
	}
	public int getProfileId() {
		return ProfileId;
	}
	public void setProfileId(int profileId) {
		ProfileId = profileId;
	}
	public String getTenthDetails() {
		return TenthDetails;
	}
	public void setTenthDetails(String tenthDetails) {
		TenthDetails = tenthDetails;
	}
	public String getDiplomaDetails() {
		return diplomaDetails;
	}
	public void setDiplomaDetails(String diplomaDetails) {
		this.diplomaDetails = diplomaDetails;
	}
	public String getGraduationDetails() {
		return graduationDetails;
	}
	public void setGraduationDetails(String graduationDetails) {
		this.graduationDetails = graduationDetails;
	}
	public Profile() {
		
	}
	

}
