package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="aaa_cun_test_data")
public class SampleTestData {
              
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
              
              public String getAreaName() {
                             return areaName;
              }
              public void setAreaName(String areaName) {
                             this.areaName = areaName;
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
              public String getFrequency() {
                             return frequency;
              }
              public void setFrequency(String frequency) {
                             this.frequency = frequency;
              }
              public SampleTestData(String id, String objective, String process, String subProcess, String testRef,
                                           String testTitle, String schemeCode, String auditId, String risk, String control, String areaName,
                                           String frequency) {
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
              }
              public SampleTestData() {
                             super();
                             // TODO Auto-generated constructor stub
              }
              @Override
              public String toString() {
                             return "SampleTestData [id=" + id + ", objective=" + objective + ", process=" + process + ", subProcess="
                                                          + subProcess + ", testRef=" + testRef + ", testTitle=" + testTitle + ", schemeCode=" + schemeCode
                                                          + ", auditId=" + auditId + ", risk=" + risk + ", control=" + control + ", areaName=" + areaName
                                                          + ", frequency=" + frequency + "]";
                             
                             
              }
              
              

              
              
}
