package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.AuditData;
import com.pwt.upload.model.AuditDataObject;
import com.pwt.upload.repository.AuditRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class AuditController {
	
	@Autowired
	private AuditRepository auditRepository;
	
//	@GetMapping("AuditData/{id}")
//	public Optional<AuditData> getAccountById(@PathVariable String id) {
//	    
//	    return auditRepository.findById(id);
//	  }
	
	 @GetMapping ("getAuditData")
	    public List<AuditDataObject> getAuditData( @RequestParam String id) {
	          
	          List<Object[]> list = auditRepository.getAuditData(id);
	        List<AuditDataObject> out = new ArrayList<>();
	     if (list != null && !list.isEmpty()) {
	    	 AuditDataObject auditData = null;
	         for (Object[] object : list) {
	        	 auditData = new AuditDataObject();
	        	 auditData.setId(object[0].toString());
	        	 auditData.setAuditTitle(object[1].toString());
	        	 auditData.setSolId(object[2].toString());
	        	 auditData.setStatus(object[3].toString());
	        	 auditData.setAuditType(object[4].toString());
	            
	          
	             out.add(auditData);
	         }
	     }
	     
	     return out;
	     
	}
	     
	 
}
