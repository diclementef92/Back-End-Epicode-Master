package com.project.gestioneincendi.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.project.gestioneincendi.observable.Sonda;

import lombok.ToString;

@SuppressWarnings("deprecation")
@ToString
@Configuration
//@PropertySource("classpath:application.properties")
public class CentroControllo implements Observer {

//	@Value("${sonda.smokelevelth}")
	private double smokelevelthreshold = 5;

	// observables: oggetti sonda non ripetuti, la key è l'id della sonda
	private Map<Long, Sonda> sonde = new HashMap<>();

	private static Logger logger = LoggerFactory.getLogger(CentroControllo.class);

	@Override
	public void update(Observable s, Object smokeLevel) {
		if (s instanceof Sonda) {
			Sonda sonda = (Sonda) s;

			// aggiorna la sonda negli observables
			sonde.put(sonda.getId(), sonda);

			if ((double) smokeLevel > smokelevelthreshold) {

				logger.error(
						"Allarme: livello fumo maggiore di " + smokelevelthreshold + " dalla sonda "
								+ sonda.toString());
				logger.error("http://host/alarm?=idsonda=" + sonda.getId() + "&lat="
						+ sonda.getCoordinata().getLatitudine()
						+ "&lon=" + sonda.getCoordinata().getLongitudine() + "&smokelevel=" + sonda.getSmokeLevel());
			}
			else {
				logger.info("rilevazione fumo dalla " + sonda.toString());
			}

		}
	}

	// aggiunge la sonda agli observable
	// se smokeLevel magg di 5 mostra errore
	public void addSonda(Observable s) {
		if (s instanceof Sonda) {
			Sonda sonda = (Sonda) s;
			this.sonde.put(sonda.getId(), sonda);

			if (sonda.getSmokeLevel() > smokelevelthreshold) {
				logger.error("Allarme: livello fumo maggiore di " + smokelevelthreshold + " dalla sonda "
						+ sonda.toString());
			}
		}
	}

	// rimuove la sonda dagli observable
	public void removeSonda(Observable s) {
		if (s instanceof Sonda) {
			Sonda sonda = (Sonda) s;
			this.sonde.remove(sonda.getId());
		}
	}





}
