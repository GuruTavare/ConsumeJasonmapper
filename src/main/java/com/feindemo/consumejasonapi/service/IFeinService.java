package com.feindemo.consumejasonapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.feindemo.consumejasonapi.entiry.User;

@Service
@FeignClient(value = "jsonmapper", url = "http://localhost:8080/api/users")
public interface IFeinService {
	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getById(@PathVariable int id);
}
