package com.pwt.upload.controller;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pwt.upload.message.FileUploadResponse;
import com.pwt.upload.message.ResponseMessage;
import com.pwt.upload.model.AccountData;
import com.pwt.upload.model.FileData;

import com.pwt.upload.repository.FileRespository;
import com.pwt.upload.repository.FileUploadUtil;
import com.pwt.upload.service.FileService;

import antlr.StringUtils;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("api/")
public class FileController {

  @Autowired
  private FileService storageService;
  
  private FileRespository fileRepository;

//  @PostMapping("upload")
//  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
//    String message = "";
//    try {
//    	
//    	String fileName = file.getOriginalFilename();
//        long size = file.getSize();
//        String filecode = FileUploadUtil.saveFile(fileName, file);
//
//        FileUploadResponse response = new FileUploadResponse();
//        response.setFileName(fileName);
//        response.setSize(size);
//        response.setDownloadUri("/downloadFile/" + filecode);
////      storageService.store(file);
//
//      message = "Uploaded the file successfully: " + file.getOriginalFilename();
//      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
//    } catch (Exception e) {
//      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
//      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message)); 
//    }
//  }
  
  @PostMapping("upload")
  public ResponseEntity<ResponseMessage> uploadFiles(@RequestParam("file") MultipartFile[] files) {
      String message = "";
      try {
          List<FileUploadResponse> responses = new ArrayList<>();
          
          for (MultipartFile file : files) {
              String fileName = file.getOriginalFilename();
              long size = file.getSize();
              String filecode = FileUploadUtil.saveFile(fileName, file);

              FileUploadResponse response = new FileUploadResponse();
              response.setFileName(fileName);
              response.setSize(size);
              response.setDownloadUri("/downloadFile/" + filecode);

              responses.add(response);
//              storageService.store(file);
          }

          message = "Uploaded  files successfully.";
          return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
      } catch (Exception e) {
          message = "Could not upload the files!";
          return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
      }
  }

//  @GetMapping("/files")
//  public ResponseEntity<List<ResponseFile>> getListFiles() {
//    List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
//      String fileDownloadUri = ServletUriComponentsBuilder
//          .fromCurrentContextPath()
//          .path("/files/")
//          .path(dbFile.getId())
//          .toUriString();
//
//      return new ResponseFile(
//          dbFile.getFileName(),
//          fileDownloadUri,
//          dbFile.getFileType(),
//          dbFile.getData().length);
//    }).collect(Collectors.toList());
//
//    return ResponseEntity.status(HttpStatus.OK).body(files);
//  }

  @GetMapping("files/{id}")
  public ResponseEntity<Long> getFile(@PathVariable String id) {
    FileData fileDB = storageService.getFile(id);

    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getFileName() + "\"")
        .body(fileDB.getData());
  }
  
  
// @GetMapping ("FindFileName/{fileName}")
// public List<FileData> findFile(@PathVariable String fileName) {
//	 
//	 List<FileData> fileData = fileRepository.findbyFileName(fileName);
//	 return fileData;
// }
  
//  @GetMapping("FindFileName")
//	public Optional<FileData> findFile(@RequestParam String fileName) {
//
//
//	    return fileRepository.findFileName(fileName);
//	  }
}

