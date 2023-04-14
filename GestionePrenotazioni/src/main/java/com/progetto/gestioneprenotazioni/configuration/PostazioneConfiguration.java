package com.progetto.gestioneprenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.progetto.gestioneprenotazioni.model.Edificio;
import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.model.TipoPostazione;

@Configuration
public class PostazioneConfiguration {

	@Bean("ParamsPostazione")
	@Scope("prototype")
	public Postazione paramsPostazione(String descrizione, TipoPostazione tipo, Integer numPosti, Edificio edificio) {
		return new Postazione(descrizione, tipo, numPosti, edificio);
	}

	@Bean("FakePostazione")
	@Scope("prototype")
	public Edificio fakePostazione() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		// TODO
		return null;

	}
}
