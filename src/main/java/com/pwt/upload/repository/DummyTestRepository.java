package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwt.upload.model.DummyTestData;
import com.pwt.upload.model.SampleTestData;

public interface DummyTestRepository extends JpaRepository<DummyTestData, String> {

//	List<SampleTestData> findByPortfolioAndAreaName(String schemeCode, String areaName);

	List<DummyTestData> findBySchemeCodeAndAreaName(String schemeCode, String areaName);

}
