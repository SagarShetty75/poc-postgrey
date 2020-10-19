package com.java.postgrey.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.postgrey.poc.repository.MrpRepository;

@Service
public class PersonService {
	
	@Autowired
	MrpRepository repo;

	public String getAll() {
		return repo.findMe("GFWRV");
	}

}
