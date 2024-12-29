package com.feindemo.consumejasonapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feindemo.consumejasonapi.entiry.User;
import com.feindemo.consumejasonapi.service.IFeinService;

@RestController
@RequestMapping("/api/feinconsume")
public class FeinController {
	private final IFeinService feinService;

	public FeinController(IFeinService feinService) {
		this.feinService = feinService;
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<User> cosumeUser(@PathVariable int id) {
		ResponseEntity<User> user = feinService.getById(id);
		return user;
	}

}
