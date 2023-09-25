package com.pwt.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.ApiRepoData;
import com.pwt.upload.repository.ApiRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class ApiRepoController {
	
	@Autowired
	private ApiRepository apiRepo;
	
	@GetMapping("getByApiId")
	public List<ApiRepoData> getData(@RequestParam String apiId, @RequestParam String formId, @RequestParam String portfolio) {
		
		return apiRepo.findByApiIdAndFormIdAndPortfolio(apiId, formId, portfolio);
		
	}
	
	                

}
