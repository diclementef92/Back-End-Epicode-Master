package com.progetto.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.progetto.gestioneprenotazioni.service.EdificioService;
import com.progetto.gestioneprenotazioni.service.PostazioneService;

@Component
public class PostazioneRunner implements ApplicationRunner {

	@Autowired
	PostazioneService postazioneService;
	
	@Autowired
	EdificioService edificioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("PostazioneRunner...");

//		for (int i = 0; i < 10; i++) {
//
//			if (edificioService.getEdifici().isEmpty()) {
//				Long id = edificioService.createFakeEdificio();
//				postazioneService.insertPostazione(
//						new Postazione("test", TipoPostazione.PRIVATA, 1, edificioService.findEdificioById(id)));
//			} else {
//				Edificio ed = edificioService.getEdifici().get(0);
//				postazioneService.insertPostazione(new Postazione("test", TipoPostazione.PRIVATA, 1, ed));
//
//			}
//		}



	}

}
