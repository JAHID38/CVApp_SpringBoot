package com.cv.app.CVApplication.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

public class CVFile {

	@Id
	@GeneratedValue
	private String fileId;

	private String objective;

	private String fileName;

	private String fileType;

	@Lob
	private byte[] data;
	private int userId;
	
	public CVFile() {
	}

	public CVFile(String fileId, String objective, String fileName, String fileType, byte[] data, int userId) {
		super();
		this.fileId = fileId;
		this.objective = objective;
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
		this.userId = userId;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
