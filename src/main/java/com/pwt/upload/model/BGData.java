package com.pwt.upload.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pwt.upload.CustomLocalDateSerializer;

@Entity
@Table (name = "MS_BOB_CON_BG_DETAILS", schema = "UNIVERSAL_DWH")
public class BGData {
	
	
	
	
	@Column(name = "BENEFICIARY_NAME")
	private String customerName;
		
	@Column(name = "ZONE")
	private String zone;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "BRANCH")
	private String branch;
	
	@Column(name = "BRANCH_ALPHA")
	private String branchAlpha;
	
	@Id
	@Column(name = "INSTA_TRANSACTION_REF_NO")
	private String id;
	
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "TRANSACTION_AMOUNT")
	private String transactionAmount;
	
	@Column(name = "CUSTOMER_ID")
	private String customerId;
	
		
//	@Column(name = "BENEFICIARY_NAME")
//	private String beneficiaryName;
	
	@Column(name = "BENEFICIARY_COUNTRY")
	private String beneficiaryCountry;
	
	@Column(name = "BG_EXPIRY_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)	
	private LocalDate bgExpiryLocalDate;
	
	@Column(name = "BG_CLAIM_EXPIRY_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)	
	private LocalDate bgClaimExpiryLocalDate;
	
//	@Column(name = "FINACLE_TRANSACTION_NO")
//	private String finacleTransactionNo;
	
	@Column(name = "BG_CLOSURE_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)	
	private LocalDate bgClosureLocalDate;
	
	@Column(name = "BUSS_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)	
	private LocalDate cunDate;
	
	@Column(name = "AUDIT_ID")
	private String auditId;
	
	@Column(name = "WKF_EXEC_ID_INS")
	private String ekfExecIdIns;
	
	@Column(name = "REC_INSERT_TS")
	private String recInsertTs;
	
	@Column(name = "RUN_BUSINESS_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)	
	private LocalDate runBussDate;
	
	@Column(name = "BG_ISSUE_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)	
	private LocalDate bgIssueLocalDate;
	
	@Column(name = "USERID")
	private String userId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "FINACLE_TRANSACTION_ID_EXP")
	private String finacleTransactionIdExp;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBranchAlpha() {
		return branchAlpha;
	}

	public void setBranchAlpha(String branchAlpha) {
		this.branchAlpha = branchAlpha;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

//	public String getBeneficiaryName() {
//		return beneficiaryName;
//	}
//
//	public void setBeneficiaryName(String beneficiaryName) {
//		this.beneficiaryName = beneficiaryName;
//	}

	public String getBeneficiaryCountry() {
		return beneficiaryCountry;
	}

	public void setBeneficiaryCountry(String beneficiaryCountry) {
		this.beneficiaryCountry = beneficiaryCountry;
	}

	public LocalDate getBgExpiryLocalDate() {
		return bgExpiryLocalDate;
	}

	public void setBgExpiryLocalDate(LocalDate bgExpiryLocalDate) {
		this.bgExpiryLocalDate = bgExpiryLocalDate;
	}

	public LocalDate getBgClaimExpiryLocalDate() {
		return bgClaimExpiryLocalDate;
	}

	public void setBgClaimExpiryLocalDate(LocalDate bgClaimExpiryLocalDate) {
		this.bgClaimExpiryLocalDate = bgClaimExpiryLocalDate;
	}

	public LocalDate getBgClosureLocalDate() {
		return bgClosureLocalDate;
	}

	public void setBgClosureLocalDate(LocalDate bgClosureLocalDate) {
		this.bgClosureLocalDate = bgClosureLocalDate;
	}

	public LocalDate getCunDate() {
		return cunDate;
	}

	public void setCunDate(LocalDate cunDate) {
		this.cunDate = cunDate;
	}

	public String getAuditId() {
		return auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String getEkfExecIdIns() {
		return ekfExecIdIns;
	}

	public void setEkfExecIdIns(String ekfExecIdIns) {
		this.ekfExecIdIns = ekfExecIdIns;
	}

	public String getRecInsertTs() {
		return recInsertTs;
	}

	public void setRecInsertTs(String recInsertTs) {
		this.recInsertTs = recInsertTs;
	}

	public LocalDate getRunBussDate() {
		return runBussDate;
	}

	public void setRunBussDate(LocalDate runBussDate) {
		this.runBussDate = runBussDate;
	}

	public LocalDate getBgIssueLocalDate() {
		return bgIssueLocalDate;
	}

	public void setBgIssueLocalDate(LocalDate bgIssueLocalDate) {
		this.bgIssueLocalDate = bgIssueLocalDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFinacleTransactionIdExp() {
		return finacleTransactionIdExp;
	}

	public void setFinacleTransactionIdExp(String finacleTransactionIdExp) {
		this.finacleTransactionIdExp = finacleTransactionIdExp;
	}

	public BGData(String customerName, String zone, String region, String branch, String branchAlpha, String id,
			String currency, String transactionAmount, String customerId, 
			String beneficiaryCountry, LocalDate bgExpiryLocalDate, LocalDate bgClaimExpiryLocalDate,
			LocalDate bgClosureLocalDate, LocalDate cunDate, String auditId, String ekfExecIdIns, String recInsertTs,
			LocalDate runBussDate, LocalDate bgIssueLocalDate, String userId, String status,
			String finacleTransactionIdExp) {
		super();
		this.customerName = customerName;
		this.zone = zone;
		this.region = region;
		this.branch = branch;
		this.branchAlpha = branchAlpha;
		this.id = id;
		this.currency = currency;
		this.transactionAmount = transactionAmount;
		this.customerId = customerId;
//		this.beneficiaryName = beneficiaryName;
		this.beneficiaryCountry = beneficiaryCountry;
		this.bgExpiryLocalDate = bgExpiryLocalDate;
		this.bgClaimExpiryLocalDate = bgClaimExpiryLocalDate;
		this.bgClosureLocalDate = bgClosureLocalDate;
		this.cunDate = cunDate;
		this.auditId = auditId;
		this.ekfExecIdIns = ekfExecIdIns;
		this.recInsertTs = recInsertTs;
		this.runBussDate = runBussDate;
		this.bgIssueLocalDate = bgIssueLocalDate;
		this.userId = userId;
		this.status = status;
		this.finacleTransactionIdExp = finacleTransactionIdExp;
	}

	public BGData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

	
	
}
