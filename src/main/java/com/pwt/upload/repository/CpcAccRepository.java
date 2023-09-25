package com.pwt.upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwt.upload.model.CpcAccData;

public interface CpcAccRepository extends JpaRepository<CpcAccData, String> {

}
