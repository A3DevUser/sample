package com.pwt.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.cdi.Eager;

@Entity
@Table(name = "aaa_parent_header")
public class PartySheetParentHeader {
       
       @Id
       @Column(name = "ID")
    private String id;
       
       @Column(name = "HEADER")
       private String header;
       
       @Column(name = "STORE_VAL")
       private String storeValue;
       
       @Column (name = "FORM_ID")
       private String formId;
       
       @Column (name = "AUDIT_TYPE")
       private String auditType;

       public String getId() {
             return id;
       }

       public void setId(String id) {
             this.id = id;
       }

       public String getHeader() {
             return header;
       }

       public void setHeader(String header) {
             this.header = header;
       }

       public String getStoreValue() {
             return storeValue;
       }

       public void setStoreValue(String storeValue) {
             this.storeValue = storeValue;
       }

       public String getFormId() {
             return formId;
       }

       public void setFormId(String formId) {
             this.formId = formId;
       }

       public String getAuditType() {
             return auditType;
       }

       public void setAuditType(String auditType) {
             this.auditType = auditType;
       }

       public PartySheetParentHeader(String id, String header, String storeValue, String formId, String auditType) {
             super();
             this.id = id;
             this.header = header;
             this.storeValue = storeValue;
             this.formId = formId;
             this.auditType = auditType;
       }

       public PartySheetParentHeader() {
             super();
             // TODO Auto-generated constructor stub
       }

       
}
