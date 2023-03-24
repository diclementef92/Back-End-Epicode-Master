package esercizio;

import lombok.Getter;
import lombok.Setter;

public abstract class ElementoBiblioteca {

	private @Getter Long ISBN;
	private @Getter @Setter String titolo;
	private @Getter @Setter Integer annoPubblicazione;
	private @Getter @Setter Integer numPagine;

	public ElementoBiblioteca(Long ISBN, String titolo, Integer annoPubblicazione, Integer numPagine) {
		this.ISBN = ISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numPagine = numPagine;
	}

}
