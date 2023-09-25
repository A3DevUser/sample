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
import com.pwt.upload.model.SampleTestData;
import com.pwt.upload.model.TestData;
import com.pwt.upload.repository.SampleTestRepository;

import io.micrometer.core.instrument.LongTaskTimer.Sample;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class SampleTestController {
              
              
              @Autowired
              private SampleTestRepository sampleTestRepo;
              
              final org.slf4j.Logger logger = LoggerFactory.getLogger(SampleTestController.class);

              
              @GetMapping("SampleTestData")
              public List<SampleTestData> getTest(){
                             return this.sampleTestRepo.findAll();
              }
              
              @GetMapping("SampleTestBySchemeCode")
              public List<SampleTestData> getTest(@RequestParam String schemeCode){
                             return this.sampleTestRepo.findBySchemeCode(schemeCode);
              }
              
              
              
//           @GetMapping("SampleTestByPortfolio")
//           public List<PartyTestData> getTestByPortfolio(@RequestParam String schemeCode,@RequestParam String areaName){
//                          
//                          List<Object[]> list = sampleTestRepo.getSampleTestByScheme(schemeCode,areaName);       
//                          
//           
//                                                      
//               List<PartyTestData> out = new ArrayList<>();
//        if (list != null && !list.isEmpty()) {
//           PartyTestData partyTestData = null;
//            for (Object[] object : list) {
//                         partyTestData = new PartyTestData();
//                         partyTestData.setSrNo(object[0].toString());
//                         partyTestData.setObjective(object[1].toString());
//                         partyTestData.setProcess(object[2].toString());
//                         partyTestData.setSubProcess(object[3].toString());
//                         partyTestData.setTestRef(object[4].toString());
//                         partyTestData.setTestTitle(object[5].toString()); 
//               
//                out.add(partyTestData);
//            }
//        }
//        
//        return out;
//        
//        
//           }
              
//           @GetMapping("SampleTestByPortfolio")
//    public List<PartyTestData> getTestByPortfolio(@RequestParam String schemeCode,@RequestParam String areaName, @RequestParam String frequency){
//          
//          List<Object[]> list = sampleTestRepo.getSampleTestByScheme(schemeCode,areaName, frequency);  
//          
//    
//                       
//        List<PartyTestData> out = new ArrayList<>();
//     if (list != null && !list.isEmpty()) {
//          PartyTestData partyTestData = null;
//         for (Object[] object : list) {
//         partyTestData = new PartyTestData();
//         partyTestData.setSrNo(object[0].toString());
//                partyTestData.setObjective(object[1].toString());
//         partyTestData.setProcess(object[2].toString());
//                partyTestData.setSubProcess(object[3].toString());
//         partyTestData.setTestRef(object[4].toString());
//                partyTestData.setTestTitle(object[5].toString());
//            
//             out.add(partyTestData);
//         }
//     }
//     
//     return out;
//     
//     
//    }

              @GetMapping("SampleTestByPortfolio")
    public List<PartyTestData> getTestByPortfolio(@RequestParam String schemeCode,@RequestParam String areaName, @RequestParam String sns){
          
          List<Object[]> list = sampleTestRepo.getSampleTestByScheme(schemeCode,areaName, sns); 
          
    
                       
        List<PartyTestData> out = new ArrayList<>();
     if (list != null && !list.isEmpty()) {
          PartyTestData partyTestData = null;
         for (Object[] object : list) {
         partyTestData = new PartyTestData();
         partyTestData.setSrNo(object[0].toString());
         partyTestData.setId(object[1].toString());
         partyTestData.setObjective(object[2].toString());
         partyTestData.setProcess(object[3].toString());
         partyTestData.setSubProcess(object[4].toString());
         partyTestData.setTestTitle(object[5].toString());
         partyTestData.setTestRef(object[6].toString());
         partyTestData.setRisk(object[7].toString());
         partyTestData.setControl(object[8].toString());
         partyTestData.setAreaName(object[9].toString());
         partyTestData.setDropDown(object[10].toString());
         partyTestData.setMixVal(object[11].toString());
         partyTestData.setMaxVal(object[12].toString());
         partyTestData.setLogic(object[13].toString());
         

         

            
             out.add(partyTestData);
         }
     }
     
     return out;
     
     
    }
              
              
              @GetMapping("NonSampleTestByPortfolio")
              public List<PartyTestData> getNonTestByPortfolio(@RequestParam String schemeCode,@RequestParam String areaName, @RequestParam String sns, @RequestParam List<String> testRef){
                    
                    List<Object[]> list = sampleTestRepo.getSampleTestBySchemeAndsns(schemeCode,areaName, sns, testRef); 
                    
              
                                 
                  List<PartyTestData> out = new ArrayList<>();
               if (list != null && !list.isEmpty()) {
                    PartyTestData partyTestData = null;
                   for (Object[] object : list) {
                   partyTestData = new PartyTestData();
                   partyTestData.setSrNo(object[0].toString());
                   partyTestData.setId(object[1].toString());
                   partyTestData.setObjective(object[2].toString());
                   partyTestData.setProcess(object[3].toString());
                   partyTestData.setSubProcess(object[4].toString());
                   partyTestData.setTestTitle(object[5].toString());
                   partyTestData.setTestRef(object[6].toString());
                   partyTestData.setRisk(object[7].toString());
                   partyTestData.setControl(object[8].toString());
                   partyTestData.setAreaName(object[9].toString());
                   partyTestData.setDropDown(object[10].toString());
                   partyTestData.setMixVal(object[11].toString());
                   partyTestData.setMaxVal(object[12].toString());
                   partyTestData.setLogic(object[13].toString());
                   

                   

                      
                       out.add(partyTestData);
                   }
               }
               
               return out;
               
               
              }   
              
              






}
