package com.ty.hospital.SpringBootHospitalApp.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospital.SpringBootHospitalApp.Dto.Hospital;


public interface HospitalRepositery extends JpaRepository<Hospital, Integer>{

}
