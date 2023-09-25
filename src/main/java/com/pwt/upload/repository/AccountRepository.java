package com.pwt.upload.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.AccountData;

@Repository
public interface AccountRepository extends JpaRepository<AccountData, String>{
	
	List<AccountData> findBySolIdAndSchemeCode(String solId, String schemeCode);
	
	List<AccountData> findBySolId(String solId);
	
	@Query(value = "select distinct Portfolio from AAA_TESTTEMPLATESCHEME_CODE where name in(select SCHEME_CODE from AAA_ACCOUNTS_DATA where sol_id = :solId)\r\n" + 
			"", nativeQuery = true)
	List<Object[]> getSchemeBySol(@Param("solId") String  solId);
	
	
	@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(account_number),\r\n" + 
			"  sum(case when MANDATORY = 'Yes' then 1 else 0 end) MandatoryCount,\r\n" + 
			"  sum(case when MANDATORY = 'No' then 1 else 0 end) NonMandatoryCount\r\n" + 
			"from AAA_ACCOUNTS_DATA\r\n" + 
			"where dummy = :auditId\r\n" + 
			"group by userId", nativeQuery = true)
	List<Object[]> fetchCountofUsers(@Param("auditId") String  auditId);
	
	@Transactional
	@Modifying
	@Query(value = "update AAA_ACCOUNTS_DATA set status = :status, userId = :userId where account_number in (:accounts)", nativeQuery = true)
	public void updateStatusByAccNum(@Param("accounts") List accounts, @Param("status") String status, @Param("userId") String userId);

	@Query(value = "select * from AAA_ACCOUNTS_DATA where SCHEME_CODE in(\r\n" + 
			"select Name from AAA_TESTTEMPLATESCHEME_CODE where Portfolio = :portfolioId) and sol_id = :solId" , nativeQuery = true)
	List<AccountData> getAccountsByPortfolioAndSolId(@Param("solId") String  solId, @Param("portfolioId") String portfolioId);

//	List<AccountData> findBySchemeCode(String schemeCode);

	@Query(value = "SELECT * FROM (AAA_FETCH_ACCOUNT_DATA.get_table_uni())" , nativeQuery = true)
	List<Object[]> getAccData();
	
}
