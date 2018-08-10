package com.letsstartcoding.springbootrestapi.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/")
public class EmployeeController {
	
	@GetMapping("/app")
	public String hello() {
		return "Hello Docker";
	}

}
