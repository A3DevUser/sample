package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.AccountData;
import com.pwt.upload.model.SchemeData;
import com.pwt.upload.model.UniAccData;
import com.pwt.upload.model.UserCount;
import com.pwt.upload.repository.UniAccRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class UniAccController {
	
	
	@Autowired
	private UniAccRepository uniAccRepository;
	
	@GetMapping ("FetchUniData")
	public List<UniAccData> getUniData() {
		return this.uniAccRepository.findAll();
	}

	
	@GetMapping("uniAccbysolandportfolio")
	public List<UniAccData> getUniAccountBySolAndPortfolio(@RequestParam String solId, @RequestParam String portfolioId) {
	    
		List<UniAccData> op = uniAccRepository.getUniAccountsByPortfolioAndSolId(solId, portfolioId);
		return op;
	  }
	
//	@GetMapping("getUniAccountsByIds")
//	public List<UnIAccData> getUniAccountById(@RequestParam List<String> accountId) {
//
//	    return uniAccRepository.findAllById(accountId);
//	  }
	
	
	@GetMapping("uniAccbysolid")
	public List<UniAccData> getUniAccountBySol(@RequestParam String solId) {
	    
		List<UniAccData> op = uniAccRepository.findBySolId(solId);

	    return op;
	  }
	
	@GetMapping("UnischemeBySol")
	public List<SchemeData> getUniSchemeBySol(@RequestParam String solId) {
	    
//	    return accountRepository.getSchemeBySol(solId);
	    List<Object[]> list = uniAccRepository.getUniAccSchemeBySol(solId);
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
	
	@GetMapping("getUniAccountsByIds")
	public List<UniAccData> getUniAccountById(@RequestParam List<String> accountId) {

	    return uniAccRepository.findAllById(accountId);
	  }
	
//	@GetMapping("getUniUserCount")
//	public List<UserCount> getUserCountByAudit(@RequestParam String auditId) {
//	    List<Object[]> list = uniAccRepository.fetchCountofUsers(auditId);
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
}


