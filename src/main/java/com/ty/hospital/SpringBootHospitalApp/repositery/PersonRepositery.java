package com.ty.hospital.SpringBootHospitalApp.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospital.SpringBootHospitalApp.Dto.Person;


public interface PersonRepositery extends JpaRepository<Person,Integer>{

}
