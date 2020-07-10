package com.cv.app.CVApplication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Account {
	
	@Id
	@GeneratedValue 
	private int userId;
	private String username;
	private String password;
	private String role;
	
	@OneToMany (targetEntity = Personal.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "userId", referencedColumnName = "userId")
	private List<Personal> personal;
	
	@OneToMany (targetEntity = Contact.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "userId", referencedColumnName = "userId")
	private List<Contact> contact;
	
	@OneToMany (targetEntity = Education.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "userId", referencedColumnName = "userId")
	private List<Education> education;
	
	@OneToMany (targetEntity = Skill.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "userId", referencedColumnName = "userId")
	private List<Skill> skill;
	
	@OneToMany (targetEntity = Project.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "userId", referencedColumnName = "userId")
	private List<Project> project;
	
	@OneToMany (targetEntity = Language.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "userId", referencedColumnName = "userId")
	private List<Language> language;

	@OneToMany (targetEntity = Language.class, cascade = CascadeType.ALL)
	@JoinColumn (name = "userId", referencedColumnName = "userId")
	private List<CVFile> cvFile;
	
	

	public Account() {
		
	}



	public Account(int userId, String username, String password, String role, List<Personal> personal,
			List<Contact> contact, List<Education> education, List<Skill> skill, List<Project> project,
			List<Language> language, List<CVFile> cvFile) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.personal = personal;
		this.contact = contact;
		this.education = education;
		this.skill = skill;
		this.project = project;
		this.language = language;
		this.cvFile = cvFile;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public List<Personal> getPersonal() {
		return personal;
	}



	public void setPersonal(List<Personal> personal) {
		this.personal = personal;
	}



	public List<Contact> getContact() {
		return contact;
	}



	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}



	public List<Education> getEducation() {
		return education;
	}



	public void setEducation(List<Education> education) {
		this.education = education;
	}



	public List<Skill> getSkill() {
		return skill;
	}



	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}



	public List<Project> getProject() {
		return project;
	}



	public void setProject(List<Project> project) {
		this.project = project;
	}



	public List<Language> getLanguage() {
		return language;
	}



	public void setLanguage(List<Language> language) {
		this.language = language;
	}



	public List<CVFile> getCvFile() {
		return cvFile;
	}



	public void setCvFile(List<CVFile> cvFile) {
		this.cvFile = cvFile;
	}
	
	

	
}
