package esercizio;

import lombok.Getter;
import lombok.Setter;

public class Rivista extends ElementoBiblioteca {
	private @Getter @Setter Periodo periodo;

	public Rivista(Long ISBN, String titolo, Integer annoPubblicazione, Integer numPagine, Periodo p) {
		super(ISBN, titolo, annoPubblicazione, numPagine);
		this.periodo = p;
	}

	@Override
	public String toString() {
		return "\n-Rivista-\n" + getTitolo() + "\nanno: " + getAnnoPubblicazione() + "\nnum pagine: " + getNumPagine()
				+ "\n" + getPeriodo();
	}


}
