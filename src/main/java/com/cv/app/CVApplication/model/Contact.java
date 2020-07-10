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
public class Contact {
	
	@Id
	@GeneratedValue
	private int contactId;
	private String presentAddress;
	private String permanentAddress;
	private String mobile;
	private String email;
	private String website;
	private int userId;
	
	public Contact() {
	}

	public Contact(int contactId, String presentAddress, String permanentAddress, String mobile, String email,
			String website, int userId) {
		super();
		this.contactId = contactId;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
		this.mobile = mobile;
		this.email = email;
		this.website = website;
		this.userId = userId;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
