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
public class Project {
	
	@Id
	@GeneratedValue
	private int projectId;
	private String projectName;
	private String description;
	private String technology;
	private String link;
	private int userId;
	
	
	public Project() {
	}


	public Project(int projectId, String projectName, String description, String technology, String link, int userId) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
		this.technology = technology;
		this.link = link;
		this.userId = userId;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	}
