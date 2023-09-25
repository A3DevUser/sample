package com.pwt.upload.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AAA_CPC_ACC")
public class CpcAccData {
	
	@Id
	@Column (name = "REGISTRATION_NO")
	private String registrationNo;
	
	@Column (name = "CUSTOMERNAME")
	private String customerName;
	
	@Column (name = "LEAD_ID")
	private String leadId;
	
	@Column (name = "LEAD_CAPTURE_DAT")
	private String leadCaptureDat;
	
	@Column (name = "BRCODE")
	private String brCode;
	
	@Column (name = "BRNAME")
	private String brName;
	
	@Column (name = "SMS")
	private String sms;
	
	@Column (name = "SMS_LINK_CPC")
	private String smsLinkCpc;
	
	@Column (name = "REGION")
	private String region;
	
	@Column (name = "ZONE")
	private String zone;
	
	@Column (name = "PRODUCT_TYPE")
	private String productType;
	
	@Column (name = "SCHEME_TYPE")
	private String SCHEMEtYPE;
	
	@Column (name = "SCHEME")
	private String scheme;
	
	@Column (name = "SCHEME_CODE")
	private String schemeCode;
	
	@Column (name = "APP_ID_PSB")
	private String appIdPsb;
	
	@Column (name = "EMAIL_ID1")
	private String emailId1;
	
	@Column (name = "PROPOSAL_TYPE")
	private String proposalType;
	
	@Column (name = "MOBILE_NUMBER")
	private String mobileNumber;
	
	@Column (name = "CASE_INITIATOR")
	private String caseInitiator;
	
	@Column (name = "SANCTION_AMOUNT")
	private String sanctionAmount;
	
	@Column (name = "ROI")
	private String roi;
	
	@Column (name = "DECISION")
	private String decision;
	
	@Column (name = "SANCTION_DATE")
	private String sanctionDate;
	
	
	@Column (name = "EMAIL_ID")
	private String emailId;
	
	@Column (name = "PAN_NUMBER")
	private String panNumber;
	
	@Column (name = "AADHAAR_NUMBER")
	private String aadhaarNumber;
	
	
	@Column (name = "CIBIL_SCORE")
	private String cibilScore;
	
	@Column (name = "LOAN_ACCT_NUMBER")
	private String loanAcctNumber;
	
	@Column (name = "BUSINESS_DATE")
	private Date businessDate;
	
	@Column (name = "SAMPLED")
	private String sampled;

	
	
}
