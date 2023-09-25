package com.pwt.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwt.upload.model.PartySheetParentHeader;
import com.pwt.upload.repository.PSParentHeaderRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class PartySheetParentHeaderController {
       
       @Autowired
       private PSParentHeaderRepository partySheetHeaderRepo;
       
       @GetMapping("ParentHeader")
       public List<PartySheetParentHeader> getHeader (@RequestParam String formId, @RequestParam String auditType) {
             
             return this.partySheetHeaderRepo.findByFormIdAndAuditType(formId, auditType);
       }

}
