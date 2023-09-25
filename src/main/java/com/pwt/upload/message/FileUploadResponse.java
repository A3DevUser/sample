package com.pwt.upload.message;

public class FileUploadResponse {
    private String fileName;
    private String downloadUri;
    private long size;
    private String message;
    
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDownloadUri() {
		return downloadUri;
	}
	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
		
		
	}
	
	public String getMessage() {
	    return message;
	  }

	  public FileUploadResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FileUploadResponse(String fileName, String downloadUri, long size, String message) {
		super();
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.size = size;
		this.message = message;
	}
	public void setMessage(String message) {
	    this.message = message;
	  }
	
	  
	  
    
}