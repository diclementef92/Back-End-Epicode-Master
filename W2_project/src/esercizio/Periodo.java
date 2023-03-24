package esercizio;

import lombok.Getter;

public enum Periodo {
	SETTIMANALE(7), MENSILE(30), SEMESTRALE(6 * MENSILE.getGiorni());

	private @Getter Integer giorni;

	Periodo(int i) {
		this.giorni = i;
	}

}
