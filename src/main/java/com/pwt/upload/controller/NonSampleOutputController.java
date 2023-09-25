package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//import org.hibernate.annotations.common.util.impl.Log_.logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.NonSmapleOutputData;
import com.pwt.upload.model.OutputData;
import com.pwt.upload.repository.NonSampleOutputRepository;


@CrossOrigin (origins = "*")
@RequestMapping("api/")
@RestController
public class NonSampleOutputController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(NonSampleOutputController.class);

	
	
	@Autowired
	private NonSampleOutputRepository nonSampleOutputRepo;
	
//	@PutMapping("SetOutputNonSample")
//	public List<NonSmapleOutputData> setOutputData(@RequestParam List<NonSmapleOutputData> setData) {
//		
//		List<NonSmapleOutputData> out = new ArrayList<>();
//		for (NonSmapleOutputData obj : setData) {
//			obj.setId(obj.getAuditId().concat(obj.getTestId().concat(obj.getAccId())));
//    	out.add(obj);
//		}
//		
//	   List<NonSmapleOutputData> list = nonSampleOutputRepo.saveAllAndFlush(out);
//	   
//	   return list;
//			
//
//	}
	
	
	@PutMapping("SetOutputNonSample")
	public List<NonSmapleOutputData> updateMultipleData1(@RequestBody List<NonSmapleOutputData> updatedData ){
			
               
		
			 List<NonSmapleOutputData> out = new ArrayList<>();
			 for (NonSmapleOutputData obj : updatedData) {
	         obj.setId(obj.getAuditId().concat(obj.getTestId().concat(obj.getAccId())));
	            	out.add(obj);
	            	}	
			 
			 
			List<NonSmapleOutputData>  list = nonSampleOutputRepo.saveAllAndFlush(out);
			
			
			return list;	
			
		}

	
          @GetMapping("getByNonSampleOutputId")
	      public List<NonSmapleOutputData> getAccountById(@RequestParam List<String> id) {   
//
//		final int N = 500;
		List<NonSmapleOutputData> data = new ArrayList<>();
//		ListIterator<List<String>> lsIterator= nPartition(id,N).listIterator();
		
//		while (lsIterator.hasNext()) {
			List<NonSmapleOutputData> list= nonSampleOutputRepo.findAllById(id);
			
			data.addAll(list);
//        }
		 if(data.isEmpty()) {
		    	
		    	logger.error("output data is empty");
		    	data.add(new NonSmapleOutputData("", "", "", "", "", "", "", "", "", "", "", "", "", "","","","","","",""));	
		    }
	    return data;
	  }
          
          

      

          
          

}
