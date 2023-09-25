package com.pwt.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.SmelfAccData;
import com.pwt.upload.model.UniAccData;
import com.pwt.upload.repository.SmelfAccRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class SmelfAccController {
	
	
	@Autowired
	private SmelfAccRepository smelfAccRepository;
	
	@GetMapping ("FetchSmelfData")
	public List<SmelfAccData> getSmelfData() {
		return this.smelfAccRepository.findAll();
	}


}
