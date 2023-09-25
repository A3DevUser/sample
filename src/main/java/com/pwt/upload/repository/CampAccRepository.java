package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.CampAccData;
import com.pwt.upload.model.UniAccData;

public interface CampAccRepository extends JpaRepository<CampAccData, String> {

	
	@Query(value = "select * from AAA_CAMP_ACC where SCHEME_CODE in(\r\n" + 
			"select Name from AAA_TESTTEMPLATESCHEME_CODE where Portfolio = :portfolioId) and sol_id = :solId" , nativeQuery = true)
	List<CampAccData> getCampAccountsByPortfolioAndSolId(@Param("solId") String  solId, @Param("portfolioId") String portfolioId);


	@Query(value = "select distinct Portfolio from AAA_TESTTEMPLATESCHEME_CODE where name in(select SCHEME_CODE from AAA_CAMP_ACC where sol_id = :solId)\r\n" + 
			"", nativeQuery = true)
	List<Object[]> getCampAccSchemeBySol(@Param("solId") String  solId);


	List<CampAccData> findBySolId(String solId);
	
	@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(REGISTRATION_NO),\r\n" + 
			"  sum(case when MANDATORY = 'Yes' then 1 else 0 end) MandatoryCount,\r\n" + 
			"  sum(case when MANDATORY = 'No' then 1 else 0 end) NonMandatoryCount\r\n" + 
			"from AAA_CAMP_ACC\r\n" + 
			"where dummy = :auditId\r\n" + 
			"group by userId", nativeQuery = true)
	
	List<Object[]> fetchCountofUsers(@Param("auditId") String  auditId);


}
