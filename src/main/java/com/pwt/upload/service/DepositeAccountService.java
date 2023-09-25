package com.pwt.upload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.pwt.upload.model.DepositAccountData;
import com.pwt.upload.model.SampleAccountData;
import com.pwt.upload.repository.DepositeAccountRepository;

@Service
public class DepositeAccountService {
	
	@Autowired
	private DepositeAccountRepository depoAccRepo;
	
     public List<DepositAccountData> getDepoAccByScheme (
    		 
    		
    		 String schemeCode,
    		 String areaName,
    		 String solId,
    		 String cunDate,
    		 String cunEndDate)
     
     {
    	 if("All".equals(schemeCode)) {
    		 return depoAccRepo.getAllDepoAccountByArea(areaName, solId, cunDate, cunEndDate);
    	 } else {
    		 return depoAccRepo.getAccounts(schemeCode, solId, cunDate, cunEndDate);
    		 
    	 }
    	 
     }

     
      public List<Object[]> getAllUser (
    		  String schemeCode,
     		 String areaName,
     		 String solId,
     		 String cunDate,
     		 String cunEndDate)
      {
    	  if("All".equals(schemeCode)) {
    		  return depoAccRepo.fetchCountofAllUsers(areaName, solId, cunDate, cunEndDate);

    	  } else {
    		  
    		  return depoAccRepo.fetchCountofUsers(schemeCode, solId, cunDate, cunEndDate);
    	  }
      }
}
