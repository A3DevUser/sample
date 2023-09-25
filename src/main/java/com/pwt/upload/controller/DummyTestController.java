package com.pwt.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.DummyTestData;
import com.pwt.upload.model.SampleTestData;
import com.pwt.upload.repository.DummyTestRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class DummyTestController {
	
	@Autowired
	private DummyTestRepository dummyTestRepo;
	
	@GetMapping("getTestData")
	public List<DummyTestData> getTestData(@RequestParam String schemeCode, @RequestParam String areaName) {
		
		List<DummyTestData> out = dummyTestRepo.findBySchemeCodeAndAreaName(schemeCode, areaName);
		
		return out;
	}

	
	

}
