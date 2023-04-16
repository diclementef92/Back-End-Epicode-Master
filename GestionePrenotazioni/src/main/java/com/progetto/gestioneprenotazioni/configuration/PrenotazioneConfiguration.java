package com.progetto.gestioneprenotazioni.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.model.Prenotazione;
import com.progetto.gestioneprenotazioni.model.Utente;

@Configuration
public class PrenotazioneConfiguration {

	@Bean("ParamsPrenotazione")
	@Scope("prototype")
	public Prenotazione paramsPrenotazione(LocalDate d, Utente u, Postazione p) {
		return new Prenotazione(d, u, p);
	}


}
