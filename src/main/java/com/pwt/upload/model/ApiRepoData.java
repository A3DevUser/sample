package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AAA_API_REPO")
public class ApiRepoData {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "API")
	private String api;
	
	@Column (name = "API_ID")
	private String apiId;
	
	@Column (name = "API_TYPE")
	private String apiType;
	
	@Column (name = "FORM_ID")
	private String formId;
	
	@Column (name = "PORTFOLIO")
	private String portfolio;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}
	
	

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	

	public ApiRepoData(String id, String api, String apiId, String apiType, String formId, String portfolio) {
		super();
		this.id = id;
		this.api = api;
		this.apiId = apiId;
		this.apiType = apiType;
		this.formId = formId;
		this.portfolio = portfolio;
	}

	public ApiRepoData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
