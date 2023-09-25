package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.PartyTestData;
import com.pwt.upload.model.TestData;
import com.pwt.upload.repository.TestRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class TestController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestRepository testRepository;
	
	
	@GetMapping("TestData")
	public List<TestData> getTest(){
		return this.testRepository.findAll();
	}
	
	@GetMapping("TestBySchemeCode")
	public List<TestData> getTest(@RequestParam String schemeCode){
		return this.testRepository.findBySchemeCode(schemeCode);
	}
	
	@GetMapping("TestByPortfolio")
	public List<PartyTestData> getTestByPortfolio(@RequestParam String portfolioId,@RequestParam String auditId){
//		return this.testRepository.getTestByPortfolio(portfolioId);
		long startTime = System.currentTimeMillis();
		
		List<Object[]> list = testRepository.getTestByPortfolio(portfolioId,auditId);	
		
		long duration = System.currentTimeMillis() - startTime;		
		logger.error("TestByPortfolio = " + duration ) ;

				
	    List<PartyTestData> out = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
        	PartyTestData partyTestData = null;
            for (Object[] object : list) {
            	partyTestData = new PartyTestData();
            	partyTestData.setObjective(object[0].toString());
            	partyTestData.setProcess(object[1].toString());
            	partyTestData.setSubProcess(object[2].toString());
            	partyTestData.setTestRef(object[3].toString());
            	partyTestData.setTestTitle(object[4].toString());
 //           	partyTestData.setId(object[5].toString());
               
                out.add(partyTestData);
            }
        }
        
        return out;
        
        
	}
	

}
