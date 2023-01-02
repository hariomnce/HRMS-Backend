package com.ahom.hrms.dao;

//import java.sql.Date;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.repository.query.Param;

import com.ahom.hrms.entity.ShiftManagement;



@EnableJpaRepositories
public interface AddShiftRepo extends JpaRepository<ShiftManagement,Integer>{
	
	

//	    @Query(value = "SELECT * FROM leave as l WHERE l.date >= :startDate AND l.date <= :endDate", nativeQuery = true)
//	    List<ShiftManagement> findByDateRange(@Param("startDate")Date startDate, @Param("endDate")Date endDate);


}