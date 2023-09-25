package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.SchemeData;
import com.pwt.upload.repository.BranchRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")

public class BranchController {
	
	@Autowired
	private BranchRepository branchRepo;
	
	@GetMapping("areaByBranch")
    public List<SchemeData> getAreaBySol(@RequestParam String branchName, @RequestParam String sns) {
        
//      return accountRepository.getSchemeBySol(solId);
        List<Object[]> list = branchRepo.getAreaByBranchName(branchName, sns);
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

}
