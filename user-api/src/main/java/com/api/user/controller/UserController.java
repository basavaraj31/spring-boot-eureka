package com.api.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.user.model.User;
import com.api.user.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	private List<User> getAllUser() {
		return userService.getAllUser();
	}

	@GetMapping("/user/{id}")
	private User getUser(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}

	@DeleteMapping("/user/{id}")
	private void deleteUser(@PathVariable("id") int id) {
		userService.delete(id);
	}

	@PostMapping("/user")
	private int saveUser(@RequestBody User user) {
		userService.saveOrUpdate(user);
		return user.getUserId();
	}

	@PutMapping("/user")
	private User update(@RequestBody User user) {
		userService.saveOrUpdate(user);
		return user;
	}

}
