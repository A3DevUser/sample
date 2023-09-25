package com.pwt.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pwt.upload.model.BranchData;

public interface BranchRepository  extends JpaRepository<BranchData, String>{
	
	
	@Query(value = "SELECT AREA_NAME FROM aaa_branch_details WHERE branch_name = :branchName and SNS = :sns", nativeQuery = true)
    List<Object[]> getAreaByBranchName(@Param("branchName") String  branchName, @Param("sns") String sns);

//	List<Object[]> getAreaByBranchName(String branchName, String sns);
    


}
