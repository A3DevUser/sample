package com.pwt.upload.repository;

import java.util.List;

import org.apache.logging.log4j.util.Strings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.AccConfigData;
import com.pwt.upload.model.ColumnHeaderData;

public interface ColumnHeaderRepository extends JpaRepository<ColumnHeaderData, Integer> {

	List<ColumnHeaderData> findByFormId(String formId);

	//List<ColumnHeaderData> getByFormIdAndAuditType(String formId, String auditType);

	//List<ColumnHeaderData> getByFormIdAndAuditTypeAndArea(String formId, String auditType, String areaName);

	List<ColumnHeaderData> getByFormIdAndAuditTypeAndAreaNameAndSns(String formId, String auditType, String areaName, String sns);

//	List<ColumnHeaderData> getByFormIdAndAuditTypeAndAreaNameAndPortfolio(String formId, String auditType,
//			String areaName, String portfolio);

	List<ColumnHeaderData> getByFormIdAndAuditTypeAndAreaNameAndPortfolioAndSns(String formId, String auditType,
			String areaName, String portfolio, String sns);
	
//	@Query(value = "select a.AUDIT_TYPE_NAME, A.TABLE_NAME , B.FIELD_NAME, B.ACCESSOR FROM AAA_TABLE_MAPPING A JOIN AAA_COLUMN_HEADER B\r\n"
//			+ "ON A.AUDIT_TYPE_NAME = B.AUDIT_TYPE\r\n" , nativeQuery = true)
//	List<Object[]> getAccData();

	
	
//	@Query(value = "select a.AUDIT_TYPE_NAME, A.TABLE_NAME , B.FIELD_NAME, B.ACCESSOR FROM AAA_TABLE_MAPPING A JOIN AAA_COLUMN_HEADER B\r\n"
//			+ "			ON A.AUDIT_TYPE_NAME = B.AUDIT_TYPE where AUDIT_TYPE_NAME = :auditTypeName AND TABLE_NAME = :tableName" , nativeQuery = true)
//	List<String> getAccData(@Param("auditTypeName") List<String> auditTypeName, @Param("tableName") String tableName);
//	
//	List<Object> getAccData();
	
	
	
	
}
