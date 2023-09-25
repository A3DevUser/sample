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

import com.pwt.upload.model.CreParaGovAccountData;
import com.pwt.upload.model.ForexAccountData;
import com.pwt.upload.model.SampleAccountData;
import com.pwt.upload.model.SchemeData;
import com.pwt.upload.model.UserCount;
import com.pwt.upload.repository.ForexAccountRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class ForexAccountController {
	
	
	@Autowired
	private ForexAccountRepository forexAccRepo;
	

    @GetMapping("getForexAccountData")
    public List<ForexAccountData> getAllAccount ( @RequestParam String schemeCode, @RequestParam String solId,
                 @RequestParam String cunDate) {
          
          List<ForexAccountData> list = forexAccRepo.getAccounts(schemeCode, solId ,cunDate);
          
          return list;
    }
	
    
    @GetMapping("getForexAccountsByIds")
    public List<ForexAccountData> getAccountById(@RequestParam List<String> accountId) {

        return forexAccRepo.findAllById(accountId);
      }
    
    @PutMapping("SetForexSubmitStatus")
    public void setAccountStatus(@RequestParam List<String> id, @RequestParam String cunDate) {
        int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            forexAccRepo.setSubmitStatus(batch, cunDate);
        }
    }

    
    @PutMapping("SetForexUserId")
    public void SetUserId(@RequestParam String userId, @RequestParam List<String> id, @RequestParam String cunDate)  {
int batchSize = 500; // Set the desired batch size
        
        for (int i = 0; i < id.size(); i += batchSize) {
            List<String> batch = id.subList(i, Math.min(i + batchSize, id.size()));
            forexAccRepo.setUserId(userId, batch, cunDate);
    }
    }
	
    
    
//    @GetMapping("getForexUserCount")
//    public List<UserCount> getUserCountByAudit(@RequestParam String schemeCode, @RequestParam String solId, @RequestParam String cunDate) {
//        List<Object[]> list = forexAccRepo.fetchCountofUsers(schemeCode, solId, cunDate);
//               List<UserCount> out = new ArrayList<>();
//                if (list != null && !list.isEmpty()) {
//                UserCount userCount = null;
//                    for (Object[] object : list) {
//                        userCount = new UserCount();
//                           userCount.setUserName(object[0].toString());        
//                       userCount.setTotal(Integer.parseInt(object[1].toString()));
//                   
//                       
//                        out.add(userCount);
//                    }
//                }
//                
//                return out;
//                 }

	
	
	

}
