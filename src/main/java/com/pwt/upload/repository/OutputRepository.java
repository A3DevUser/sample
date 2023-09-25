package com.pwt.upload.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.OutputData;

@Repository

public interface OutputRepository extends JpaRepository<OutputData, String> {

	List<OutputData> findByAuditId(String auditId);
	
	@Query(value = "select user_Id,count(distinct account_id) from AAA_OUTPUT where audit_Id = ?1 group by user_Id", nativeQuery = true)
	List<Object> fetchUserData(@Param("auditId") String auditId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE AAA_OUTPUT SET IS_FIN_CREATED = 'yes' where ACCOUNT_ID in (:accountId) AND PORTFOLIO = :portfolio " , nativeQuery = true)
	public void  setSubmitStatus(@Param("accountId") List<String> accountId, @Param("portfolio") String portfolio);
	
	List<OutputData> findByAccountId(String accountId);

	List<OutputData> saveAndFlush(List<OutputData> out);

//	@Query(value = "select * from aaa_output where result = 'Fail' and PORTFOLIO = :portfolio and account_id in (:accountId)", nativeQuery = true )
//	List<OutputData> getOutputData(@Param("portfolio") String portfolio, @Param("accountId") List accountId);

	@Query(value = "select * from aaa_output where result != 'Pass' and result != 'Na' and PORTFOLIO = :portfolio and account_id in (:accountId)", nativeQuery = true )
	List<OutputData> getOutputData(@Param("portfolio") String portfolio, @Param("accountId") List<String> accountId);


	@Procedure("aaa_insert_fail_data")
	void insertFailData();

	@Query(value = "SELECT COUNT(*) FROM AAA_OUTPUT WHERE ID IN(:outputId)", nativeQuery = true)
	List<Long> fetchOutputCount(@Param("outputId") List<String> outputId);

}
