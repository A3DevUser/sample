package com.pwt.upload.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.CreParaGovAccountData;
import com.pwt.upload.model.SampleAccountData;

public interface CreParaGovAccountRepository extends JpaRepository<CreParaGovAccountData, String> {
	
    
    @Query(value = "SELECT * FROM AAA_BDL.MS_BOB_CDU_ACCT_DTLS_CON WHERE SCHEME_CODE IN ( SELECT TRIM(NAME) FROM AAA_TEMPLATE_SCHEME_CODE WHERE portfolio = :schemeCode)\r\n"
    		+ "AND SOL_ID = :solId AND BUSS_DATE BETWEEN TO_DATE(:cunDate, 'YYYY-MM-DD') AND TO_DATE(:cunEndDate, 'YYYY-MM-DD')", nativeQuery = true)
List<CreParaGovAccountData> getAccounts(
            @Param("schemeCode") String schemeCode,
            @Param("solId") String solId,
            @Param("cunDate") String cunDate,
            @Param ("cunEndDate") String cunEndDate);
 
    
    @Transactional
    @Modifying
    @Query(value = "UPDATE AAA_BDL.MS_BOB_CDU_ACCT_DTLS_CON SET USERID = :userId where ACCOUNT_NUMBER in (:id) and BUSS_DATE  between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')" , nativeQuery = true)
     
    public void setUserId(@Param("userId") String userId, @Param("id") List<String> id, @Param("cunDate") String cunDate, @Param ("cunEndDate") String cunEndDate);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE AAA_BDL.MS_BOB_CDU_ACCT_DTLS_CON SET STATUS = 'Submitted' where ACCOUNT_NUMBER in (:id) and  BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')" , nativeQuery = true)
	public void  setSubmitStatus(@Param("id") List<String> id, @Param("cunDate") String cunDate, @Param ("cunEndDate") String cunEndDate);
	
	
	@Query(value = "SELECT CASE WHEN userId IS NULL OR userId = '' THEN 'Accounts Left' ELSE userId END AS userId,\r\n"
			+ "COUNT(account_number) AS AccountCount FROM AAA_BDL.MS_BOB_CDU_ACCT_DTLS_CON WHERE scheme_code IN ( SELECT TRIM(name) FROM AAA_TEMPLATE_SCHEME_CODE WHERE portfolio = :schemeCode)\r\n"
			+ "AND sol_id = :solId AND BUSS_DATE BETWEEN TO_DATE(:cunDate, 'YYYY-MM-DD') AND TO_DATE(:cunEndDate, 'YYYY-MM-DD') GROUP BY userId", nativeQuery = true)

List<Object[]> fetchCountofUsers(@Param("schemeCode") String  schemeCode, @Param("solId") String solId, @Param("cunDate") String cunDate, @Param ("cunEndDate") String cunEndDate);


@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number) from AAA_BDL.MS_BOB_CDU_ACCT_DTLS_CON \r\n"
		+ " where scheme_code in (select trim(name) from aaa_template_scheme_code where portfolio in (select scheme_code from aaa_area_details where area_name = :areaName)) and sol_id = :solId and BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
		+ "group by userId", nativeQuery = true)

List<Object[]> fetchCountofAllUsers(@Param("areaName") String  areaName, @Param("solId") String solId, @Param("cunDate") String cunDate, @Param("cunEndDate") String cunEndDate);

    
@Query (value = "select * from AAA_BDL.MS_BOB_CDU_ACCT_DTLS_CON where scheme_code in (select trim(name) from aaa_template_scheme_code where portfolio\r\n"
		+ "in (select scheme_code from aaa_area_details where area_name = :areaName)) and sol_id = :solId\r\n"
		+ "AND BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')" , nativeQuery = true)
List<CreParaGovAccountData> getAllCreAdvAccountByArea(@Param ("areaName") String areaName , @Param ("solId") String solId, @Param ("cunDate") String cunDate, @Param ("cunEndDate") String cunEndDate);




}
