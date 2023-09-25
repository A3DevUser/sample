package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.PartySheetParentHeader;

@Repository
public interface PSParentHeaderRepository extends JpaRepository<PartySheetParentHeader, String> {

       List<PartySheetParentHeader> findByFormIdAndAuditType(String formId, String auditType);
       
       

}
