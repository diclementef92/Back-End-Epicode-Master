package com.progetto.gestioneprenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.progetto.gestioneprenotazioni.model.Edificio;

@Configuration
public class EdificioConfiguration {

	@Bean("ParamsEdificio")
	@Scope("prototype")
	public Edificio paramsEdificio(String nome, String indirizzo, String citta) {
		return new Edificio(nome, indirizzo, citta);
	}

	@Bean("FakeEdificio")
	@Scope("prototype")
	public Edificio fakeEdificio() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Edificio ed = new Edificio();
		ed.setNome(fake.funnyName().name().toString());
//		Address address = fake.address();
		ed.setIndirizzo(fake.address().streetAddress());
		ed.setCitta(fake.address().cityName());
		return ed;

	}
}
