package com.studentapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	public String hello() {
		return "in create delete";
	}
	
}
