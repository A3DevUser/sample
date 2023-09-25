package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.AuditTypeMappingData;
import com.pwt.upload.repository.AuditTypeMappRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class AuditTypeMappContoller {
	
	
	@Autowired
	private AuditTypeMappRepository auditTypeRepository;
	
	@GetMapping ("fetchTable")
	public List<T[]> getTableName ( @RequestParam String auditTypeName) {
		return  auditTypeRepository.getByAuditTypeIdAndTableName( auditTypeName);
         
		
	}
	
	
	

}
