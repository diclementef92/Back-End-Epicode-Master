package com.project.gestioneincendi.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import com.project.gestioneincendi.observable.Sonda;

import lombok.ToString;

@SuppressWarnings("deprecation")
@ToString
public class CentroControllo implements Observer {

	// observables: oggetti sonda non ripetuti, la key è l'id della sonda
	private Map<Long, Sonda> sonde = new HashMap<>();

	@Override
	public void update(Observable s, Object smokeLevel) {
		if (s instanceof Sonda) {
			Sonda sonda = (Sonda) s;

			// aggiorna la sonda negli observables
			sonde.put(sonda.getId(), sonda);
//			System.out.println(smokeLevel);
			if ((double) smokeLevel > 5d) {
				System.out.println("smoke level maggiore di 5 dalla sonda " + sonda.toString());
			}
		}
	}

	// aggiunge la sonda agli observable
	// se smokeLevel magg di 5 mostra errore
	public void addSonda(Observable s) {
		if (s instanceof Sonda) {
			Sonda sonda = (Sonda) s;
			this.sonde.put(sonda.getId(), sonda);

			if (sonda.getSmokeLevel() > 5d) {
				System.out.println("smoke level maggiore di 5 dalla sonda " + sonda.toString());
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
