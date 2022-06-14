package com.ty.hospital.SpringBootHospitalApp.repositery;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospital.SpringBootHospitalApp.Dto.Encounter;


public interface EncounterRepositery extends JpaRepository<Encounter, Integer>{

}
