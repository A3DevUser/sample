package com.pwt.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.CpcAccData;
import com.pwt.upload.repository.CpcAccRepository;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class CpcAccController {
	
	@Autowired
	private CpcAccRepository cpcAccRepository;
	
	@GetMapping ("FetchCpcData")
	public List<CpcAccData> getCpcData() {
		return this.cpcAccRepository.findAll();
	}


}
