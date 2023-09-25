package com.pwt.upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwt.upload.model.SmsAccData;

public interface SmsAccRepository extends JpaRepository<SmsAccData, String> {

}
