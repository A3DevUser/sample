package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="aaa_dummy_test")
public class DummyTestData {
              
              @Id
              @Column(name = "ID")
              private String id;
              
              @Column(name = "OBJECTIVE")
              private String objective;
              
              @Column(name = "PROCESS")
              private String process;   
              
              @Column(name = "SUB_PROCESS")
              private String subProcess;
              
              @Column(name = "TEST_REF")
              private String testRef;
              
              @Column(name = "TEST_TITLE")
              private String testTitle;
              
              @Column(name = "SCHEME_CODE")
              private String schemeCode;
              
              @Column(name = "audit_id")
              private String auditId;
              
              @Column(name = "RISK")
              private String risk;
              
              @Column(name = "CONTROL")
              private String control;

              @Column(name = "AREA_NAME")
              private String areaName;
              
              @Column(name = "FREQUENCY")
              private String frequency;
              
              @Column(name = "INPUT_TYPE")
              private String inputType;

              @Column(name = "DROP_DOWN")
              private String dropDown;
              
              @Column(name = "LOGIC")
              private String logic;
              
              @Column(name = "MIX_VAL")
              private String mixVal;
              
              @Column(name = "MAX_VAL")
              private String maxVal;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getObjective() {
				return objective;
			}

			public void setObjective(String objective) {
				this.objective = objective;
			}

			public String getProcess() {
				return process;
			}

			public void setProcess(String process) {
				this.process = process;
			}

			public String getSubProcess() {
				return subProcess;
			}

			public void setSubProcess(String subProcess) {
				this.subProcess = subProcess;
			}

			public String getTestRef() {
				return testRef;
			}

			public void setTestRef(String testRef) {
				this.testRef = testRef;
			}

			public String getTestTitle() {
				return testTitle;
			}

			public void setTestTitle(String testTitle) {
				this.testTitle = testTitle;
			}

			public String getSchemeCode() {
				return schemeCode;
			}

			public void setSchemeCode(String schemeCode) {
				this.schemeCode = schemeCode;
			}

			public String getAuditId() {
				return auditId;
			}

			public void setAuditId(String auditId) {
				this.auditId = auditId;
			}

			public String getRisk() {
				return risk;
			}

			public void setRisk(String risk) {
				this.risk = risk;
			}

			public String getControl() {
				return control;
			}

			public void setControl(String control) {
				this.control = control;
			}

			public String getAreaName() {
				return areaName;
			}

			public void setAreaName(String areaName) {
				this.areaName = areaName;
			}

			public String getFrequency() {
				return frequency;
			}

			public void setFrequency(String frequency) {
				this.frequency = frequency;
			}

			public String getInputType() {
				return inputType;
			}

			public void setInputType(String inputType) {
				this.inputType = inputType;
			}

			public String getDropDown() {
				return dropDown;
			}

			public void setDropDown(String dropDown) {
				this.dropDown = dropDown;
			}

			public String getLogic() {
				return logic;
			}

			public void setLogic(String logic) {
				this.logic = logic;
			}

			public String getMixVal() {
				return mixVal;
			}

			public void setMixVal(String mixVal) {
				this.mixVal = mixVal;
			}

			public String getMaxVal() {
				return maxVal;
			}

			public void setMaxVal(String maxVal) {
				this.maxVal = maxVal;
			}

			public DummyTestData(String id, String objective, String process, String subProcess, String testRef,
					String testTitle, String schemeCode, String auditId, String risk, String control, String areaName,
					String frequency, String inputType, String dropDown, String logic, String mixVal, String maxVal) {
				super();
				this.id = id;
				this.objective = objective;
				this.process = process;
				this.subProcess = subProcess;
				this.testRef = testRef;
				this.testTitle = testTitle;
				this.schemeCode = schemeCode;
				this.auditId = auditId;
				this.risk = risk;
				this.control = control;
				this.areaName = areaName;
				this.frequency = frequency;
				this.inputType = inputType;
				this.dropDown = dropDown;
				this.logic = logic;
				this.mixVal = mixVal;
				this.maxVal = maxVal;
			}

			public DummyTestData() {
				super();
				// TODO Auto-generated constructor stub
			}
              
              
			
}
