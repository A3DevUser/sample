package com.pwt.upload.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.AccountData;
import com.pwt.upload.model.SampleAccountData;
import com.pwt.upload.model.SchemeData;

import io.micrometer.core.instrument.LongTaskTimer.Sample;

@Repository
public interface SampleAccountRepository extends JpaRepository<SampleAccountData, String> {
	
	
//	@Query(value = "SELECT AREA_NAME FROM aaa_branch_details WHERE branch_name in (select cun_branch_name from aaa_sample_account where sol_id = :solId) AND SNS = :sns", nativeQuery = true)
//	List<Object[]> getAreaBySol(@Param("solId") String  solId , @Param ("sns") String sns);
//	
//
//	@Query(value = "SELECT SCHEME_CODE FROM AAA_AREA_DETAILS WHERE area_name IN (SELECT CUN_AREA_NAME FROM aaa_sample_account WHERE SOL_ID = :solId and CUN_AREA_NAME = :areaName )  and sns = :sns", nativeQuery = true)
//	List<Object[]> getSchemeBySol(@Param("solId") String  solId, @Param("areaName") String cunAreaName, @Param ("sns") String sns);
//	
	
	    @Query(value = "SELECT DISTINCT SCHEME_CODE FROM AAA_AREA_DETAILS WHERE lower (AREA_NAME) = lower(:areaName) and SNS = :sns", nativeQuery = true)
		List<Object[]> getSchemeByArea(@Param("areaName") String cunAreaName, @Param("sns") String sns);
		
		
	
//	@Query(value = "SELECT * FROM AAA_SAMPLE_ACCOUNT WHERE CUN_AREA_NAME = :cunAreaName AND SCHEME_CODE = :schemeCode AND\r\n"
//			+ "SOL_ID = :solId AND CUN_DATE = :cunDate AND frequency = :frequency and SNS = :sns	", nativeQuery = true)
//	List<SampleAccountData> getAccounts(@Param("cunAreaName") String  cunAreaName,
//			@Param("schemeCode") String schemeCode,
//			@Param("solId") String solId,
//			@Param("cunDate") String cunDate,
//			@Param("frequency") String frequency,
//			@Param ("sns") String sns);
	
    @Query(value = "SELECT * FROM AAA_SAMPLE_ACCOUNT WHERE SCHEME_CODE in (select trim(NAME) from AAA_TEMPLATE_SCHEME_CODE where portfolio = :schemeCode)\r\n"
    		+ "AND SOL_ID = :solId AND CUN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD') and dummy = :auditId", nativeQuery = true)
List<SampleAccountData> getAccounts(
            @Param("schemeCode") String schemeCode,
            @Param("solId") String solId,
            @Param("cunDate") String cunDate,
            @Param ("cunEndDate") String cunEndDate,
            @Param ("auditId") String auditId);
 



	
    @Transactional
    @Modifying
    @Query(value = "UPDATE AAA_SAMPLE_ACCOUNT SET USERID = :userId where ACCOUNT_NUMBER in (:id) and cun_date between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD') and dummy = :auditId" , nativeQuery = true)
     
    public void setUserId(@Param("userId") String userId, @Param("id") List<String> id, @Param("cunDate") String cunDate , @Param("cunEndDate") String cunEndDate, @Param("auditId") String auditId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE AAA_SAMPLE_ACCOUNT SET STATUS = 'Submitted' WHERE ACCOUNT_NUMBER IN (:id) " +
		       "AND cun_date BETWEEN TO_DATE(:cunDate,'YYYY-MM-DD') AND TO_DATE(:cunEndDate,'YYYY-MM-DD') and SCHEME_CODE IN ( SELECT TRIM(NAME) FROM AAA_TEMPLATE_SCHEME_CODE WHERE portfolio = :schemeCode)\r\n"
		       + "AND SOL_ID = :solId and dummy = :auditId",
		       nativeQuery = true)	
	public void  setSubmitStatus(@Param("id") List<String> id, @Param("cunDate") String cunDate, @Param("cunEndDate") String cunEndDate, @Param("schemeCode") String schemeCode,
            @Param("solId") String solId, @Param ("auditId") String auditId);
	 
	
	
	
	@Query (value = "select * from aaa_sample_account where scheme_code in (select trim(name) from aaa_template_scheme_code where portfolio\r\n"
			+ "in (select scheme_code from aaa_area_details where area_name = :areaName)) and sol_id = :solId\r\n"
			+ "AND CUN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD') and dummy = :auditId" , nativeQuery = true)
	List<SampleAccountData> getAllAccountByArea(@Param ("areaName") String areaName , @Param ("solId") String solId, @Param ("cunDate") String cunDate, @Param ("cunEndDate") String cunEndDate, @Param ("auditId") String auditId);
	
	
//	@Transactional
//    @Modifying
//    @Query(value = "UPDATE AAA_SAMPLE_ACCOUNT SET STATUS = 'Repoted' where ACCOUNT_NUMBER in (:id) AND SCHEME_CODE = :schemeCode " , nativeQuery = true)
//    public void  setSaveStatus(@Param("id") List id, @Param("schemeCode") String schemeCode);


//@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number),\r\n" + 
//                    "  sum(case when MANDATORY = 'Yes' then 1 else 0 end) MandatoryCount,\r\n" + 
//                    "  sum(case when MANDATORY = 'No' then 1 else 0 end) NonMandatoryCount\r\n" + 
//                    "from AAA_SAMPLE_ACCOUNT\r\n" + 
//                    "where dummy = :auditId\r\n" + 
//                    "group by userId", nativeQuery = true)
//       
//       List<Object[]> fetchCountofUsers(@Param("auditId") String  auditId);
	
	@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number) from AAA_SAMPLE_ACCOUNT \r\n"
			+ " where scheme_code in (select trim(name) from AAA_TEMPLATE_SCHEME_CODE where portfolio = :schemeCode) and sol_id = :solId and cun_date between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD') and dummy = :auditId\r\n"
			+ "group by userId", nativeQuery = true)

List<Object[]> fetchCountofUsers(@Param("schemeCode") String  schemeCode, @Param("solId") String solId, @Param("cunDate") String cunDate, @Param("cunEndDate") String cunEndDate, @Param ("auditId") String auditId);


@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number) from AAA_SAMPLE_ACCOUNT \r\n"
		+ " where scheme_code in (select trim(name) from aaa_template_scheme_code where portfolio in (select scheme_code from aaa_area_details where area_name = :areaName)) and sol_id = :solId and cun_date between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD') and dummy = :auditId\r\n"
		+ "group by userId", nativeQuery = true)

List<Object[]> fetchCountofAllUsers(@Param("areaName") String  areaName, @Param("solId") String solId, @Param("cunDate") String cunDate, @Param("cunEndDate") String cunEndDate, @Param ("auditId") String auditId);


@Query(value = "SELECT * FROM AAA_SAMPLE_ACCOUNT WHERE SCHEME_CODE in (select trim(NAME) from AAA_TEMPLATE_SCHEME_CODE where portfolio = :schemeCode)\r\n"
		+ "AND SOL_ID = :solId AND CUN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
		+ "and dummy = :auditId and account_number in (:id)", nativeQuery = true)

List<SampleAccountData> getAccountById( @Param("schemeCode") String schemeCode,
            @Param("solId") String solId,
            @Param("cunDate") String cunDate,
            @Param ("cunEndDate") String cunEndDate,
            @Param ("auditId") String auditId,
            @Param("id") List<String> accountId);
	


}
