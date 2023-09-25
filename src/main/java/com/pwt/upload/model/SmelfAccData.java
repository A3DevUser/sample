package com.pwt.upload.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "AAA_SMELF_ACC")
public class SmelfAccData {
	
	@Id
	@Column (name = "REGISTRATION_NO")
	private String registrationNo;
	
	@Column (name = "EFFECTIVEROI")
	private int effectiveRoi;
	
	@Column (name = "NAME_APPLICANT")
	private String nameApplicant;
	
	@Column (name = "LIMIT_SANCTIONED")
	private int limitSanctioned ;
	
	@Column (name = "SANCTION_DATE")
	private Date sanctionedDate ;
	
	@Column (name = "INSERTION_DATETIME")
	private Date insertionDateTime ;
	
	@Column (name = "SOURCE_OF_LEAD")
	private String sourceOfLead;
	
	@Column (name = "SANCTIONING_AUTHORITY")
	private String sanctioningAuthority;
	
	@Column (name = "BRANCH_NAME")
	private String branchName;
	
	@Column (name = "SOL_ID_QDE")
	private String solIdQde;
	
	@Column (name = "REGION")
	private String region;
	
	@Column (name = "ZONE")
	private String zone;
	
	@Column (name = "PROPOSAL_TYPE")
	private String proposalType;
	
	@Column (name = "SHORT_TERM_RATING")
	private String shortTermRating;
	
	@Column (name = "LONG_TERM_RATING")
	private String longTermRating;
	
	@Column (name = "INDUSTRY")
	private String industry;
	
	@Column (name = "SECTOR")
	private String sector;
	
	@Column (name = "ACTIVITY_NAME")
	private String activityName;
	
	@Column (name = "DATE_OF_INSPECTION")
	private Date dateOfInspection ;
	
	@Column (name = "DATE_OF_VALUATION")
	private Date dateOfValuation;
	
	@Column (name = "IN_PRINCIPAL_SANCTION")
	private String inPrincipalSanction;
	
	@Column (name = "STAFF")
	private String staff;
	
	@Column (name = "SOL_ID")
	private String solId;
	
	@Column (name = "SMELF")
	private String smelf;
	
	@Column (name = "BUSINESS_DATE")
	private Date businessDate;
	
	@Column (name = "SAMPLED")
	private String sampled;
	
	

}
