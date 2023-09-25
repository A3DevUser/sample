
package com.pwt.upload.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.pwt.upload.model.FileData;
import com.pwt.upload.repository.FileRespository;


@Service
public class FileService {

  @Autowired
  private FileRespository fileDBRepository;

//  public FileData store(MultipartFile file) throws IOException {
//    String fileName = file.getOriginalFilename();
//    FileData FileDB = new FileData(fileName, file.getOriginalFilename(), file.getContentType(), file.getSize());
//
//    return fileDBRepository.save(FileDB);
//  }

  public FileData getFile(String id) {
    return fileDBRepository.findById(id).get();
  }
  
  public Stream<FileData> getAllFiles() {
    return fileDBRepository.findAll().stream();
  }
}