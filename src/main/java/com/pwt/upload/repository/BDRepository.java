package com.pwt.upload.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.BDData;
import com.pwt.upload.model.LCData;

public interface BDRepository extends JpaRepository<BDData, String> {
	
	 @Query(value = "SELECT * FROM UNIVERSAL_DWH.MS_BOB_CON_BD_DETAILS WHERE\r\n"
	 		+ "SOL_ID = :solId AND BUSS_DATE\r\n"
	 		+ "between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
	 		+ "and ((BD_OPEN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD'))\r\n"
	 		+ "or (BD_CLOSURE_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')))\r\n"
	 		+ "AND AUDIT_ID = :auditId", nativeQuery = true)
	List<BDData> getAccounts(
	            @Param("solId") String solId,
	            @Param("cunDate") String cunDate,
	            @Param("cunEndDate") String cunEndDate,
	            @Param("auditId") String auditId);
	 
	    
	    @Transactional
	    @Modifying
	    @Query(value = "UPDATE UNIVERSAL_DWH.MS_BOB_CON_BD_DETAILS SET USERID = :userId where INSTA_TRANSACTION_REF_NO in\r\n"
	    		+ "(:id) and BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
	    		+ "and ((BD_OPEN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD'))\r\n"
	    		+ "or (BD_CLOSURE_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')))\r\n"
	    		+ "and AUDIT_ID = :auditId" , nativeQuery = true)
	     
	    public void setUserId(@Param("userId") String userId,
	    		@Param("id") List<String> id,
	    		@Param("cunDate") String cunDate,
	    		@Param("cunEndDate") String cunEndDate,
	            @Param("auditId") String auditId);
		
		@Transactional
		@Modifying
		@Query(value = "UPDATE UNIVERSAL_DWH.MS_BOB_CON_BD_DETAILS SET STATUS = 'Submitted' where INSTA_TRANSACTION_REF_NO in (:id)\r\n"
				+ "and  RUN_BUSINESS_DATE  between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
				+ "and ((BD_OPEN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD'))\r\n"
				+ "or (BD_CLOSURE_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')))\r\n"
				+ "and AUDIT_ID = :auditId" , nativeQuery = true)
		public void  setSubmitStatus(@Param("id") List<String> id,
				@Param("cunDate") String cunDate,
				@Param("cunEndDate") String cunEndDate,
	            @Param("auditId") String auditId);
		
		
		@Query(value = "select case when userId is null or userid = '' then 'Accounts Left' else userId end as userId,count(INSTA_TRANSACTION_REF_NO)\r\n"
				+ "from UNIVERSAL_DWH.MS_BOB_CON_BD_DETAILS\r\n"
				+ "WHERE sol_id = :solId and\r\n"
				+ "BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
				+ "and ((BD_OPEN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD'))\r\n"
				+ "or (BD_CLOSURE_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')))\r\n"
				+ "and AUDIT_ID = :auditId\r\n"
				+ "group by userId", nativeQuery = true)

	List<Object[]> fetchCountofUsers(@Param("solId") String solId,
			@Param("cunDate") String cunDate,
			@Param("cunEndDate") String cunEndDate,
            @Param("auditId") String auditId);
	
	
	@Query(value = "select * from UNIVERSAL_DWH.MS_BOB_CON_BD_DETAILS where INSTA_TRANSACTION_REF_NO in\r\n"
			+ "(:id) and BUSS_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')\r\n"
			+ "and ((BD_OPEN_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD'))\r\n"
			+ "or (BD_CLOSURE_DATE between TO_DATE(:cunDate,'YYYY-MM-DD') and TO_DATE(:cunEndDate,'YYYY-MM-DD')))\r\n"
			+ "and AUDIT_ID = :auditId", nativeQuery = true)

	List<BDData> getAccountByIds(@Param("id") List<String> accountId,
			@Param("cunDate") String cunDate,
			@Param("cunEndDate") String cunEndDate,
            @Param("auditId") String auditId);



	    


	}



