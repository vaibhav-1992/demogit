package com.main.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.webapp.entity.User;
@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService us;
	@PostMapping("/createUser")
	public User createuser(@RequestBody User u)
	{
		User saveUser=us.saveUserDetails(u);
		
		return saveUser;
	}
	@GetMapping("/users/{pageNumber}")
	public Iterable<User> getUsers(@PathVariable int pageNumber)
	{
		Iterable<User>users=us.getAllUsers(pageNumber);
		return users;
		
	}
}
