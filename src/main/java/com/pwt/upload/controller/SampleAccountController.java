package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.SampleAccountData;
import com.pwt.upload.model.SchemeData;
import com.pwt.upload.model.UserCount;
import com.pwt.upload.repository.SampleAccountRepository;
import com.pwt.upload.service.SampleAccountService;

import io.micrometer.core.instrument.LongTaskTimer.Sample;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class SampleAccountController {
	
	
	@Autowired
	private SampleAccountRepository sampleAccountRepository;
	
	@Autowired 
	private SampleAccountService sampleAccService;
	
//	@GetMapping("areaBySolSample")
//    public List<SchemeData> getAreaBySol(@RequestParam String cunBranchName) {
//        
////      return accountRepository.getSchemeBySol(solId);
//        List<Object[]> list = sampleAccountRepository.getAreaBySol(cunBranchName);
//               List<SchemeData> out = new ArrayList<>();
//                if (list != null && !list.isEmpty()) {
//                    SchemeData schemeData = null;
//                    for (Object[] object : list) {
//                        schemeData = new SchemeData();
//                           schemeData.setSchemeName(object[0].toString());
//                       
//                        out.add(schemeData);
//                    }
//                }
//                
//                return out;
 //     }
	
	
    @GetMapping ("getSchemeBySolSample")
    public List<SchemeData> getSchemeBySol( @RequestParam String cunAreaName,
    		                                @RequestParam String sns) {
          
          List<Object[]> list = sampleAccountRepository.getSchemeByArea(cunAreaName, sns);
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

	
	
	
	

	
    @GetMapping("getAccountData")
    public List<SampleAccountData> getAllAccount ( @RequestParam String schemeCode, @RequestParam String areaName, @RequestParam String solId,
                 @RequestParam String cunDate, @RequestParam String cunEndDate, @RequestParam String auditId) {
          
          List<SampleAccountData> list = sampleAccService.getAccountByScheme(schemeCode, areaName, solId ,cunDate, cunEndDate, auditId);
          
          return list;
    }


	
	
    @PutMapping("SetAccountSubmitStatus")
    public void setAccountStatus(@RequestParam List<String> id, @RequestParam String cunDate, @RequestParam String cunEndDate,  @RequestParam String schemeCode, @RequestParam String solId, @RequestParam String auditId) {
        int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            sampleAccountRepository.setSubmitStatus(batch, cunDate, cunEndDate, schemeCode, solId, auditId);
        }
    }

    
    @PutMapping("SetUserId")
    public void SetUserId(@RequestParam String userId, @RequestParam List<String> id, @RequestParam String cunDate, @RequestParam String cunEndDate, @RequestParam String auditId)  {
int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            sampleAccountRepository.setUserId(userId, batch, cunDate, cunEndDate, auditId);
    }
    }
    
    
    
    
    
	
//	@PutMapping("SetAccountSaveStatus")
//    public void setAccountSaveStatus( @RequestParam List id, @RequestParam String schemeCode ){
//                 sampleAccountRepository.setSaveStatus(id, schemeCode);
//          }
	
	@GetMapping("getSampleUserCount")
    public List<UserCount> getUserCountByAudit(@RequestParam String schemeCode, @RequestParam String areaName, @RequestParam String solId, @RequestParam String cunDate, @RequestParam String cunEndDate, @RequestParam String auditId) {
        List<Object[]> list = sampleAccService.getAllUserCount(schemeCode, areaName, solId, cunDate, cunEndDate, auditId);
               List<UserCount> out = new ArrayList<>();
                if (list != null && !list.isEmpty()) {
                UserCount userCount = null;
                    for (Object[] object : list) {
                        userCount = new UserCount();
                           userCount.setUserName(object[0].toString());        
                       userCount.setTotal(Integer.parseInt(object[1].toString()));
                        out.add(userCount);
                    }
                }
                
                return out;
                 }


//	@GetMapping("getSampleAccountsByIds")
//    public List<SampleAccountData> getAccountById(@RequestParam List<String> accountId) {
//
//        return sampleAccountRepository.findAllById(accountId);
//      }
    
	@GetMapping("getSampleAccountsByIds")
    public List<SampleAccountData> getAccountById(@RequestParam String schemeCode, @RequestParam String solId, @RequestParam String cunDate, @RequestParam String cunEndDate, @RequestParam String auditId, @RequestParam List<String> accountId) {

        return sampleAccountRepository.getAccountById(schemeCode, solId, cunDate, cunEndDate, auditId, accountId);
      }

	
	
//	@GetMapping("GetAllAccountByArea")
//	public List<SampleAccountData> getAccountByArea (@RequestParam String areaName, @RequestParam String solId) {
//		
//		return sampleAccountRepository.getAllAccountByArea(areaName, solId);
//	}
	
	
}
