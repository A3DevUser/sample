package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AAA_TABLE_MAPPING")
public class AuditTypeMappingData {

	@Id
	@Column (name = "AUDIT_TYPE_ID")
	private String auditTypeId;
	
	@Column (name = "AUDIT_TYPE_NAME")
	private String auditTypeName;
	
	@Column (name = "TABLE_NAME")
	private String tableName;
	
	@Column (name ="TABLE_ID")
	private String tableId;

	public String getAuditTypeId() {
		return auditTypeId;
	}

	public void setAuditTypeId(String auditTypeId) {
		this.auditTypeId = auditTypeId;
	}

	public String getAuditTypeName() {
		return auditTypeName;
	}

	public void setAuditTypeName(String auditTypeName) {
		this.auditTypeName = auditTypeName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public AuditTypeMappingData(String auditTypeId, String auditTypeName, String tableName, String tableId) {
		super();
		this.auditTypeId = auditTypeId;
		this.auditTypeName = auditTypeName;
		this.tableName = tableName;
		this.tableId = tableId;
	}

	public AuditTypeMappingData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
