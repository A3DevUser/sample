package com.pwt.upload.repository;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pwt.upload.model.ApiRepoData;

public interface ApiRepository extends JpaRepository<ApiRepoData, String> {

//	List<ApiRepoData> findByApiIdAndFormId(String apiId, String formId);

	List<ApiRepoData> findByApiIdAndFormIdAndPortfolio(String apiId, String formId, String portfolio);

}
