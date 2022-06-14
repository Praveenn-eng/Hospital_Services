package com.ty.hospital.SpringBootHospitalApp.repositery;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.hospital.SpringBootHospitalApp.Dto.Branch;


public interface BranchRepositery extends JpaRepository<Branch,Integer>{

	
}
