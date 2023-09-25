package com.pwt.upload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwt.upload.model.SampleAccountData;
import com.pwt.upload.repository.SampleAccountRepository;


@Service
public class SampleAccountService {
	
	
	@Autowired
	private SampleAccountRepository sampleAccRepo;
	
	public List<SampleAccountData> getAccountByScheme (String schemeCode,
			String areaName,
			String solId,
			String cunDate,
			String cunEndDate,
			String auditId) {
		
		if ("All".equals(schemeCode)) {
			return sampleAccRepo.getAllAccountByArea(areaName, solId, cunDate, cunEndDate, auditId);
			
		} else {
			return sampleAccRepo.getAccounts(schemeCode, solId, cunDate, cunEndDate, auditId);
		}
		
	}
	
	
	public List<Object[]> getAllUserCount (
			String schemeCode,
			String areaName,
			String solId,
			String cunDate,
			String CunEndDate,
			String auditId) {
		
		if ("All".equals(schemeCode)) {
			return sampleAccRepo.fetchCountofAllUsers(areaName, solId, cunDate, CunEndDate, auditId);

		} else {
			return sampleAccRepo.fetchCountofUsers(schemeCode, solId, cunDate, CunEndDate, auditId);
		}
	}

}
