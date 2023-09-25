package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.TestData;

@Repository
public interface TestRepository extends JpaRepository<TestData, Long> {
	
	List<TestData> findBySchemeCode(String schemeCode);
	
	@Query(value = "select distinct Objective,Process,SUB_PROCESS,TEST_REF,TEST_TITLE  from AAA_TEST_DATA where SCHEME_CODE in(\r\n" + 
			"select Name from AAA_TESTTEMPLATESCHEME_CODE where Portfolio = :portfolioId) and audit_id = :auditId" , nativeQuery = true)
	List<Object[]> getTestByPortfolio(@Param("portfolioId") String portfolioId,@Param("auditId") String auditId);



}
