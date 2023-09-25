package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AAA_BRANCH_DETAILS")
public class BranchData {

	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "BRANCH_NAME")
	private String branchName;
	
	@Column(name = "AREA_NAME")
	private String areaName;
	
	@Column (name = "SNS")
	private String sns;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getSns() {
		return sns;
	}

	public void setSns(String sns) {
		this.sns = sns;
	}

	public BranchData(String id, String branchName, String areaName, String sns) {
		super();
		this.id = id;
		this.branchName = branchName;
		this.areaName = areaName;
		this.sns = sns;
	}

	public BranchData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
