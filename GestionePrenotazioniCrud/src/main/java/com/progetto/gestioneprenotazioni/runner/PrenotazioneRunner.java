package com.progetto.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.progetto.gestioneprenotazioni.service.PostazioneService;
import com.progetto.gestioneprenotazioni.service.PrenotazioneService;
import com.progetto.gestioneprenotazioni.service.UtenteService;

@Component
public class PrenotazioneRunner implements ApplicationRunner {

	@Autowired
	UtenteService utenteService;

	@Autowired
	PostazioneService postazioneService;
	
	@Autowired
	PrenotazioneService prenotazioneService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("PrenotazioneRunner...");


//		prenotazioneService.insertPrenotazione(new Prenotazione(LocalDate.now(), utenteService.getUtenti().get(0),
//				postazioneService.getPostazioni().get(2)));

//		prenotazioneService.updatePrenotazione(
//				new Prenotazione(LocalDate.now(),
//						utenteService.findUtenteByUsername("Ing. Maristella Pellegrini469825"),
//						postazioneService.findPostazioneById(1L)));


	}

}
