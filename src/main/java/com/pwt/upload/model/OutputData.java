package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AAA_OUTPUT")
public class OutputData {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "TEST_ID")
	private String testId;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;
	
	@Column(name = "RESULT")
	private String result;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "AUDIT_ID")
	private String auditId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "TEST_TITLE")
	private String testTitle;
	
	@Column(name = "SCHEME_CODE")
	private String schemeCode;
	
	@Column(name = "ACTION_STATUS")
	private String actionStatus;
	
	@Column(name = "AUDIT_TYPE")
	private String auditType;
	
	@Column(name = "timestamp")
	private String timeSt;
	
	@Column(name = "is_fin_created")
	private String isFinCreated;
	
	
	@Column (name = "ATTACHMENT")
	private String attachment;
	
	@Column(name = "FILE_ID")
	private String fileId;
	
	@Column (name = "PORTFOLIO")
	private String portfolio;
	
	@Column (name = "PROCESS")
	private String process;
	
	@Column (name = "OBJECTIVE")
	private String objective;
	
	@Column (name = "cun_date")
	private String cunDate;
	
	@Column (name = "RISK_REF")
	private String risk;
	
	

	public String getId() {
		return id;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuditId() {
		return auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public String getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getTimeSt() {
		return timeSt;
	}

	public void setTimeSt(String timeSt) {
		this.timeSt = timeSt;
	}

	public String getIsFinCreated() {
		return isFinCreated;
	}

	public void setIsFinCreated(String isFinCreated) {
		this.isFinCreated = isFinCreated;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	
	
	
	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	
	public String getCunDate() {
		return cunDate;
	}

	public void setCunDate(String cunDate) {
		this.cunDate = cunDate;
	}
	
	

	

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	
	
	
	public OutputData(String id, String testId, String accountId, String result, String remarks, String userId,
			String auditId, String status, String testTitle, String schemeCode, String actionStatus, String auditType,
			String timeSt, String isFinCreated, String attachment, String fileId, String portfolio, String process,
			String objective, String cunDate, String risk) {
		super();
		this.id = id;
		this.testId = testId;
		this.accountId = accountId;
		this.result = result;
		this.remarks = remarks;
		this.userId = userId;
		this.auditId = auditId;
		this.status = status;
		this.testTitle = testTitle;
		this.schemeCode = schemeCode;
		this.actionStatus = actionStatus;
		this.auditType = auditType;
		this.timeSt = timeSt;
		this.isFinCreated = isFinCreated;
		this.attachment = attachment;
		this.fileId = fileId;
		this.portfolio = portfolio;
		this.process = process;
		this.objective = objective;
		this.cunDate = cunDate;
		this.risk = risk;
	}

	public OutputData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
