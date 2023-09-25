package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.cdi.Eager;

@Entity
@Table (name = "AAA_DROPDOWN_LIST")
public class DropdownData {

	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column (name = "FORM_ID")
	private String formId;
	
	@Column (name = "DROPDOWN_TITLE")
	private String dropdownTitle;
	
	@Column (name = "DROPDOWN_VALUE")
	private String dropdownValue;
	
	@Column (name = "FILTER_NAME")
	private String filterName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getDropdownTitle() {
		return dropdownTitle;
	}

	public void setDropdownTitle(String dropdownTitle) {
		this.dropdownTitle = dropdownTitle;
	}

	public String getDropdownValue() {
		return dropdownValue;
	}

	public void setDropdownValue(String dropdownValue) {
		this.dropdownValue = dropdownValue;
	}
	
	

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	

	public DropdownData(String id, String formId, String dropdownTitle, String dropdownValue, String filterName) {
		super();
		this.id = id;
		this.formId = formId;
		this.dropdownTitle = dropdownTitle;
		this.dropdownValue = dropdownValue;
		this.filterName = filterName;
	}

	public DropdownData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
