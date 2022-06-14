package com.ty.hospital.SpringBootHospitalApp.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospital.SpringBootHospitalApp.Dto.User;


public interface UserRepositery extends JpaRepository<User, Integer>{

	
}
