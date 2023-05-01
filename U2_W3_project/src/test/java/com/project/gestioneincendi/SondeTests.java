package com.project.gestioneincendi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.gestioneincendi.configuration.SondaConfiguration;
import com.project.gestioneincendi.observable.Sonda;
import com.project.gestioneincendi.observer.CentroControllo;

public class SondeTests {
	private static AnnotationConfigApplicationContext appContext;

	private static Logger logger = LoggerFactory.getLogger(CentroControllo.class);

	private static List<Sonda> sonde;

	private static CentroControllo centroControllo;

	@BeforeClass
	public static void setupTest() {
		logger.info("setup test: inizializzo appContext e 10 sonde");
		appContext = new AnnotationConfigApplicationContext(SondaConfiguration.class);
		sonde = new ArrayList<>();
		centroControllo = (CentroControllo) appContext.getBean("getCentroControllo");
		
		for (int i = 0; i < 10; i++) {
			Sonda s = (Sonda) appContext.getBean("randomSonda");
			sonde.add(s);
		}
		logger.info(sonde.toString());
	}

	// verifica se il livello di fumo aumenta di 1
	@Test
	public void aumentaLivelloFumo() {
		logger.info("aumentaLivelloFumo test");
		double levelBefore = sonde.get(0).getSmokeLevel();

		sonde.get(0).setSmokeLevel(levelBefore + 1);

		assertEquals(levelBefore + 1, sonde.get(0).getSmokeLevel(), 0);
	}

	// verifica se il livello di fumo diminuisce di 1
	@Test
	public void abbassaLivelloFumo() {
		logger.info("abbassaLivelloFumo test");
		double levelBefore = sonde.get(0).getSmokeLevel();
		sonde.get(0).setSmokeLevel(levelBefore - 1);

		assertEquals(levelBefore - 1, sonde.get(0).getSmokeLevel(), 0);
	}

	// verifica se una nuova sonda creata viene aggiunta al centro di controllo
	@Test
	public void aggiungiSonda() {
		logger.info("aggiungiSonda test");
		Sonda s = (Sonda) appContext.getBean("randomSonda");

		centroControllo.addSonda(s);

		assertTrue(centroControllo.getAllSonde().containsValue(s));
	}

	// verifica se una sonda viene rimossa dal centro di controllo
	@Test
	public void rimuoviSonda() {
		logger.info("rimuoviSonda con id 1 test");
		Sonda sondaToRemove = centroControllo.getSondaById(1l);
		centroControllo.removeSonda(sondaToRemove);

		assertFalse(centroControllo.getAllSonde().containsValue(sondaToRemove));
	}


	@AfterClass
	public static void afterProva() {
		logger.info("tear down: chiusura appContext");
		appContext.close();
	}



}
