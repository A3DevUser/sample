package com.pwt.upload.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.NonSmapleOutputData;

@Repository
public interface NonSampleOutputRepository extends JpaRepository<NonSmapleOutputData, String> {

//	Collection<NonSmapleOutputData> getOutputData(String portfolio, List<String> batch, String auditId);

//	List<NonSmapleOutputData> findById();
//
//	List<NonSmapleOutputData> findAllById();
//
}
