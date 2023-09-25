package com.pwt.upload.model;

//@Entity
//@Table(name = "SCHEME_DATA")
public class SchemeData {

	
//	@Id
//	@Column(name="ID")
//	private String id;
//	
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

//	@Column(name = "SCHEME_NAME")
	private String schemeName;

	public SchemeData() {
		super();
	}

	public SchemeData(String schemeName) {
		super();
		this.schemeName = schemeName;
//		this.id = id;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

}
