package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AAA_AUDITS")
public class AuditData {
	
	@Id
	@Column(name = "audit_id")
	String id;
	@Column(name = "audit_title")
	String auditTitle;
	@Column(name = "sol_id")
	String solId;
	@Column(name = "status")
	String status;
	@Column(name = "audit_type")
	String auditType;
	
	public String getAuditType() {
		return auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	public AuditData() {
		
	}
	
	public AuditData(String id, String auditTitle, String solId, String status, String auditType) {
		super();
		this.id = id;
		this.auditTitle = auditTitle;
		this.solId = solId;
		this.status = status;
		this.auditType = auditType;
	}
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

}
