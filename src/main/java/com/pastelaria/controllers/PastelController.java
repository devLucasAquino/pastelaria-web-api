package com.pastelaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pastelaria.entities.Pastel;
import com.pastelaria.repositories.PastelRepository;

@RestController
public class PastelController {
	
	@Autowired
	private PastelRepository repository;
	
	@CrossOrigin(origins = "http://localhost:5173")
	@GetMapping("/pasteis")
	public List<Pastel> findAll(){
		List<Pastel> result = repository.findAll();
		return result;
	}
	
}
