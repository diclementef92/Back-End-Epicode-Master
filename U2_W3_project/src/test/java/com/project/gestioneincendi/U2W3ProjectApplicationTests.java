package com.project.gestioneincendi;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.gestioneincendi.configuration.SondaConfiguration;
import com.project.gestioneincendi.observable.Sonda;
import com.project.gestioneincendi.observer.CentroControllo;

@SpringBootTest
@RunWith(JUnit4.class)
//NOTA: prima di eseguire verificare in run config che il test runner sia Junit 4
public class U2W3ProjectApplicationTests {

	private static List<Sonda> sonde = new ArrayList<>();
	private static AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
			SondaConfiguration.class);

	private static Logger logger = LoggerFactory.getLogger(CentroControllo.class);

	@BeforeClass
	public static void setupTest() {
		logger.info("setup test: creo 10 sonde");

		for (int i = 0; i < 10; i++) {
			Sonda s = (Sonda) appContext.getBean("randomSonda");
			sonde.add(s);
		}
		logger.info(sonde.toString());
	}

	// testa se il livello di fumo aumenta di 1
	@Test
	public void aumentaLivelloFumo() {
		logger.info("aumentaLivelloFumo test");
		double levelBefore = sonde.get(0).getSmokeLevel();

		sonde.get(0).setSmokeLevel(levelBefore + 1);

		assertEquals(levelBefore + 1, sonde.get(0).getSmokeLevel(), 0);
	}

	// testa se il livello di fumo diminuisce di 1
	@Test
	public void abbassaLivelloFumo() {
		logger.info("abbassaLivelloFumo test");
		double levelBefore = sonde.get(0).getSmokeLevel();
		sonde.get(0).setSmokeLevel(levelBefore - 1);

		assertEquals(levelBefore - 1, sonde.get(0).getSmokeLevel(), 0);
	}

	@Test
	public void getSonde() {
		logger.info("getSonde test");

	}

	@AfterClass
	public static void afterProva() {
		logger.info("dopo test");
		appContext.close();
	}


}
