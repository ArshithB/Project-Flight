package com.flight.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flight.dto.User;
import com.flight.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
    private UserService userService;
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping()
	public ResponseEntity<User> createUser(@RequestBody User newUser){
		return new ResponseEntity<User>(userService.createUser(newUser), HttpStatus.CREATED);
		
	}
	
	
 

}
