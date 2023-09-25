package com.pwt.upload.model;

public class FetchAccountData { 
	
	private String auditTypeNmae;
	private String tableName;
	private String fieldName;
	private String accessor;
	public String getAuditTypeNmae() {
		return auditTypeNmae;
	}
	public void setAuditTypeNmae(String auditTypeNmae) {
		this.auditTypeNmae = auditTypeNmae;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getAccessor() {
		return accessor;
	}
	public void setAccessor(String accessor) {
		this.accessor = accessor;
	}
	public FetchAccountData(String auditTypeNmae, String tableName, String fieldName, String accessor) {
		super();
		this.auditTypeNmae = auditTypeNmae;
		this.tableName = tableName;
		this.fieldName = fieldName;
		this.accessor = accessor;
	}
	public FetchAccountData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
