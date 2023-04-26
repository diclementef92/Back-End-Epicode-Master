package com.esercizio.microservizi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esercizio.microservizi.service.PersonService;

@RestController
@RequestMapping("app")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/data1")
	public ResponseEntity<String> testResponseString() {
		return "stringa di esempio da data1";

	}

}
