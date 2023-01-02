package com.ahom.hrms.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.ImageData;



public interface ImageDataRepo extends JpaRepository<ImageData, Long>{
	  Optional<ImageData> findByName(String fileName);
}
