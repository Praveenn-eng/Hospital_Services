package com.ty.hospital.SpringBootHospitalApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.hospital.SpringBootHospitalApp.Dto.User;
import com.ty.hospital.SpringBootHospitalApp.repositery.UserRepositery;

@Repository
public class UserDao {

	@Autowired
	private  UserRepositery repositery;

	public User saveUser(User user) {
		return repositery.save(user);
	}

	public User getById(int id) {
		Optional<User> user = repositery.findById(id);
		if (user != null) {
			return user.get();
		}
		return null;

	}

	public List<User> getAll() {
		return repositery.findAll();
	}

	public User updateUser(int id, User user) {
		User user2 = getById(id);
		if (user2 != null) {
			repositery.save(user);
			return user;
		}
		return null;
	}

	public boolean deleteUser(int id) {
		User user = getById(id);
		if (user != null) {
			repositery.deleteById(id);
			return true;
		}
		return false;

	}
}