package com.ty.hospital.SpringBootHospitalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.SpringBootHospitalApp.Dto.User;
import com.ty.hospital.SpringBootHospitalApp.dao.UserDao;

@RestController
public class UserController {

	@Autowired
	UserDao dao;

	@PostMapping("/saveuser")
	public User storeUser(@RequestBody User user) {
		return dao.saveUser(user);
	}

	@GetMapping("/allusers")
	public List<User> allUsers() {
		return dao.getAll();
	}

	@DeleteMapping("/deleteuser")
	public void removeuser(@RequestParam int id) {
		dao.deleteUser(id);
	}

}
