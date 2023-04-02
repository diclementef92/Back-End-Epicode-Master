package model;

import lombok.Getter;


public enum Periodo {
	SETTIMANALE(7), MENSILE(30), SEMESTRALE(6 * MENSILE.getGiorni());

	@Getter
	private Integer giorni;

	private Periodo(int n) {
		this.giorni = n;
	}


}
