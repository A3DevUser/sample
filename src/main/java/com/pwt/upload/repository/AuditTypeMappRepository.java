package com.pwt.upload.repository;

import java.util.List;

import javax.lang.model.util.Types;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.AuditTypeMappingData;

public interface AuditTypeMappRepository extends JpaRepository<AuditTypeMappingData, String> {
	
	@Query(value = " SELECT * FROM :tablename where AUDIT_TYPE_NAME =:auditTypeName", nativeQuery = true)
	List<T[]> getByAuditTypeIdAndTableName(@Param("auditTypeName") String  auditTypeName);
	
	

}

