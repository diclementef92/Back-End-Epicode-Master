package com.esercizio.microservizi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esercizio.microservizi.model.Person;
import com.esercizio.microservizi.service.PersonService;

@RestController
@RequestMapping("app")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/data1")
	public ResponseEntity<String> testResponseString() {
		return new ResponseEntity<String>("stringa di esempio da data1", HttpStatus.OK);
	}

	@GetMapping("/data2")
	public ResponseEntity<List<Person>> testResponseListofFourPersons() {
		return new ResponseEntity<List<Person>>(personService.getAllPersons().subList(0, 4), HttpStatus.OK);
	}

	@GetMapping("/data3")
	public ResponseEntity<List<Person>> testResponseListofFourPersonsJSON() {
		return new ResponseEntity<List<Person>>(personService.getAllPersons().subList(0, 4), HttpStatus.OK);
	}
}
