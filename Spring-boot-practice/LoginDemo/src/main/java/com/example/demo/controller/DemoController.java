package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AdminService;

@RestController
@CrossOrigin ("http://localhost:3000")
public class DemoController {
	@Autowired
	AdminService a;

	@GetMapping("login")
	ResponseEntity login(@RequestParam String email,@RequestParam String pswd){
		return new ResponseEntity<>(a.login(email, pswd),HttpStatus.OK);
	}
}
