package com.progetto.gestioneprenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.progetto.gestioneprenotazioni.model.Edificio;
import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.model.TipoPostazione;
import com.progetto.gestioneprenotazioni.service.EdificioService;

@Configuration
public class PostazioneConfiguration {

	private EdificioService edificioService;

	@Bean("ParamsPostazione")
	@Scope("prototype")
	public Postazione addPostazione(String descrizione, TipoPostazione tipo, Integer numPosti, Edificio edificio) {
		return new Postazione(descrizione, tipo, numPosti, edificio);
	}

//	@Bean("FakePostazione")
//	@Scope("prototype")
//	public Edificio fakePostazione(Edificio ed) {
//		Faker fake = Faker.instance(new Locale("it-IT"));
//		Postazione p = new Postazione();
//		// TODO
//		return null;
//	}

	@Bean
	@Scope("prototype")
	public Postazione addPostazioneRandom(Edificio ed) {
		TipoPostazione[] tipi = TipoPostazione.values();
		Integer index = (int) Math.floor(Math.random() * 3);
		Postazione p = new Postazione();
//		if (edificioService.getEdifici().isEmpty());

		p.setTipo(tipi[index]);
		p.setEdificio(ed);
		p.setDescrizione(p.getEdificio().getCitta() + "-" + p.getTipo());

		if(p.getTipo().equals(TipoPostazione.PRIVATA))
			p.setNumPosti(1);
		else {
			Integer numposti = (int) Math.floor(Math.random() * 50);
			p.setNumPosti(numposti);
		}

		return p;
			
			
	}

}
