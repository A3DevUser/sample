//package com.pwt.upload.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.pwt.upload.model.AccConfigData;
//
//public interface AccConfigRepository extends JpaRepository<AccConfigData, String> {
//	
//	
//	@Query(value = "SELECT * FROM (AAA_FETCH_ACCOUNT_DATA.get_table_uni())" , nativeQuery = true)
//	Optional<AccConfigData> getAccData();
//	
//
//}
