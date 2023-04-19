package com.progetto.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.progetto.gestioneprenotazioni.service.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	@Autowired
	UtenteService utenteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("UtenteRunner...");

//		utenteService.createFakeUtente();
//
//		try {
//		System.out.println(utenteService.findUtenteByUsername("Miriana Gallo"));
//		} catch (NoSuchElementException e) {
//			System.out.println("utente non trovato");
//		}

	}

}
