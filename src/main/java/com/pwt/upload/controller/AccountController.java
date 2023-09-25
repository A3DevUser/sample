package com.pwt.upload.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.crypto.interfaces.DHPublicKey;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.download.DownloadExcel;
import com.pwt.upload.model.AccConfigData;
import com.pwt.upload.model.AccountData;
import com.pwt.upload.model.OutputData;
import com.pwt.upload.model.SchemeData;
import com.pwt.upload.model.UserCount;
//import com.pwt.upload.repository.AccConfigRepository;
import com.pwt.upload.repository.AccountRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class AccountController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	
	@Autowired
	private AccountRepository accountRepository;
	
	private DownloadExcel ex;	
	
//	private AccConfigRepository accConfigRepository;
	
	@GetMapping("sampleAccData")
	public List<AccountData> getAllAccounts(){
		
		long startTime = System.currentTimeMillis();
		List<AccountData> op = accountRepository.findAll();
		long duration = System.currentTimeMillis() - startTime;		
		logger.error("get Accounts = " + duration ) ;
//	    return accountRepository.getAccountsByPortfolioAndSolId
		
//		return this.accountRepository.findAll();
		return op;
		
		
	}
	
//	@GetMapping("AccData/{schemeCode}")
//	public List<AccountData> getSchemeCode (@PathVariable String schemeCode) {
//		return accountRepository.findBySchemeCode(schemeCode);
//	}
//	@GetMapping("/AccData/{id}")
////	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
//	public  ResponseEntity<AccountData> getAccount(@PathVariable(value="id") String id){
//		logger.error(id);
//		Optional<AccountData> data = accountRepository.findById(id);
//		logger.error(data.get().toString());
//		return new ResponseEntity<>(data.get(), HttpStatus.OK);
//	}
	
//	@GetMapping("AccData/{id}")
//	public AccountData
//	  getById(@PathVariable String id) {
//		logger.error(id);
//		AccountData data = accountRepository.getById(id);
//		logger.error(data.getId());
//	    return data;
//	}
	
	@GetMapping("sampleAccData/{id}")
	public Optional<AccountData> getAccountById(@PathVariable String id) {


	    return accountRepository.findById(id);
	  }			
	
	
	@GetMapping("getAccountsByIds")
	public List<AccountData> getAccountById(@RequestParam List<String> accountId) {

	    return accountRepository.findAllById(accountId);
	  }
	
	@GetMapping("accbysolandscheme")
	public List<AccountData> getAccountBySolAndScheme(@RequestParam String solId, @RequestParam String schemeCode) {
	    
	    return accountRepository.findBySolIdAndSchemeCode(solId, schemeCode);
	  }
	
	
	
	
	@GetMapping("accbysolandportfolio")
	public List<AccountData> getAccountBySolAndPortfolio(@RequestParam String solId, @RequestParam String portfolioId) {
	    
		long startTime = System.currentTimeMillis();
		List<AccountData> op = accountRepository.getAccountsByPortfolioAndSolId(solId, portfolioId);
		long duration = System.currentTimeMillis() - startTime;		
		logger.error("FetchAccountBYSOL = " + duration ) ;
//	    return accountRepository.getAccountsByPortfolioAndSolId(solId, portfolioId);
		return op;
	  }
	
	@GetMapping("Sampleaccbysolid")
	public List<AccountData> getAccountBySol(@RequestParam String solId) {
	    
		long startTime = System.currentTimeMillis();
		List<AccountData> op = accountRepository.findBySolId(solId);
		long duration = System.currentTimeMillis() - startTime;		
		logger.error("FetchAccount = " + duration ) ;

	    return op;
	  }
	
	@GetMapping("SampleschemeBySol")
	public List<SchemeData> getSchemeBySol(@RequestParam String solId) {
	    
//	    return accountRepository.getSchemeBySol(solId);
	    List<Object[]> list = accountRepository.getSchemeBySol(solId);
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
	
//	@GetMapping("getUserCount")
//	public List<UserCount> getUserCountByAudit(@RequestParam String auditId) {
//	    List<Object[]> list = accountRepository.fetchCountofUsers(auditId);
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
	
//	@GetMapping("getAccountsNumber")
//	public List<UserCount> getAccountNumber(@RequestParam String solId, Object accountNumberRepository) {
//		List<Object[]> list = ((Object) accountNumberRepository).fetchUser(solId);
//		    List<UserCount> out = new ArrayList<>();
//		    if (list != null && !list.isEmpty()) {
//		    	UserCount UserCount = null;
//		    	for (Object[] object : list) {
//		    		UserCount.new UserCount();
//		    		UserCount.setUserName(object[0].toString());
//		    		UserCount.setTotal(Integer.parseInt(object[1].toString()));
//                	UserCount.setMandatoryCount(Integer.parseInt(object[2].toString()));
//                   
//                	out.add(UserCount);
//                	
//		    		
//		    	}
//		    }
//		    
//		    return out;
//	}
	
	@PutMapping("updateStatusByAccounts")
	public void updateStatusByAccounts(@RequestParam List accounts, @RequestParam String status, @RequestParam String userId) {
		accountRepository.updateStatusByAccNum(accounts, status, userId);
	}
	
	
	
	@GetMapping("AccDataForExcel")
	public void getAccountsForExcel(@RequestParam String solId, @RequestParam String schemeCode) throws SQLException, IOException {
	    
	    List<AccountData> list =  accountRepository.getAccountsByPortfolioAndSolId(solId, schemeCode);
	    DownloadExcel.writeToExcel(list,"Accounts - " + solId + schemeCode + ".xlsx");
	  }
	
	@GetMapping("AllAccDataForExcel")
	public void getAllAccountsForExcel(@RequestParam String solId) throws SQLException, IOException {
	    
	    List<AccountData> list =  accountRepository.findBySolId(solId);
	    DownloadExcel.writeToExcel(list,"Accounts - " + solId  + ".xlsx");
	  }

	
	@PutMapping("sampleSubmitEditableData")
	public List<AccountData> updateMultipleData(@RequestBody List<AccountData> updatedData ){
			
		
			List<AccountData>  list = accountRepository.saveAllAndFlush(updatedData);
			
			return list;
	}
	
	
	@PutMapping("submitRow")
    public List<AccountData>  updateRow (@RequestBody List<AccountData> data) {
    List<AccountData> list = accountRepository.saveAll(data);
    
    return list;
	}
	
	
//	@GetMapping ("FetchAccByAuditType")
//	public List<AccConfigData> getAccDataByAuditType () {
//		return  accConfigRepository.getAccData();
//		
//	}

//	@GetMapping("FetchAccByAuditType")
//	public List<Object[]> getAccDataByAuditType() {
//	   return   this.accountRepository.getAccData();
//	
//	}
}
