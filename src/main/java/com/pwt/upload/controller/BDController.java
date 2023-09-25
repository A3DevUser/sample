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

import com.pwt.upload.model.BDData;
import com.pwt.upload.model.UserCount;
import com.pwt.upload.repository.BDRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class BDController {

	
	@Autowired
	private BDRepository BdRepo;
	
	@GetMapping("getBdAccountData")
    public List<BDData> getAllAccount (@RequestParam String schemeCode,
                 @RequestParam String areaName,
                 @RequestParam String solId,
                 @RequestParam String cunDate,
                 @RequestParam String cunEndDate,
                 @RequestParam String auditId ) {
          
          List<BDData> list = BdRepo.getAccounts(solId ,cunDate, cunEndDate, auditId);
          
          return list;
    }

 
 @GetMapping("getBdAccountsByIds")
    public List<BDData> getAccountById(@RequestParam String schemeCode,
    		@RequestParam String solId,
    		
    		@RequestParam List<String> accountId,
    		@RequestParam String cunDate,
    		@RequestParam String cunEndDate,
    		@RequestParam String auditId) {

        return BdRepo.getAccountByIds(accountId, cunDate, cunEndDate, auditId);
      }
 
 
 @PutMapping("SetBdSubmitStatus")
    public void setAccountStatus(@RequestParam String schemeCode,
    		@RequestParam String solId,@RequestParam List<String> id,
    		@RequestParam String cunDate,
    		@RequestParam String cunEndDate,
    		@RequestParam String auditId) {
        int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            BdRepo.setSubmitStatus(batch, cunDate, cunEndDate, auditId );
        }
    }

    
    @PutMapping("SetBdUserId")
    public void SetUserId(@RequestParam String userId, @RequestParam List<String> id,
    		@RequestParam String cunDate ,
    		@RequestParam String cunEndDate,
    		@RequestParam String auditId)  {
int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            BdRepo.setUserId(userId, batch, cunDate, cunEndDate, auditId);
    }
    }
	
    
    
    @GetMapping("getBdUserCount")
    public List<UserCount> getUserCountByAudit( @RequestParam String schemeCode,
            @RequestParam String areaName,
            @RequestParam String solId,
    		@RequestParam String cunDate,
    		@RequestParam String cunEndDate,
    		@RequestParam String auditId) {
        List<Object[]> list = BdRepo.fetchCountofUsers(solId, cunDate , cunEndDate, auditId);
               List<UserCount> out = new ArrayList<>();
                if (list != null && !list.isEmpty()) {
                UserCount userCount = null;
                    for (Object[] object : list) {
                        userCount = new UserCount();
                           userCount.setUserName(object[0].toString());        
                       userCount.setTotal(Integer.parseInt(object[1].toString()));
//                    userCount.setMandatoryCount(Integer.parseInt(object[2].toString()));
//                    userCount.setNonMandatoryCount(Integer.parseInt(object[3].toString()));
                       
                        out.add(userCount);
                    }
                }
                
                return out;
                 }


}

