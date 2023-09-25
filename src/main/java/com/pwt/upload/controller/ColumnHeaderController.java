package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.AccConfigData;
import com.pwt.upload.model.ColumnHeaderData;
import com.pwt.upload.model.UserCount;
//import com.pwt.upload.repository.AccConfigRepository;
import com.pwt.upload.repository.ColumnHeaderRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class ColumnHeaderController {

	@Autowired
	private ColumnHeaderRepository columnHeaderRepository;
	
//	private AccConfigRepository accConfigRepository;
	
	@GetMapping("columnHeader")
	public List<ColumnHeaderData> getAllData(){
		return this.columnHeaderRepository.findAll();
	}
	
	
	@GetMapping("columnHeader/{formId}")
	public List<ColumnHeaderData> getSchemeCode (@PathVariable String formId) {
		return columnHeaderRepository.findByFormId(formId);
		
		
}
//	@GetMapping("getByFormIdAndAuditType")
//	public List<ColumnHeaderData> getSchemeCode (@RequestParam String formId, @RequestParam String auditType) {
//		return columnHeaderRepository.getByFormIdAndAuditType(formId, auditType);
//
//		
//		
//}
	
	
	@GetMapping("getByFormIdAndAuditTypeAndArea")
	public List<ColumnHeaderData> getSchemeCode (@RequestParam String formId, @RequestParam String auditType, @RequestParam String areaName, @RequestParam String sns) {
		return columnHeaderRepository.getByFormIdAndAuditTypeAndAreaNameAndSns(formId, auditType, areaName, sns);

		
		
}
	
	@GetMapping("getColumnHeader")
	public List<ColumnHeaderData> getColumnHeader (@RequestParam String formId,
			                                       @RequestParam String auditType,
			                                       @RequestParam String areaName,
			                                       @RequestParam String portfolio,
			                                       @RequestParam String sns) {
		return columnHeaderRepository.getByFormIdAndAuditTypeAndAreaNameAndPortfolioAndSns(formId, auditType, areaName, portfolio, sns);

		
		
}
	
	
//	
//	@GetMapping("acc") 
//	public List<Object> getAcc(){
//		return columnHeaderRepository.getAccData();
//		
//	}
	
//	@GetMapping("fetchColumnData")
//	public List<String> getUserCountByAudit(@RequestParam List<String> auditTypeName, @RequestParam String tableName ) {
//	    List<String> list = columnHeaderRepository.getAccData(auditTypeName,tableName );
//	          
//	                
//	            
//	            return list;
//	            
//	  }
	
	
	
	
}
