package com.api.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.user.dao.UserRepository;
import com.api.user.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// getting all user record by using the method findaAll() of CrudRepository
	public List<User> getAllUser() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(user -> users.add(user));
		return users;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	// updating a record
	public void update(User user, int userId) {
		userRepository.save(user);
	}

}
