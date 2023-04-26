package com.esercizio.microservizi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercizio.microservizi.model.Person;
import com.esercizio.microservizi.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repo;
	
	public List<Person> getAllPersons() {
		return repo.findAll();

	}
}
