package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AAA_NON_SAMPLE_OUTPUT_DATA")
public class NonSmapleOutputData {
	
	@Id
	@Column (name = "ID")
    private String id;
	
	@Column (name = "APPLICABLE_NONAPPLICABLE")
	private String applicableAna;
	
	@Column (name = "ATTACHMENT")
	private String attachment;
	
	@Column (name = "AUDIT_ID")
	private String auditId;
	
	@Column (name = "CUN_DATE")
	private String cunDate;
	
	@Column (name = "DEPARTMENT_ID")
	private String accId;
	
	@Column (name = "IS_FIN_CREATED")
	private String isFinCreated;
	
	@Column (name = "MARKS_OBTAINED")
	private String marksObtCalc;
	
	@Column (name = "MAX_MARKS")
	private String maxVal;
	
	@Column (name = "OBJECTIVE")
	private String objective;
	
	@Column (name = "PORTFOLIO")
	private String portfolio;
	
	@Column (name = "PROCESS")
	private String process;
	
	@Column (name = "REMARKS")
	private String remarks;
	
	@Column (name = "RESPONSE")
	private String response;
	
	@Column (name = "RESULT")
	private String result;
	
	@Column (name = "RISK_REF")
	private String riskRef;
	
	@Column (name = "STATUS")
	private String status;
	
	@Column (name = "TEST_ID")
	private String testId;
	
	@Column (name ="TEST_TITLE")
	private String testTitle;
	
	@Column (name = "USERID")
	private String userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplicableAna() {
		return applicableAna;
	}

	public void setApplicableAna(String applicableAna) {
		this.applicableAna = applicableAna;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getAuditId() {
		return auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String getCunDate() {
		return cunDate;
	}

	public void setCunDate(String cunDate) {
		this.cunDate = cunDate;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getIsFinCreated() {
		return isFinCreated;
	}

	public void setIsFinCreated(String isFinCreated) {
		this.isFinCreated = isFinCreated;
	}

	public String getMarksObtCalc() {
		return marksObtCalc;
	}

	public void setMarksObtCalc(String marksObtCalc) {
		this.marksObtCalc = marksObtCalc;
	}

	public String getMaxVal() {
		return maxVal;
	}

	public void setMaxVal(String maxVal) {
		this.maxVal = maxVal;
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

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getRiskRef() {
		return riskRef;
	}

	public void setRiskRef(String riskRef) {
		this.riskRef = riskRef;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public NonSmapleOutputData(String id, String applicableAna, String attachment, String auditId, String cunDate,
			String accId, String isFinCreated, String marksObtCalc, String maxVal, String objective, String portfolio,
			String process, String remarks, String response, String result, String riskRef, String status,
			String testId, String testTitle, String userId) {
		super();
		this.id = id;
		this.applicableAna = applicableAna;
		this.attachment = attachment;
		this.auditId = auditId;
		this.cunDate = cunDate;
		this.accId = accId;
		this.isFinCreated = isFinCreated;
		this.marksObtCalc = marksObtCalc;
		this.maxVal = maxVal;
		this.objective = objective;
		this.portfolio = portfolio;
		this.process = process;
		this.remarks = remarks;
		this.response = response;
		this.result = result;
		this.riskRef = riskRef;
		this.status = status;
		this.testId = testId;
		this.testTitle = testTitle;
		this.userId = userId;
	}

	public NonSmapleOutputData() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	
	
	
	
	
}
