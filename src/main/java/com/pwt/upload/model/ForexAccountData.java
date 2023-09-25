package com.pwt.upload.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


	
	
	@Entity
	@Table(name = "aaa_frx_acc_data")
	public class ForexAccountData {
		
		
		@Id
		@Column(name = "ACCOUNT_NUMBER")
		private String id;
		
		@Column(name = "ACCOUNT_NAME")	
		private String customerName;
		
		@Column(name = "AUDIT_DATE")
		@JsonFormat(pattern="dd-MM-yyyy")
		private Date auditDate;
		
		@Column(name = "OUTSTANDING_BALANCE")
		private int outstandingAmt;
		
		@Column(name = "OVERDUES")
		private int overdue;
		
		@Column(name = "CUSTOMER_ID")
		private String customerId;
		
		@Column(name = "SCHEME_CODE")
		private String schemeCode;
		
		@Column(name = "SOL_ID")
		private String solId;
		
		@Column(name = "MANDATORY")
		private String mandatory;
		
		@Column(name = "SANCTION_DATE")
		private String sanctionDate;
		
		@Column(name = "LIMIT")
		private String limit;
		
		@Column(name = "OVERDUES_SINCE")
		private String overduesSince;
		
		@Column(name = "ROI")
		private String roi;
		
		@Column(name = "ASSET_CLASS")
		private String assetClass;
		
		@Column(name = "DESCRIPTION_OF_ACTIVITY")
		private String descOfActivity;
		
		@Column(name = "ZONE")
		private String zone;
		
		@Column(name = "REGION")
		private String region;
		
		@Column(name = "BRANCH_NAME")
		private String branchName;
		
		@Column(name = "SCHEME_DESCRIPTION")
		private String schemeDesc;
		
		@Column(name = "STATUS")
		private String status;
		
		@Column(name = "USERID")
		private String userId;
		
		@Column (name="DUMMY")
		private String dummy;
		
		@Column(name="dummy2")
		private String dummy2;
		
		@Column(name="dummy3")
		private String dummy3;
		
		@Column(name="GROUP_NAME")
		private String groupName;
		
		@Column(name="Internal_rating")
		private String internalTraining;
		
		@Column(name="Business_segment")
		private String buisnessSegment;
		
		@Column(name="Group_exposure")
		private String groupExposure;
		
		@Column(name="Security_perfection_status")
		private String securityPerfectionStatus;
		
		@Column(name = "CUN_BRANCH_NAME")
	    private String cunBranchName;
		
		@Column(name = "CUN_AREA_NAME")
		private String cunAreaName;
		
		@Column(name = "CUN_DATE")
		private String cunDate;

		@Column (name = "frequency")
		private String frequency;
		
		@Column (name = "SNS")
		private String sns;
		
		@Column (name = "PORTFOLIO")
	    private String portfolio;
		
		
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

		public Date getAuditDate() {
			return auditDate;
		}

		public void setAuditDate(Date auditDate) {
			this.auditDate = auditDate;
		}

		public int getOutstandingAmt() {
			return outstandingAmt;
		}

		public void setOutstandingAmt(int outstandingAmt) {
			this.outstandingAmt = outstandingAmt;
		}

		public int getOverdue() {
			return overdue;
		}

		public void setOverdue(int overdue) {
			this.overdue = overdue;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

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

		public String getMandatory() {
			return mandatory;
		}

		public void setMandatory(String mandatory) {
			this.mandatory = mandatory;
		}

		public String getSanctionDate() {
			return sanctionDate;
		}

		public void setSanctionDate(String sanctionDate) {
			this.sanctionDate = sanctionDate;
		}

		public String getLimit() {
			return limit;
		}

		public void setLimit(String limit) {
			this.limit = limit;
		}

		public String getOverduesSince() {
			return overduesSince;
		}

		public void setOverduesSince(String overduesSince) {
			this.overduesSince = overduesSince;
		}

		public String getRoi() {
			return roi;
		}

		public void setRoi(String roi) {
			this.roi = roi;
		}

		public String getAssetClass() {
			return assetClass;
		}

		public void setAssetClass(String assetClass) {
			this.assetClass = assetClass;
		}

		public String getDescOfActivity() {
			return descOfActivity;
		}

		public void setDescOfActivity(String descOfActivity) {
			this.descOfActivity = descOfActivity;
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

		public String getBranchName() {
			return branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public String getSchemeDesc() {
			return schemeDesc;
		}

		public void setSchemeDesc(String schemeDesc) {
			this.schemeDesc = schemeDesc;
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

		public String getDummy2() {
			return dummy2;
		}

		public void setDummy2(String dummy2) {
			this.dummy2 = dummy2;
		}

		public String getDummy3() {
			return dummy3;
		}

		public void setDummy3(String dummy3) {
			this.dummy3 = dummy3;
		}

		public String getGroupName() {
			return groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getInternalTraining() {
			return internalTraining;
		}

		public void setInternalTraining(String internalTraining) {
			this.internalTraining = internalTraining;
		}

		public String getBuisnessSegment() {
			return buisnessSegment;
		}

		public void setBuisnessSegment(String buisnessSegment) {
			this.buisnessSegment = buisnessSegment;
		}

		public String getGroupExposure() {
			return groupExposure;
		}

		public void setGroupExposure(String groupExposure) {
			this.groupExposure = groupExposure;
		}

		public String getSecurityPerfectionStatus() {
			return securityPerfectionStatus;
		}

		public void setSecurityPerfectionStatus(String securityPerfectionStatus) {
			this.securityPerfectionStatus = securityPerfectionStatus;
		}

		public String getCunBranchName() {
			return cunBranchName;
		}

		public void setCunBranchName(String cunBranchName) {
			this.cunBranchName = cunBranchName;
		}

		public String getCunAreaName() {
			return cunAreaName;
		}

		public void setCunAreaName(String cunAreaName) {
			this.cunAreaName = cunAreaName;
		}

		public String getCunDate() {
			return cunDate;
		}

		public void setCunDate(String cunDate) {
			this.cunDate = cunDate;
		}
		
		
		

		public String getFrequency() {
			return frequency;
		}

		public void setFrequency(String frequency) {
			this.frequency = frequency;
		}

		public String getSns() {
			return sns;
		}

		public void setSns(String sns) {
			this.sns = sns;
		}

		
		
		

		public String getPortfolio() {
			return portfolio;
		}

		public void setPortfolio(String portfolio) {
			this.portfolio = portfolio;
		}

		

		public ForexAccountData(String id, String customerName, Date auditDate, int outstandingAmt, int overdue,
				String customerId, String schemeCode, String solId, String mandatory, String sanctionDate, String limit,
				String overduesSince, String roi, String assetClass, String descOfActivity, String zone, String region,
				String branchName, String schemeDesc, String status, String userId, String dummy, String dummy2,
				String dummy3, String groupName, String internalTraining, String buisnessSegment, String groupExposure,
				String securityPerfectionStatus, String cunBranchName, String cunAreaName, String cunDate, String frequency,
				String sns, String portfolio) {
			super();
			this.id = id;
			this.customerName = customerName;
			this.auditDate = auditDate;
			this.outstandingAmt = outstandingAmt;
			this.overdue = overdue;
			this.customerId = customerId;
			this.schemeCode = schemeCode;
			this.solId = solId;
			this.mandatory = mandatory;
			this.sanctionDate = sanctionDate;
			this.limit = limit;
			this.overduesSince = overduesSince;
			this.roi = roi;
			this.assetClass = assetClass;
			this.descOfActivity = descOfActivity;
			this.zone = zone;
			this.region = region;
			this.branchName = branchName;
			this.schemeDesc = schemeDesc;
			this.status = status;
			this.userId = userId;
			this.dummy = dummy;
			this.dummy2 = dummy2;
			this.dummy3 = dummy3;
			this.groupName = groupName;
			this.internalTraining = internalTraining;
			this.buisnessSegment = buisnessSegment;
			this.groupExposure = groupExposure;
			this.securityPerfectionStatus = securityPerfectionStatus;
			this.cunBranchName = cunBranchName;
			this.cunAreaName = cunAreaName;
			this.cunDate = cunDate;
			this.frequency = frequency;
			this.sns = sns;
			this.portfolio = portfolio;
		}

		public ForexAccountData() {
			super();
			// TODO Auto-generated constructor stub
		}
		

	}
