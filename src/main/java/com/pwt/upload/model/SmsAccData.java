package com.pwt.upload.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "AAA_SMS_ACC")
public class SmsAccData {

	@Id
	@Column (name = "REGISTRATION_NO")
	private String registrationId;
	
	@Column (name = "NAME_OF_APPLICANT")
	private String nameOfApplicant;
	
	@Column (name = "SOURCE_OF_LEAD")
	private String sourceOfLead;
	
	@Column (name = "LIMIT_SANCTIONED")
	private String limitOfSanctioned;
	
	@Column (name = "PURPOSE_OF_LOAN")
	private String purposeOfLoan;
	
	@Column (name = "DATE_OF_SANCTION")
	private Date dateOfSanction ;
	
	@Column (name = "SANCTIONING_AUTHORITY")
	private String sanctioningAuthority;
	
	@Column (name = "DESIGNATION")
	private String designation;
	
	@Column (name = "POSTION")
	private String postion;
	
	@Column (name = "PARKING_BRANCH")
	private String parkingBranch;
	
	@Column (name = "SMS_CODE")
	private String smsCode;
	
	@Column (name = "SMS_NAME")
	private String smsName;
	
	@Column (name = "SMSSOLEID")
	private int smsSoleid;
	
	@Column (name = "REGION")
	private String region;
	
	@Column (name = "ZONE")
	private String zone;
	
	@Column (name = "DEVIATION")
	private String deviation;

	@Column (name = "ROI")
	private int roi ;
	
	@Column (name = "CONCESSION_ROI")
	private int concessionRoi ;
	
	@Column (name = "SCHEME")
	private String scheme;
	
	@Column (name = "COMBINE_FOIR")
	private int combineFFoir ;
	
	@Column (name = "REPAYMENT_PERIOD")
	private int repaymentPeriod ;
	
	@Column (name = "PROPOSAL_TYPE")
	private String proposalType;
	
	@Column (name = "INTERNAL_CREDIT_RATING")
	private int internalCreditRating ;
	
	@Column (name = "DATE_OF_INSPECTION")
	private Date dateOfInspection ;
	
	@Column (name = "DATE_OF_VALUATION")
	private Date dateOfValuation ;
	
	@Column (name = "DATE_OF_TCR")
	private Date dateOfTcr ;
	
	@Column (name = "UPFRONT_PROCESSING_CHARGES")
	private int upfrontProcessingCharges;
	
	@Column (name = "IN_PRINCIPAL_SANCTION")
	private int inPrincipalSanction;
	
	@Column (name = "STAFF")
	private String staff;
	
	@Column (name = "BUSS_DATE")
	private Date busDate ;
	
	@Column (name = "SAMPLED")
	private String sampled;
	
	
	
	
	
}
