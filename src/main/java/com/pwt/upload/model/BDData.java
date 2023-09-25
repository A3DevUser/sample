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
@Table(name = "MS_BOB_CON_BD_DETAILS", schema = "UNIVERSAL_DWH")
public class BDData {
	
	
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
//	
//	@Column(name = "TRANSACTION_COMPLETION_DATE")
//	private Date transationCompletuiononDate;
//	
//	
//	@Column(name = "VALUE_DATE")
//	private Date valueDate;
//	
//	@Column(name = "TRANSACTION_INITIATION_DATE")
//	private Date transationIntitiationDate;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "TRANSACTION_AMOUNT")
	private String transactionAmount;
	
	@Column(name = "CUSTOMER_ID")
	private String customerId;
	
	
	
	@Column(name = "OPERATIVE_ACCOUNT_NO")
	private String operativeAccountNo;
	
//	@Column (name = "CREDIT_ACCOUNT_NO")
//	private String creditAccountNumber;
	
	@Column (name = "ACCOUNT_NAME")
	private String accountName;
	
	@Column (name = "IMPORTER_NAME")
	private String importerName;
	
	@Column (name = "EXPORTER_NAME")
	private String exporterName;
	
	@Column (name = "IMPORTER_COUNTRY_CODE")
	private String importerCountryCode;
	
//	@Column (name = "GOOD_DESCRIPTION")
//	private String goodDescription;
//	
//	@Column (name = "SHIPPING_BILL_NO")
//	private String shippingBillNo;
//	
//	@Column (name = "SHIPPING_BILL_DATE")
//	private String shippingBillDate;
//	
//	@Column (name = "FINACLE_TRANSACTION_NO")
//	private String finacleTransactionNo;
//	
//	@Column (name = "WHETHER_EXTENDED_YN")
//	private String whetherExtendedYn;
//	
//	@Column (name = "RATE_OF_INTEREST")
//	private String rateOfIntrest;
	
	@Column (name = "BD_CLOSURE_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)
	private LocalDate bdClosureDate;
	
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
	
	@Column(name = "BD_OPEN_DATE")
	@JsonSerialize(using = CustomLocalDateSerializer.class)
    private LocalDate bgIssueDate;
	
	@Column (name = "USERID")
	private String userId;
	

	@Column (name = "STATUS")
	private String status;

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

	public String getOperativeAccountNo() {
		return operativeAccountNo;
	}

	public void setOperativeAccountNo(String operativeAccountNo) {
		this.operativeAccountNo = operativeAccountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getImporterName() {
		return importerName;
	}

	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}

	public String getExporterName() {
		return exporterName;
	}

	public void setExporterName(String exporterName) {
		this.exporterName = exporterName;
	}

	public String getImporterCountryCode() {
		return importerCountryCode;
	}

	public void setImporterCountryCode(String importerCountryCode) {
		this.importerCountryCode = importerCountryCode;
	}

	public LocalDate getBdClosureDate() {
		return bdClosureDate;
	}

	public void setBdClosureDate(LocalDate bdClosureDate) {
		this.bdClosureDate = bdClosureDate;
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

	public LocalDate getBgIssueDate() {
		return bgIssueDate;
	}

	public void setBgIssueDate(LocalDate bgIssueDate) {
		this.bgIssueDate = bgIssueDate;
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

	public BDData(String id, String zone, String region, String branch, String branchAlpha, String solId,
			String currency, String transactionAmount, String customerId, String operativeAccountNo, String accountName,
			String importerName, String exporterName, String importerCountryCode, LocalDate bdClosureDate,
			LocalDate cunDate, String auditId, String ekfExecIdIns, String recInsertTs, LocalDate runBussDate,
			LocalDate bgIssueDate, String userId, String status) {
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
		this.operativeAccountNo = operativeAccountNo;
		this.accountName = accountName;
		this.importerName = importerName;
		this.exporterName = exporterName;
		this.importerCountryCode = importerCountryCode;
		this.bdClosureDate = bdClosureDate;
		this.cunDate = cunDate;
		this.auditId = auditId;
		this.ekfExecIdIns = ekfExecIdIns;
		this.recInsertTs = recInsertTs;
		this.runBussDate = runBussDate;
		this.bgIssueDate = bgIssueDate;
		this.userId = userId;
		this.status = status;
	}

	public BDData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
