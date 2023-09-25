package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.AuditData;


@Repository
public interface AuditRepository extends JpaRepository<AuditData, String> {
	@Query(value = "select a.audit_id, A.AUDIT_TITLE, A.SOL_ID, B.STATUS_NAME, A.AUDIT_TYPE FROM AAA_AUDITS A JOIN AAA_AUD_STATUS B\r\n"
			+ "ON a.status = b.status_id WHERE A.AUDIT_ID = :id", nativeQuery = true)
	
	List<Object[]> getAuditData(@Param ("id") String id);
	
	
}
