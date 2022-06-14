package com.ty.hospital.SpringBootHospitalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.SpringBootHospitalApp.Dto.Person;
import com.ty.hospital.SpringBootHospitalApp.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {

		return personService.savePerson(person);

	}

	@GetMapping("/person")
	public Person getId(@RequestParam int id) {
		return personService.getPerson(id);
	}

	@GetMapping("/allpersons")
	public List<Person> getAll() {
		return personService.getAllPersons();
	}

	@DeleteMapping("/person")
	public void delete(@RequestParam int id) {
		personService.removePerson(id);
	}

	@PostMapping("/updateperson")
	public Person updatePerson(@RequestParam int id, @RequestBody Person person) {
		return null;
	}

}
