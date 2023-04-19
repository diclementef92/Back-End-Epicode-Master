package com.progetto.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.progetto.gestioneprenotazioni.service.EdificioService;

@Component
public class EdificioRunner implements ApplicationRunner {

	@Autowired
	EdificioService edificioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("EdificioRunner...");


//		edificioService.createFakeEdificio();

//		try {
//			edificioService.findEdificioByName("").forEach(e -> System.out.println(e));
//		} catch (NoSuchElementException e) {
//			System.out.println("edificio non trovato");
//		}

	}

}
