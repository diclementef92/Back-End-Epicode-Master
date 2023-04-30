package com.project.gestioneincendi.observable;

import java.util.Observable;
import java.util.Observer;

import com.project.gestioneincendi.model.Coordinata;

@SuppressWarnings("deprecation")
public class Sonda extends Observable {
	private Long id;
	private Coordinata coordinata;
	private double smokeLevel;
	private Observer centroControllo;

	public Sonda(Long id, Coordinata coordinata, Observer centroControllo) {
		super();
		this.id = id;
		this.coordinata = coordinata;
		this.smokeLevel = 0;
		this.centroControllo = centroControllo;
	}

	public void setSmokeLevel(double smokeLevel) {
		this.smokeLevel = smokeLevel;
		centroControllo.update(this, smokeLevel);
	}

	public double getSmokeLevel() {
		return smokeLevel;
	}


	public Coordinata getCoordinata() {
		return coordinata;
	}

	public void setCoordinata(Coordinata coordinata) {
		this.coordinata = coordinata;
	}

	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Sonda [id=" + id + ", coordinata=" + coordinata + ", smokeLevel=" + smokeLevel + "]";
	}

	public Observer getCentroControllo() {
		return centroControllo;
	}


}
