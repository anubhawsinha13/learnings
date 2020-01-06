package com.a3.learnings.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//RestController is available with spring-boot starter WEB
@RestController
@RequestMapping(path="/api/user-mgmt")
public class UsersController {
	
	//Using HTTP verb in the URI action
	@GetMapping(value="/users")
	//Using Request Param to read the data as parameter passed in the URI
	public ResponseEntity getUser(@RequestParam (name="id", required= false)String userID) {
		
		//Adding header in the response entity
		HttpHeaders header = new HttpHeaders();
		header.add("Custom-header", "foo");
		
		//Using response entity to manipulate HTTP response  
		return new ResponseEntity("Getting the details using Request Param",header,HttpStatus.OK);
		
	}

}
