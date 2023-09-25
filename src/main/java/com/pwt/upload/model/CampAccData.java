package com.pwt.upload.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "AAA_CAMP_ACC")
public class CampAccData {
	
	@Id
	@Column(name = "REGISTRATION_NO")
	private String id;
	
	@Column (name = "NAME_OF_APPLICANT")
	private String customerName;
	
	@Column (name = "LIMIT_SANCTIONED")
	private String limitSanctioned;
	
	@Column (name = "DATE_OF_SANCTION")
	private String dateOfSanction;
	
	@Column (name = "SANCTIONING_AUTHORITY")
	private String sanctioningAutority;
	
	@Column (name = "DESIGNATION")
	private String designation;
	
	@Column (name = "POSTION")
	private String position;
	
	@Column (name = "NAME_OF_PARKING_BRANCH")
	private String nameOfParkingBranch;
	
	@Column (name = "SOL_ID")
	private String solId;
	
	@Column (name = "REGION")
	private String region;
	
	@Column (name = "ZONE")
	private String zone;
	
	@Column (name = "DEVIATION")
	private String deviation;
	
	@Column (name = "PRODUCT")
	private String product;
	
	@Column (name = "SCHEME_CODE")
	private String schemeCode;
	
	@Column (name = "PURPOSE")
	private String purpose;
	
	@Column (name = "DATE_OF_INSPECTION")
	private String dateOfInspection;
	
	@Column (name = "DATE_OF_VALUATION")
	private String dateOfValuation;
	
	@Column (name = "IN_PRINCIPAL_SANCTION")
	private String inPrincipalSanction;
	
	@Column (name = "CAMP_ZONE")
	private String campZone;
	
	@Column (name = "BUSS_DATE")
	private Date bussDate;
	
	@Column (name = "SAMPLED")
	private String sampled;
	
	@Column (name = "USERID")
	private String userId;
	
	@Column (name = "DUMMY")
	private String dummy;

	@Column(name = "MANDATORY")
	private String mandatory;
	
	
	
	public String getMandatory() {
		return mandatory;
	}

	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}

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

	public String getLimitSanctioned() {
		return limitSanctioned;
	}

	public void setLimitSanctioned(String limitSanctioned) {
		this.limitSanctioned = limitSanctioned;
	}

	public String getDateOfSanction() {
		return dateOfSanction;
	}

	public void setDateOfSanction(String dateOfSanction) {
		this.dateOfSanction = dateOfSanction;
	}

	public String getSanctioningAutority() {
		return sanctioningAutority;
	}

	public void setSanctioningAutority(String sanctioningAutority) {
		this.sanctioningAutority = sanctioningAutority;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNameOfParkingBranch() {
		return nameOfParkingBranch;
	}

	public void setNameOfParkingBranch(String nameOfParkingBranch) {
		this.nameOfParkingBranch = nameOfParkingBranch;
	}

	public String getSolId() {
		return solId;
	}

	public void setSolId(String solId) {
		this.solId = solId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getDeviation() {
		return deviation;
	}

	public void setDeviation(String deviation) {
		this.deviation = deviation;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDateOfInspection() {
		return dateOfInspection;
	}

	public void setDateOfInspection(String dateOfInspection) {
		this.dateOfInspection = dateOfInspection;
	}

	public String getDateOfValuation() {
		return dateOfValuation;
	}

	public void setDateOfValuation(String dateOfValuation) {
		this.dateOfValuation = dateOfValuation;
	}

	public String getInPrincipalSanction() {
		return inPrincipalSanction;
	}

	public void setInPrincipalSanction(String inPrincipalSanction) {
		this.inPrincipalSanction = inPrincipalSanction;
	}

	public String getCampZone() {
		return campZone;
	}

	public void setCampZone(String campZone) {
		this.campZone = campZone;
	}

	public Date getBussDate() {
		return bussDate;
	}

	public void setBussDate(Date bussDate) {
		this.bussDate = bussDate;
	}

	public String getSampled() {
		return sampled;
	}

	public void setSampled(String sampled) {
		this.sampled = sampled;
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

	

	public CampAccData(String id, String customerName, String limitSanctioned, String dateOfSanction,
			String sanctioningAutority, String designation, String position, String nameOfParkingBranch, String solId,
			String region, String zone, String deviation, String product, String schemeCode, String purpose,
			String dateOfInspection, String dateOfValuation, String inPrincipalSanction, String campZone, Date bussDate,
			String sampled, String userId, String dummy, String mandatory) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.limitSanctioned = limitSanctioned;
		this.dateOfSanction = dateOfSanction;
		this.sanctioningAutority = sanctioningAutority;
		this.designation = designation;
		this.position = position;
		this.nameOfParkingBranch = nameOfParkingBranch;
		this.solId = solId;
		this.region = region;
		this.zone = zone;
		this.deviation = deviation;
		this.product = product;
		this.schemeCode = schemeCode;
		this.purpose = purpose;
		this.dateOfInspection = dateOfInspection;
		this.dateOfValuation = dateOfValuation;
		this.inPrincipalSanction = inPrincipalSanction;
		this.campZone = campZone;
		this.bussDate = bussDate;
		this.sampled = sampled;
		this.userId = userId;
		this.dummy = dummy;
		this.mandatory = mandatory;
	}

	public CampAccData() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	

}
