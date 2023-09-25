package com.pwt.upload.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ms_bob_con_deposit_acc_opened" , schema = "AAA_BDL")
public class DepositAccountData {
	
	
	@Id
	@Column(name = "ACCOUNT_NUMBER")
	private String id;
	
	@Column(name = "CUSTOMER_NAME")	
	private String customerName;
	
//	@Column(name = "ALPHA")	
//	private String alpha;
	
	
	
//	@Column(name = "AUDIT_DATE")
//	@JsonFormat(pattern="dd-MM-yyyy")
//	private Date auditDate;
	
//	@Column(name = "OUTSTANDING_BALANCE")
//	private int outstandingAmt;
//	
//	@Column(name = "OVERDUES")
//	private int overdue;
	
//	@Column(name = "CUSTOMER_ID")
//	private String customerId;
//	
//	@Column(name = "OS_AS_ON_DATE")	
//	private String osAsOnDate;
	
	
	@Column(name = "SCHEME_CODE")
	private String schemeCode;
	
	@Column(name = "SOL_ID")
	private String solId;
	
//	@Column(name = "MANDATORY")
//	private String mandatory;
	
	@Column(name = "ACC_OPEN_DATE")
	private String sanctionDate;
	
//	@Column(name = "LIMIT")
//	private String limit;
//	
//	@Column(name = "OVERDUES_SINCE")
//	private String overduesSince;
	
//	@Column(name = "ROI")
//	private String roi;
	
	@Column(name = "CHANNEL")	
	private String channel;
	
	
//	@Column(name = "ASSET_CLASS")
//	private String assetClass;
//	
//	@Column(name = "DESCRIPTION_OF_ACTIVITY")
//	private String descOfActivity;
	
//	@Column(name = "ZONE")
//	private String zone;
//	
//	@Column(name = "REGION")
//	private String region;
//	
//	@Column(name = "BRANCH")
//	private String branchName;
	
//	@Column(name = "SCHEME_DESCRIPTION")
//	private String schemeDesc;
//	
//	@Column(name = "TDS_CODE")	
//	private String tdsCode;
//	
//	@Column(name = "KYC_DETAILS")	
//	private String kycDetails;
//	
//	@Column(name = "PAN_NO")	
//	private String panNo;
//	
//	@Column(name = "AADHAAR_NO")	
//	private String aadhaarNo;
	
	@Column(name = "RUN_BUSINESS_DATE")	
	private Date bussDate;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "USERID")
	private String userId;
	
	@Column (name="AUDIT_ID")
	private String dummy;
	
	@Column(name = "WKF_EXEC_ID_INS")	
	private String wkfExecIdIns;
	
	@Column(name = "REC_INSERT_TS")	
	private Date recInsertTs;
	
	
//	@Column(name="dummy2")
//	private String dummy2;
//	
//	@Column(name="dummy3")
//	private String dummy3;
	
//	@Column(name="GROUP_NAME")
//	private String groupName;
//	
//	@Column(name="Internal_rating")
//	private String internalTraining;
//	
//	@Column(name="Business_segment")
//	private String buisnessSegment;
//	
//	@Column(name="Group_exposure")
//	private String groupExposure;
//	
//	@Column(name="Security_perfection_status")
//	private String securityPerfectionStatus;
	
//	@Column(name = "CUN_BRANCH_NAME")
//    private String cunBranchName;
//	
//	@Column(name = "CUN_AREA_NAME")
//	private String cunAreaName;
	
	@Column(name = "BUSS_DATE")
//	@JsonFormat(pattern="YYYY-MM-DD")
	private LocalDate cunDate;
//
//	@Column (name = "frequency")
//	private String frequency;
//	
//	@Column (name = "SNS")
//	private String sns;
//	
//	@Column (name = "PORTFOLIO")
//    private String portfolio;
//	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


//	public String getAlpha() {
//		return alpha;
//	}
//
//
//	public void setAlpha(String alpha) {
//		this.alpha = alpha;
//	}


	public String getSchemeCode() {
		return schemeCode;
	}


	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}


	public String getSolId() {
		return solId;
	}


	public void setSolId(String solId) {
		this.solId = solId;
	}


	public String getSanctionDate() {
		return sanctionDate;
	}


	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}


	public String getChannel() {
		return channel;
	}


	public void setChannel(String channel) {
		this.channel = channel;
	}


	public Date getBussDate() {
		return bussDate;
	}


	public void setBussDate(Date bussDate) {
		this.bussDate = bussDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getDummy() {
		return dummy;
	}


	public void setDummy(String dummy) {
		this.dummy = dummy;
	}


	public String getWkfExecIdIns() {
		return wkfExecIdIns;
	}


	public void setWkfExecIdIns(String wkfExecIdIns) {
		this.wkfExecIdIns = wkfExecIdIns;
	}


	public Date getRecInsertTs() {
		return recInsertTs;
	}


	public void setRecInsertTs(Date recInsertTs) {
		this.recInsertTs = recInsertTs;
	}


	public String getCunDate() {
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	     return cunDate.format(formatter);
	    }

		public void setCunDate(LocalDate cunDate) {
			this.cunDate = cunDate;
		}

	public DepositAccountData(String id, String customerName,  String schemeCode, String solId,
			String sanctionDate, String channel, Date bussDate, String status, String userId, String dummy,
			String wkfExecIdIns, Date recInsertTs, LocalDate cunDate) {
		super();
		this.id = id;
		this.customerName = customerName;
//		this.alpha = alpha;
		this.schemeCode = schemeCode;
		this.solId = solId;
		this.sanctionDate = sanctionDate;
		this.channel = channel;
		this.bussDate = bussDate;
		this.status = status;
		this.userId = userId;
		this.dummy = dummy;
		this.wkfExecIdIns = wkfExecIdIns;
		this.recInsertTs = recInsertTs;
		this.cunDate = cunDate;
	}


	public DepositAccountData() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
