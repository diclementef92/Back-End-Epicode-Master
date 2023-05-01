package com.project.gestioneincendi;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
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
public class U2W3ProjectApplicationTests {

	private List<Sonda> sonde = new ArrayList<>();
	private AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
			SondaConfiguration.class);

	private Logger logger = LoggerFactory.getLogger(CentroControllo.class);

	@Before
	public void setupTest() {
		logger.info("setup test");

		for (int i = 0; i < 10; i++) {
			Sonda s = (Sonda) appContext.getBean("randomSonda");
			sonde.add(s);
		}

	}

	@Test
	public void testprova() {
		logger.info("prova test");
		logger.info(sonde.toString());

	}

	@After
	public void afterProva() {
		logger.info("dopo test");
	}


}
