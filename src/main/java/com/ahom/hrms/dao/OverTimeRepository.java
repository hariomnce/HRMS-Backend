package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahom.hrms.entity.OverTime;

@Repository
public interface OverTimeRepository extends JpaRepository<OverTime , Integer> {

	

}
