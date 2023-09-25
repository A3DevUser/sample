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
@Table(name = "MS_BOB_CON_LC_DETAILS", schema = "UNIVERSAL_DWH")
public class LCData {
	
	@Id
	@Column(name = "INSTA_TRANSACTION_REF_NO")
	private String id;
		
	@Column(name = "ZONE")
	private String zone;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "BRANCH")
	private String branch;
	
	@Column(name = "BRANCH_ALPHA")
	private String branchAlpha;
	
	@Column(name = "SOL_ID")
	private String solId;
	
//	@Column(name = "INSTA_TRANSACTION_REF_NO")
//	private String instaTransactionRefNo;
	
//	@Column(name = "TRANSACTION_COMPLETION_DATE")
//	@JsonSerialize(using = CustomLocalDateSerializer.class)
//	private LocalDate transationCompletuiononDate;
//	
//	@Column(name = "TRANSACTION_INITIATION_DATE")
//	@JsonSerialize(using = CustomLocalDateSerializer.class)
//	private LocalDate transationIntitiationDate;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "TRANSACTION_AMOUNT")
	private String transactionAmount;
	
	@Column(name = "CUSTOMER_ID")
	private String customerId;
	
	
	@Column(name = "ACCOUNT_NAME")
	private String accountName;
	
	@Column(name = "EXPORTER_NAME")
	private String exporterName;
	
	@Column(name = "EXPORTER_COUNTRY_CODE")
	private String exporterCountryCode;
	
//	@Column(name = "GOOD_DESCRIPTION")
//	private String goodDescription;
//	
//	@Column(name = "FINACLE_TRANSACTION_ID")
//	private String finacleTransactionId;
	
	@Column(name = "LC_CLOSURE_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)
	private LocalDate lcClosureDate;
	
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
	private LocalDate runnBussDate;
	
	@Column(name = "LC_OPEN_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)
	private LocalDate lcOpenDate;
	
	@Column (name = "USERID")
	private String userId;

	@Column (name = "STATUS")
	private String status;
	
	@Column (name = "FINACLE_TRANSACTION_ID_EXP")
	private String finacleTransactionIdExp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getSolId() {
		return solId;
	}

	public void setSolId(String solId) {
		this.solId = solId;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getExporterName() {
		return exporterName;
	}

	public void setExporterName(String exporterName) {
		this.exporterName = exporterName;
	}

	public String getExporterCountryCode() {
		return exporterCountryCode;
	}

	public void setExporterCountryCode(String exporterCountryCode) {
		this.exporterCountryCode = exporterCountryCode;
	}

	public LocalDate getLcClosureDate() {
		return lcClosureDate;
	}

	public void setLcClosureDate(LocalDate lcClosureDate) {
		this.lcClosureDate = lcClosureDate;
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

	public LocalDate getRunnBussDate() {
		return runnBussDate;
	}

	public void setRunnBussDate(LocalDate runnBussDate) {
		this.runnBussDate = runnBussDate;
	}

	public LocalDate getLcOpenDate() {
		return lcOpenDate;
	}

	public void setLcOpenDate(LocalDate lcOpenDate) {
		this.lcOpenDate = lcOpenDate;
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

	public LCData(String id, String zone, String region, String branch, String branchAlpha, String solId,
			String currency, String transactionAmount, String customerId, String accountName, String exporterName,
			String exporterCountryCode, LocalDate lcClosureDate, LocalDate cunDate, String auditId, String ekfExecIdIns,
			String recInsertTs, LocalDate runnBussDate, LocalDate lcOpenDate, String userId, String status,
			String finacleTransactionIdExp) {
		super();
		this.id = id;
		this.zone = zone;
		this.region = region;
		this.branch = branch;
		this.branchAlpha = branchAlpha;
		this.solId = solId;
		this.currency = currency;
		this.transactionAmount = transactionAmount;
		this.customerId = customerId;
		this.accountName = accountName;
		this.exporterName = exporterName;
		this.exporterCountryCode = exporterCountryCode;
		this.lcClosureDate = lcClosureDate;
		this.cunDate = cunDate;
		this.auditId = auditId;
		this.ekfExecIdIns = ekfExecIdIns;
		this.recInsertTs = recInsertTs;
		this.runnBussDate = runnBussDate;
		this.lcOpenDate = lcOpenDate;
		this.userId = userId;
		this.status = status;
		this.finacleTransactionIdExp = finacleTransactionIdExp;
	}

	public LCData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	

}
