package com.project.gestioneincendi.model;

import lombok.Data;

@Data
public class Coordinata {
	private double longitudine;
	private double latitudine;

	public Coordinata(double longitudine, double latitudine) {
		this.longitudine = longitudine;
		this.latitudine = latitudine;
	}

}
