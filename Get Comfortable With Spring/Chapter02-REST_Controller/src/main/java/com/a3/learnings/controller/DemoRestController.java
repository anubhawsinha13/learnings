package com.a3.learnings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoRestController {
	
	@GetMapping("Hello")
	public String sayHello() {
		return "Hello World!!";
	}

}
