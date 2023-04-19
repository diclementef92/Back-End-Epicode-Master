package com.progetto.gestioneprenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.progetto.gestioneprenotazioni.model.Prenotazione;
import com.progetto.gestioneprenotazioni.model.Utente;
import com.progetto.gestioneprenotazioni.service.PrenotazioneService;
import com.progetto.gestioneprenotazioni.service.UtenteService;

@Controller
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

	@Autowired
	private UtenteService utenteService;

	@Autowired
	private PrenotazioneService prenotazioneService;

	@GetMapping("/")
	public ResponseEntity<List<Prenotazione>> homepage() {
		return new ResponseEntity(prenotazioneService.getPrenotazioni(), HttpStatus.OK);
	}

	@GetMapping("/{username}")
	public ResponseEntity<List<Prenotazione>> getUtente(@PathVariable String username) {
		Utente utente = utenteService.findUtenteByUsername(username);
		return new ResponseEntity<List<Prenotazione>>(prenotazioneService.getPrenotazioniByUtente(utente),
				HttpStatus.OK);
	}


}