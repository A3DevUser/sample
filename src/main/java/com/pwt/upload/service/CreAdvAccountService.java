package com.pwt.upload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwt.upload.model.CreParaGovAccountData;
import com.pwt.upload.repository.CreParaGovAccountRepository;

@Service
public class CreAdvAccountService {
	
	@Autowired
	private CreParaGovAccountRepository creAdvAccRepo;
	
	public List<CreParaGovAccountData> getCreAdvAccByScheme (
		
   		 String schemeCode,
   		String areaName,
   		 String solId,
   		 String cunDate,
   		 String cunEndDate ) {
		
		if("All".equals(schemeCode)) {
			return creAdvAccRepo.getAllCreAdvAccountByArea(areaName, solId, cunDate, cunEndDate);
			
		
		} else {
			return creAdvAccRepo.getAccounts(schemeCode, solId, cunDate, cunEndDate);
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
			return creAdvAccRepo.fetchCountofAllUsers(areaName, solId, cunDate, cunEndDate);
		
		} else {
			return creAdvAccRepo.fetchCountofUsers(schemeCode, solId, cunDate, cunEndDate);
		}
	
		
	}
	

}
