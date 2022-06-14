package com.ty.hospital.SpringBootHospitalApp.repositery;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MedorderRepositery extends JpaRepository<com.ty.hospital.SpringBootHospitalApp.Dto.Medorder, Integer> {

}
