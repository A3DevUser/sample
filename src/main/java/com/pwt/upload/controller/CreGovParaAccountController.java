package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.CreParaGovAccountData;
import com.pwt.upload.model.SampleAccountData;
import com.pwt.upload.model.SchemeData;
import com.pwt.upload.model.UserCount;
import com.pwt.upload.repository.CreParaGovAccountRepository;
import com.pwt.upload.service.CreAdvAccountService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class CreGovParaAccountController {
	
	
	@Autowired
	private CreParaGovAccountRepository creParaGovAccRepo;
	
	@Autowired 
	private CreAdvAccountService creAdvAccService;
	
	

    @GetMapping("getCreParaGovAccountData")
    public List<CreParaGovAccountData> getAllAccount ( @RequestParam String schemeCode, @RequestParam String areaName,  @RequestParam String solId,
    		@RequestParam("cunDate") String cunDate,
    		@RequestParam("cunEndDate")  String cunEndDate) {
          
          List<CreParaGovAccountData> list = creAdvAccService.getCreAdvAccByScheme(schemeCode, areaName, solId ,cunDate,cunEndDate);
          
          return list;
    }
    
    
    @GetMapping("getCreParaGovAccountsByIds")
    public List<CreParaGovAccountData> getAccountById(@RequestParam List<String> accountId) {

        return creParaGovAccRepo.findAllById(accountId);
      }

	
    @PutMapping("SetCreParaGovSubmitStatus")
    public void setAccountStatus(@RequestParam List<String> id, @RequestParam String cunDate, @RequestParam("cunEndDate")  String cunEndDate) {
        int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            creParaGovAccRepo.setSubmitStatus(batch, cunDate, cunEndDate);
        }
    }

    
    @PutMapping("SetCreParaGovUserId")
    public void SetUserId(@RequestParam String userId, @RequestParam List<String> id, @RequestParam String cunDate, @RequestParam("cunEndDate")  String cunEndDate)  {
int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            creParaGovAccRepo.setUserId(userId, batch, cunDate, cunEndDate);
    }
    }
	
    
    
    @GetMapping("getCreParaGovUserCount")
    public List<UserCount> getUserCountByAudit(@RequestParam String schemeCode, @RequestParam String areaName, @RequestParam String solId, @RequestParam String cunDate, @RequestParam("cunEndDate")  String cunEndDate) {
        List<Object[]> list = creAdvAccService.getAllUser(schemeCode, areaName, solId, cunDate, cunEndDate);
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
