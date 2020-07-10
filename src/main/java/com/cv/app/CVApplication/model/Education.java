package com.cv.app.CVApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Education {
	
	@Id
	@GeneratedValue
	private int eduId;
	private String institute;
	private String passingYear;
	private String degree;
	private String major;
	private double gpa;
	private int userId;
	
	
	
	public Education() {
	}



	public Education(int eduId, String institute, String passingYear, String degree, String major, double gpa,
			int userId) {
		super();
		this.eduId = eduId;
		this.institute = institute;
		this.passingYear = passingYear;
		this.degree = degree;
		this.major = major;
		this.gpa = gpa;
		this.userId = userId;
	}



	public int getEduId() {
		return eduId;
	}



	public void setEduId(int eduId) {
		this.eduId = eduId;
	}



	public String getInstitute() {
		return institute;
	}



	public void setInstitute(String institute) {
		this.institute = institute;
	}



	public String getPassingYear() {
		return passingYear;
	}



	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
