package com.pwt.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.DropdownData;
import com.pwt.upload.repository.DropdownRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class DropdownController {
       
       @Autowired
       private DropdownRepository dropdownRepository;
       
       
       @GetMapping("ListDropdown")
       public List<DropdownData> getList(@RequestParam String formId) {
             
             return this.dropdownRepository.findByFormId(formId);
       }

}
