package com.ahom.hrms.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.LeaveType;

public interface LeaveTypeRepository extends JpaRepository<LeaveType,Integer> {

}
