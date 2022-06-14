package com.ty.hospital.SpringBootHospitalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.SpringBootHospitalApp.Dto.Medorder;
import com.ty.hospital.SpringBootHospitalApp.service.MedOrderService;

@RestController
public class MedorderController {

	@Autowired
	private MedOrderService medOrderService;

	@PostMapping("/encounter/{encounterid}/medorder")
	public Medorder saveMedorder1(@PathVariable(name = "encounterid") int eid, @RequestBody Medorder medorder) {

		return medOrderService.saveMedorder(eid, medorder);

	}

	@GetMapping("/getmdorder")
	public Medorder getmMedorder(@RequestParam int id) {
		return medOrderService.getMedorder(id);
	}

	@GetMapping("/allmedorders")
	public List<Medorder> allmeMedorders() {
		return medOrderService.getAllMedorders();
	}

	@DeleteMapping("/deletemedorder")
	public void removeMedorder(@RequestParam int id) {
		medOrderService.removeMedorder(id);
	}

	@PutMapping("/updatemedorder")
	public Medorder updateMedorder(@RequestParam int id, @RequestBody Medorder medorder) {

		return null;
	}

}
