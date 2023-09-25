package com.pwt.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.SmsAccData;
import com.pwt.upload.repository.SmsAccRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class SmsAccController {
	
	@Autowired
	private SmsAccRepository smsAccRepository;
	
	@GetMapping ("FetchSmsData")
	public List<SmsAccData> getSmsData() {
		return this.smsAccRepository.findAll();
	}

}
