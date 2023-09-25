package com.pwt.upload.model;


import java.io.StringReader;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="AAA_UPLOAD_DOWNLOAD_FILE_DATA")
public class FileData {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name="FILE_ID")
	private String id;

	@Column(name="FILE_NAME")
	private String fileName;
	
	@Column(name="FILE_TYPE")
	private String fileType;
	
	@Column(name="FILE_DATA")
	private long data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	public FileData(String id, String fileName, String fileType, long data) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
	}

	public FileData() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	
	
}
