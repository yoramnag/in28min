package com.in28min.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoServices userDaoServices;
	
	//get all users
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return userDaoServices.findAll();
	}
	
	
	//get one user 
	@GetMapping("/users/{id}")
	public User retriveOneUser(@PathVariable int id) {
		return userDaoServices.findOne(id);
	}
}
