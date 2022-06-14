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

import com.ty.hospital.SpringBootHospitalApp.Dto.Encounter;
import com.ty.hospital.SpringBootHospitalApp.service.EncounterService;


@RestController
public class EncounterController {

	@Autowired
	private EncounterService encounterService;

	@PostMapping("/branch/{branchid}/person/{personid}/encounter")
	public Encounter saveEncounter(@PathVariable(name = "branchid") int bid, @PathVariable(name = "personid") int pid,
			@RequestBody Encounter encounter) {
		return encounterService.saveEncounter(bid, pid, encounter);
	}

	@GetMapping("/getencounter")
	public Encounter getEncounter(@RequestParam int id) {

		return encounterService.getEncounter(id);

	}

	@GetMapping("/allencounters")
	public List<Encounter> allEncounters() {
		return encounterService.getAllEncounters();
	}

	@DeleteMapping("/deleteencounter")
	public void removeEncounter(@RequestParam int id) {
		encounterService.removeEncounter(id);
		}

	@PutMapping("/updateEncounter")
	public Encounter updateEncounter(@RequestParam int id, @RequestBody Encounter encounter) {

		return null;
	}

}
