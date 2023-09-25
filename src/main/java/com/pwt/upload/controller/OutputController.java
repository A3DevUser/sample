package com.pwt.upload.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.OutputData;
import com.pwt.upload.repository.OutputRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class OutputController {
	
	final org.slf4j.Logger logger = LoggerFactory.getLogger(OutputController.class);
	
	@Autowired
	private OutputRepository outputRepository;
	
	@GetMapping("OutputData/{id}")
//	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public  ResponseEntity<OutputData> getOutput(@PathVariable(value="id") String id){
		Optional<OutputData> data = outputRepository.findById(id);
		return new ResponseEntity<>(data.get(), HttpStatus.OK);
	}
	
	@GetMapping("OutputDataByAccountId/{accountId}")
	public List<OutputData> getAccounts (@PathVariable (value = "accountId") String accountId) {
		return outputRepository.findByAccountId(accountId);
		
	}
	
//	
	@PostMapping(path ="OutputData/{id}")
//			produces = MediaType.APPLICATION_JSON_VALUE,
//			consumes = MediaType.APPLICATION_JSON_VALUE)
//	@RequestMapping(method = RequestMethod.POST, path = "/{id}")

	public  ResponseEntity<OutputData> getOutput1(@PathVariable(value="id") String id){
		Optional<OutputData> data = outputRepository.findById(id);
		return new ResponseEntity<>(data.get(), HttpStatus.OK);
	}
//	
	
//	
	@PostMapping(path ="OutputData",
		produces = MediaType.APPLICATION_JSON_VALUE,
		consumes = MediaType.APPLICATION_JSON_VALUE)
public  void ResponseEntity(@RequestBody OutputData newOutput){
		OutputData outputData = outputRepository.save(newOutput);
		
	}
//	
	

	
	@GetMapping("OutputData")
	public  List<OutputData> getCompleteOutput(){
		return this.outputRepository.findAll();
	}
	
	@PutMapping("OutputData/{id}")
	public ResponseEntity<OutputData> updateData(@RequestBody final OutputData updatedData,  OutputData createId){
		
		
//		String outputId = outputRepository.createOutput(auditId.getAuditId().concat(testid.getTestId().concat(accountId.getAccountId())));
//		createId.setId(outputId);
		OutputData data = outputRepository.saveAndFlush(updatedData);
//    	logger.error("output id = " + outputId);
//		OutputData dat = outputRepository.
		return new ResponseEntity<>(data, HttpStatus.OK);
		
	}
	
	

//private Object CONCAT(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	private Object CONCAT(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@GetMapping("OutputDataByAuditId")
	public List<OutputData> getOutputByUserIdAndAuditId(@RequestParam String auditId) {
	    
	    return outputRepository.findByAuditId(auditId);
	  }
	
	@GetMapping("UserDataByAuditId")
	public List<Object> getOutputByAudit_id(@RequestParam String auditId) {
	    
	    return outputRepository.fetchUserData(auditId);
	  }
	
	private <T> List<List<T>> nPartition(List<T> objs, final int N) {
	    return new ArrayList<>(IntStream.range(0, objs.size()).boxed().collect(
	            Collectors.groupingBy(e->e/N,Collectors.mapping(e->objs.get(e), Collectors.toList())
	                    )).values());
	    }
	
@GetMapping("getOutputByIds")
	
	public List<OutputData> getAccountById(@RequestParam List<String> outputId) {
	    
		long startTime = System.currentTimeMillis();

		logger.error("outputData" + outputId);
		final int N = 500;
//		<List<String>> l = nPartition(outputId,N);
//		List<OutputData> op = null;
		List<OutputData> op = new ArrayList<>();
		ListIterator<List<String>> lsIterator= nPartition(outputId,N).listIterator();
		
		while (lsIterator.hasNext()) {
			List<OutputData> opTemp= outputRepository.findAllById(lsIterator.next());
			
			
			op.addAll(opTemp);
        }
		
//	    List<OutputData> op= outputRepository.findAllById(outputId);
	    long duration = System.currentTimeMillis() - startTime;		
		logger.error("getOutputById = " + duration ) ;

	    
		 if(op.isEmpty()) {
		    	
		    	logger.error("output data is empty");
//		    	OutputData o = new OutputData();
//		    	o.setAccountId("12");
//		    	o.setAuditId("");
//		    	o.setId("12");
//		    	o.setRemarks("");
//		    	o.setResult("");
//		    	o.setStatus("");
//		    	o.setTestId("");
//		    	o.setUserId("");
//		    	logger.error("output data is empty o = " + o);
		    	logger.error("output data is empty " + outputId);
		    	op.add(new OutputData("","","","","","","","", "","","","","","","","","","","","",""));
//		    	return (List<OutputData>) new OutputData("","","","","","","", "");
//		    	logger.error("output data is empty op size = " + op.size());
		    }
	    
	    return op;
	  }
	
	
//@PutMapping("ListOutputData")
//public List<OutputData> updateMultipleData1(@RequestBody List<OutputData> updatedData ){
//		
//		logger.error("UpdatedData = > " + updatedData);
//
//		
//		long startTime = System.currentTimeMillis();
//
//		 List<OutputData> out = new ArrayList<>();
//		 for (OutputData obj : updatedData) {
//         obj.setId(obj.getAuditId().concat(obj.getTestId().concat(obj.getAccountId().concat(obj.getCunDate()))));
//            	out.add(obj);
//            	}	
//		List<OutputData>  list = outputRepository.saveAllAndFlush(out);
//		
//	
//		
//		long duration = System.currentTimeMillis() - startTime;		
//		logger.error("ListOutputData = " + duration ) ;
//		
//		return list;
//		
////		updatedData1.setId(updatedData1.getTestId().concat(updatedData1.getAccountId().concat(updatedData1.getAuditId())));
//
//	
//		
//	}



@PutMapping("ListOutputData")
public List<OutputData> updateMultipleData1(@RequestBody List<OutputData> updatedData) {

    logger.error("UpdatedData => " + updatedData);

    long startTime = System.currentTimeMillis();

    List<OutputData> out = new ArrayList<>();
    for (OutputData obj : updatedData) {
        String combinedId = obj.getAuditId() + obj.getTestId() + obj.getAccountId() + obj.getCunDate();
        obj.setId(combinedId);
        out.add(obj);

     
        logger.error(" cunDate: " + obj.getCunDate());
    }

    List<OutputData> list = outputRepository.saveAllAndFlush(out);

    long duration = System.currentTimeMillis() - startTime;
    logger.error("ListOutputData = " + duration);

    return list;
}

	
	@PutMapping("SubmiOutputData")
	public List<OutputData> updateMultipleData(@RequestBody List<OutputData> updatedData ){
			
			logger.error("UpdatedData = > " + updatedData);

			
			long startTime = System.currentTimeMillis();

			 List<OutputData> out = new ArrayList<>();
			 for (OutputData obj : updatedData) {
	         obj.setId(obj.getAuditId().concat(obj.getTestId().concat(obj.getAccountId())));
	            	out.add(obj);
	            	}	
			List<OutputData>  list = outputRepository.saveAllAndFlush(out);
			long duration = System.currentTimeMillis() - startTime;		
			logger.error("ListOutputData = " + duration ) ;
			
			return list;
			
//    		updatedData1.setId(updatedData1.getTestId().concat(updatedData1.getAccountId().concat(updatedData1.getAuditId())));

		
			
		}
	
	
	@PutMapping("SetSubmitStatus")
	public void setStatus(@RequestParam List<String> accountId, @RequestParam String portfolio ){
		 int batchSize = 500; // Set the desired batch size
	        
	        for (int i = 0; i < accountId.size(); i += batchSize) {
	            List<String> batch = accountId.subList(i, Math.min(i + batchSize, accountId.size()));
	        outputRepository.setSubmitStatus(accountId, portfolio);
		    outputRepository.insertFailData();

	        }
		}
	
	
	
//	@PutMapping("updateStatusByAccounts")
//	public void updateStatusByAccounts(@RequestParam List accounts, @RequestParam String status, @RequestParam String userId) {
//		accountRepository.updateStatusByAccNum(accounts, status, userId);
//	}
	
//	@GetMapping("getOutputData")
//    public List<OutputData> getDataOutput (@RequestParam String portfolio, @RequestParam List accountId){
//          
//          return outputRepository.getOutputData(portfolio, accountId);
//    }

	@GetMapping("getOutputData")
	public List<OutputData> getDataOutput(@RequestParam String portfolio, @RequestParam List<String> accountId) {
	    int batchSize = 500; // Set the desired batch size
	    List<OutputData> outputData = new ArrayList<>();

	    for (int i = 0; i < accountId.size(); i += batchSize) {
	        List<String> batch = accountId.subList(i, Math.min(i + batchSize, accountId.size()));
	        outputData.addAll(outputRepository.getOutputData(portfolio, batch));
	    }

	    return outputData;
	}
	
	@GetMapping("getOutputCount")
	public List<Long> getOutputCount(@RequestParam List<String> outputId) {
	    final int N = 500;
	    List<Long> op = new ArrayList<>();
	    ListIterator<List<String>> lsIterator = nPartition(outputId, N).listIterator();

	    while (lsIterator.hasNext()) {
	        List<Long> opTemp = outputRepository.fetchOutputCount(lsIterator.next());
	        op.addAll(opTemp);
	    }
	    return op;
	}



	

	
	
}
