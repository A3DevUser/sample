package com.pwt.upload.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.ForexAccountData;
import com.pwt.upload.model.SampleAccountData;

public interface ForexAccountRepository extends JpaRepository<ForexAccountData, String> {
	
    
    @Query(value = "SELECT * FROM aaa_frx_acc_data WHERE SCHEME_CODE in \r\n"
            + "(select NAME from AAA_TEMPLATE_SCHEME_CODE where portfolio = :schemeCode)\r\n"
            + " AND SOL_ID = :solId AND CUN_DATE = :cunDate"
            + " ", nativeQuery = true)
List<ForexAccountData> getAccounts(
            @Param("schemeCode") String schemeCode,
            @Param("solId") String solId,
            @Param("cunDate") String cunDate);
 
    
    @Transactional
    @Modifying
    @Query(value = "UPDATE aaa_frx_acc_data SET USERID = :userId where ACCOUNT_NUMBER in (:id) and cun_date = :cunDate" , nativeQuery = true)
     
    public void setUserId(@Param("userId") String userId, @Param("id") List<String> id, @Param("cunDate") String cunDate);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE aaa_frx_acc_data SET STATUS = 'Submitted' where ACCOUNT_NUMBER in (:id)\r\n"
			+ "and  cun_date = :cunDate" , nativeQuery = true)
	public void  setSubmitStatus(@Param("id") List<String> id, @Param("cunDate") String cunDate);
	
	
	@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number), \r\n"
//			+ "         sum(case when MANDATORY = 'Yes' then 1 else 0 end) MandatoryCount,\r\n"
//			+ "             sum(case when MANDATORY = 'No' then 1 else 0 end) NonMandatoryCount\r\n"
			+ "            from aaa_frx_acc_data \r\n"
			+ "            where scheme_code in (select name from AAA_TEMPLATE_SCHEME_CODE where portfolio = :schemeCode) and sol_id = :solId and cun_date = :cunDate\r\n"
			+ "            group by userId"
			+ "", nativeQuery = true)

List<Object[]> fetchCountofUsers(@Param("schemeCode") String  schemeCode, @Param("solId") String solId, @Param("cunDate") String cunDate);


}
