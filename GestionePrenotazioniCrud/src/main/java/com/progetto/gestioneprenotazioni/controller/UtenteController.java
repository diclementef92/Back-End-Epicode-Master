package com.progetto.gestioneprenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progetto.gestioneprenotazioni.model.Utente;
import com.progetto.gestioneprenotazioni.service.UtenteService;

@RestController
@RequestMapping("/utenti")
public class UtenteController {

	@Autowired
	private UtenteService utenteService;

	@GetMapping
	public ResponseEntity<List<Utente>> getAllUtenti() {
		List<Utente> utenti = utenteService.getUtenti();
		return new ResponseEntity<List<Utente>>(utenti, HttpStatus.OK);
	}

	@GetMapping("/{username}")
	public ResponseEntity<?> getUtente(@PathVariable String username) {
		return new ResponseEntity<Utente>(utenteService.findUtenteByUsername(username), HttpStatus.OK);
	}


}
