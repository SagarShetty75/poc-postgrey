package com.java.postgrey.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.postgrey.poc.service.PersonService;

@RestController
@RequestMapping("/person")
public class EntryController {
	
	@Autowired
	PersonService service;

	@GetMapping("/getAll")
	public String getall(){
		
		return service.getAll();
	}
}
