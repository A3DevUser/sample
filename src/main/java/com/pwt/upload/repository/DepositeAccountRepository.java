package com.pwt.upload.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.DepositAccountData;
import com.pwt.upload.model.SampleAccountData;

public interface DepositeAccountRepository extends JpaRepository<DepositAccountData, String> {


    @Query(value = "SELECT * FROM AAA_BDL.ms_bob_con_deposit_acc_opened WHERE SCHEME_CODE in \r\n"
            + "(select trim(NAME) from AAA_TEMPLATE_SCHEME_CODE where portfolio = :schemeCode)\r\n"
            + " AND SOL_ID = :solId AND BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD')"
            + " and TO_DATE(:cunEndDate,'YYYY-MM-DD')"
            + " ", nativeQuery = true)
List<DepositAccountData> getAccounts(
            @Param("schemeCode") String schemeCode,
            @Param("solId") String solId,
            @Param("cunDate") String cunDate, 
            @Param ("cunEndDate") String cunEndDate);
 

    
    @Transactional
    @Modifying
    @Query(value = "UPDATE AAA_BDL.ms_bob_con_deposit_acc_opened SET USERID = :userId where ACCOUNT_NUMBER in (:id) and BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')" , nativeQuery = true)
     
    public void setUserId(@Param("userId") String userId, @Param("id") List<String> id, @Param("cunDate") String cunDate, @Param ("cunEndDate") String cunEndDate );
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE AAA_BDL.ms_bob_con_deposit_acc_opened SET STATUS = 'Submitted' where ACCOUNT_NUMBER in (:id)\r\n"
			+ "and  BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')" , nativeQuery = true)
	public void  setSubmitStatus(@Param("id") List<String> id, @Param("cunDate") String cunDate, @Param("cunEndDate") String cunEndDate);
	
	
	@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number) \r\n"
//			+ "         sum(case when MANDATORY = 'Yes' then 1 else 0 end) MandatoryCount,\r\n"
//			+ "             sum(case when MANDATORY = 'No' then 1 else 0 end) NonMandatoryCount\r\n"
			+ "            from AAA_BDL.ms_bob_con_deposit_acc_opened \r\n"
			+ "            where scheme_code in (select trim(name) from AAA_TEMPLATE_SCHEME_CODE where portfolio = :schemeCode) and sol_id = :solId and BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
			+ "            group by userId"
			+ "", nativeQuery = true)

List<Object[]> fetchCountofUsers(@Param("schemeCode") String  schemeCode, @Param("solId") String solId, @Param("cunDate") String cunDate, @Param("cunEndDate") String cunEndDate);


@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number) from AAA_BDL.ms_bob_con_deposit_acc_opened \r\n"
		+ " where scheme_code in (select trim(name) from aaa_template_scheme_code where portfolio in (select scheme_code from aaa_area_details where area_name = :areaName)) and sol_id = :solId and BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
		+ "group by userId", nativeQuery = true)

List<Object[]> fetchCountofAllUsers(@Param("areaName") String  areaName, @Param("solId") String solId, @Param("cunDate") String cunDate, @Param("cunEndDate") String cunEndDate);


@Query (value = "select * from AAA_BDL.ms_bob_con_deposit_acc_opened where scheme_code in (select trim(name) from aaa_template_scheme_code where portfolio\r\n"
		+ "in (select scheme_code from aaa_area_details where area_name = :areaName)) and sol_id = :solId\r\n"
		+ "AND BUSS_DATE  between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')" , nativeQuery = true)
List<DepositAccountData> getAllDepoAccountByArea(@Param ("areaName") String areaName , @Param ("solId") String solId, @Param ("cunDate") String cunDate, @Param ("cunEndDate") String cunEndDate);


}
