package esercizio;

import lombok.Getter;
import lombok.Setter;

public abstract class ElementoBiblioteca {
	@Getter
	private Long ISBN;

	@Getter
	@Setter
	private String titolo;

	@Getter
	@Setter
	private Integer annoPubblicazione;

	@Getter
	@Setter
	private Integer numPagine;

	public ElementoBiblioteca(Long ISBN, String titolo, Integer annoPubblicazione, Integer numPagine) {
		this.ISBN = ISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numPagine = numPagine;
	}


}
