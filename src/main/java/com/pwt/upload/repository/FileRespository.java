package com.pwt.upload.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.FileData;


public interface FileRespository  extends JpaRepository<FileData, String>{


//	Optional<FileData> findFileName(String fileName);

//	@Query(value = "select FILE_NAME from AAA_UPLOAD_DOWNLOAD_FILE_DATA WHERE FILE_NAME = :fileName ", nativeQuery = true)
//	List<FileData> findFileName(@Param ("fileName") String fileName);
//	
//	
//	
	
}
