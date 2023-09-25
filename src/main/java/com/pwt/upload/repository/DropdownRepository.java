package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwt.upload.model.DropdownData;

@Repository
public interface DropdownRepository extends JpaRepository<DropdownData, String> {

       List<DropdownData> findByFormId(String formId);

}
