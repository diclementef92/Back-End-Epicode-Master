package com.progetto.gestioneprenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.progetto.gestioneprenotazioni.model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("ParamsUser")
	@Scope("prototype")
	public Utente paramsUser(String userName, String nomeCompleto, String email) {
		return new Utente(userName, nomeCompleto, email);
	}

	@Bean("FakeUser")
	@Scope("prototype")
	public Utente fakeUser() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Utente u = new Utente();
		u.setNomeCompleto(fake.name().fullName());
		u.setEmail(u.getNomeCompleto() + "@mail.it");
		u.setUserName(u.getNomeCompleto() + fake.number().randomNumber());
		return u;

	}
}
