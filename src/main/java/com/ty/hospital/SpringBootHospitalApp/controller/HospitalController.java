package com.ty.hospital.SpringBootHospitalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.SpringBootHospitalApp.Dto.Hospital;
import com.ty.hospital.SpringBootHospitalApp.service.HospitalService;

@RestController
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;

	
	@PostMapping("/savehospital")
	public Hospital saveHospital(@RequestBody Hospital hospital) {
		return hospitalService.saveHospital(hospital);
	}


	@GetMapping("/gethospital")
	public Hospital getId(@RequestParam int id) {
		return hospitalService.getHospital(id);
	}


	@GetMapping("/allhospital")
	public List<Hospital> allHospitals() {
		return hospitalService.getAllHospitals();
	}

	
	@DeleteMapping("/deletehospital")
	public void removeHospital(@RequestParam int id) {
		hospitalService.removeHospital(id);
	}


	@PutMapping("/updatehospital")
	public Hospital updateHospital(@RequestParam int id, @RequestBody Hospital hospital) {

		return hospitalService.updateHospital(id, hospital);
	}

}
