package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.SampleTestData;

@Repository
public interface SampleTestRepository extends JpaRepository<SampleTestData, String> {
	
	
//	@Query(value = "SELECT ROWNUM AS SR_NO, Objective,Process,SUB_PROCESS,TEST_REF,TEST_TITLE, RISK, CONTROL,AREA_NAME FROM (select  distinct Objective,Process,SUB_PROCESS,TEST_REF,TEST_TITLE, RISK, CONTROL,AREA_NAME from aaa_cun_test_data\r\n"
//			+ "			WHERE SCHEME_CODE LIKE '%'||:schemeCode||'%' AND AREA_NAME in (:areaName))" , nativeQuery = true)
//	List<Object[]> getSampleTestByScheme(@Param("schemeCode") String schemeCode,@Param("areaName") String areaName);

	@Query(value = "SELECT ROWNUM AS SR_NO, ID, OBJECTIVE, Process, SUB_PROCESS,  TEST_TITLE, TEST_REF, RISK, CONTROL, AREA_NAME, DROPDOWN, MIX_VAL, MAX_VAL,LOGIC " +
		    "FROM (SELECT DISTINCT ID, OBJECTIVE, Process, SUB_PROCESS,  TEST_TITLE, TEST_REF, RISK, CONTROL, AREA_NAME,  DROPDOWN, MIX_VAL, MAX_VAL, LOGIC " +
		    "FROM aaa_cun_test_data " +
		    "WHERE lower(SCHEME_CODE) = lower(:schemeCode) AND lower(AREA_NAME) = lower(:areaName) and SNS = :sns " +
		    "ORDER BY RISK)", nativeQuery = true)

List<Object[]> getSampleTestByScheme(@Param("schemeCode") String schemeCode,@Param("areaName") String areaName, @Param("sns") String sns);


@Query(value = "SELECT ROWNUM AS SR_NO, ID, OBJECTIVE, Process, SUB_PROCESS,  TEST_TITLE, TEST_REF, RISK, CONTROL, AREA_NAME, DROPDOWN, MIX_VAL, MAX_VAL,LOGIC\r\n"
		+ "FROM (SELECT DISTINCT ID, OBJECTIVE, Process, SUB_PROCESS,  TEST_TITLE, TEST_REF, RISK, CONTROL, AREA_NAME,  DROPDOWN, MIX_VAL, MAX_VAL, LOGIC\r\n"
		+ "FROM aaa_cun_test_data\r\n"
		+ "WHERE lower(SCHEME_CODE) = lower(:schemeCode) AND lower(AREA_NAME) = lower(:areaName) and SNS = :sns and TEST_REF in (:testRef) \r\n"
		+ "ORDER BY RISK)", nativeQuery = true)
List<Object[]> getSampleTestBySchemeAndsns(@Param("schemeCode") String schemeCode,@Param("areaName") String areaName, @Param("sns") String sns, @Param("testRef") List<String> testRef);



List<SampleTestData> findBySchemeCode(String schemeCode);
		
	


	
}
