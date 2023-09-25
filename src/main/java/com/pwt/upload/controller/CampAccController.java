package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.CampAccData;
import com.pwt.upload.model.SchemeData;
import com.pwt.upload.model.UniAccData;
import com.pwt.upload.model.UserCount;
import com.pwt.upload.repository.CampAccRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class CampAccController {
	
	@Autowired
	private CampAccRepository campAccRepository;
	
	@GetMapping ("FetchCampData")
	public List<CampAccData> getCampData() {
		return this.campAccRepository.findAll();
	}
	
	@GetMapping("campAccbysolandportfolio")
	public List<CampAccData> getCampAccountBySolAndPortfolio(@RequestParam String solId, @RequestParam String portfolioId) {
	    
		List<CampAccData> op = campAccRepository.getCampAccountsByPortfolioAndSolId(solId, portfolioId);
		return op;
	  }
	
//	@GetMapping("getUniAccountsByIds")
//	public List<CampAccData> getCampAccountById(@RequestParam List<String> accountId) {
//
//	    return campAccRepository.findAllById(accountId);
//	  }
	
	@GetMapping("campAccbysolid")
	public List<CampAccData> getCampAccountBySol(@RequestParam String solId) {
	    
		List<CampAccData> op = campAccRepository.findBySolId(solId);

	    return op;
	  }
	
	@GetMapping("CampschemeBySol")
	public List<SchemeData> getUniSchemeBySol(@RequestParam String solId) {
	    
	    List<Object[]> list = campAccRepository.getCampAccSchemeBySol(solId);
	    	    List<SchemeData> out = new ArrayList<>();
	            if (list != null && !list.isEmpty()) {
	                SchemeData schemeData = null;
	                for (Object[] object : list) {
	                	schemeData = new SchemeData();
	                	schemeData.setSchemeName(object[0].toString());
	                   
	                    out.add(schemeData);
	                }
	            }
	            
	            return out;
	  }
	
	@GetMapping("getCampAccountsByIds")
	public List<CampAccData> getCampAccountById(@RequestParam List<String> accountId) {

	    return campAccRepository.findAllById(accountId);
	  }
	
//	@GetMapping("getCampUserCount")
//	public List<UserCount> getUserCountByAudit(@RequestParam String auditId) {
//	    List<Object[]> list = campAccRepository.fetchCountofUsers(auditId);
//	    	    List<UserCount> out = new ArrayList<>();
//	            if (list != null && !list.isEmpty()) {
//	            	UserCount userCount = null;
//	                for (Object[] object : list) {
//	                	userCount = new UserCount();
//	                	userCount.setUserName(object[0].toString());
//	                	userCount.setTotal(Integer.parseInt(object[1].toString()));
//	                	userCount.setMandatoryCount(Integer.parseInt(object[2].toString()));
//	                	userCount.setNonMandatoryCount(Integer.parseInt(object[3].toString()));
//	                   
//	                    out.add(userCount);
//	                }
//	            }
//	            
//	            return out;
//	  }
//	
	

}
