package com.pwt.upload.model;

public class AuditDataObject {
	
	private String id;
	private String auditTitle;
	private String solId;
	private String status;
	private String auditType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuditTitle() {
		return auditTitle;
	}
	public void setAuditTitle(String auditTitle) {
		this.auditTitle = auditTitle;
	}
	public String getSolId() {
		return solId;
	}
	public void setSolId(String solId) {
		this.solId = solId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAuditType() {
		return auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	public AuditDataObject(String id, String auditTitle, String solId, String status, String auditType) {
		super();
		this.id = id;
		this.auditTitle = auditTitle;
		this.solId = solId;
		this.status = status;
		this.auditType = auditType;
	}
	public AuditDataObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
