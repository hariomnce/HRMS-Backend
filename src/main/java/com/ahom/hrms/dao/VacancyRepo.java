package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.Vacancy;

public interface VacancyRepo extends JpaRepository<Vacancy,Integer>{

}
