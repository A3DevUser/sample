
package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.DepositAccountData;
import com.pwt.upload.model.ForexAccountData;
import com.pwt.upload.model.SampleAccountData;
import com.pwt.upload.model.SchemeData;
import com.pwt.upload.model.UserCount;
import com.pwt.upload.repository.DepositeAccountRepository;
import com.pwt.upload.service.DepositeAccountService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class DepositeAccountController {
	
	
	@Autowired
	private DepositeAccountRepository depoAccRepo;
	
     @Autowired
     private DepositeAccountService depoAccService;
	
	 @GetMapping("getDepoAccountData")
	    public List<DepositAccountData> getAllAccount ( @RequestParam String schemeCode, @RequestParam String areaName, @RequestParam String solId,
	                 @RequestParam String cunDate, @RequestParam("cunEndDate")  String cunEndDate) {
	          
	          List<DepositAccountData> list = depoAccService.getDepoAccByScheme(schemeCode, areaName, solId ,cunDate, cunEndDate);
	          
	          return list;
	    }

	 
	 @GetMapping("getDepoAccountsByIds")
	    public List<DepositAccountData> getAccountById(@RequestParam List<String> accountId) {

	        return depoAccRepo.findAllById(accountId);
	      }
	 
	 
	 @PutMapping("SetDepoSubmitStatus")
	    public void setAccountStatus(@RequestParam List<String> id, @RequestParam String cunDate, @RequestParam("cunEndDate")  String cunEndDate) {
	        int batchSize = 500; // Set the desired batch size
	        
	        for (int i = 0; i < id.size(); i += batchSize) {
	            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
	            depoAccRepo.setSubmitStatus(batch, cunDate, cunEndDate);
	        }
	    }

	    
	    @PutMapping("SetDepoUserId")
	    public void SetUserId(@RequestParam String userId, @RequestParam List<String> id, @RequestParam String cunDate, @RequestParam("cunEndDate")  String cunEndDate)  {
	int batchSize = 500; // Set the desired batch size
	        
	        for (int i = 0; i < id.size(); i += batchSize) {
	            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
	            depoAccRepo.setUserId(userId, batch, cunDate, cunEndDate);
	    }
	    }
		
	    
	    
	    @GetMapping("getDepoGovUserCount")
	    public List<UserCount> getUserCountByAudit(@RequestParam String schemeCode, @RequestParam String areaName, @RequestParam String solId, @RequestParam String cunDate, @RequestParam("cunEndDate")  String cunEndDate) {
	        List<Object[]> list = depoAccService.getAllUser(schemeCode, areaName, solId, cunDate, cunEndDate);
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


}
