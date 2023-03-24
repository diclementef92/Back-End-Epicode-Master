package esercizio;

import lombok.Getter;
import lombok.Setter;

public class Libro extends ElementoBiblioteca {
	private @Getter @Setter String autore;
	private @Getter @Setter String genere;

	public Libro(Long ISBN, String titolo, Integer annoPubblicazione, Integer numPagine, String autore, String genere) {
		super(ISBN, titolo, annoPubblicazione, numPagine);
		this.genere = genere;
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "\n-Libro-\n" + getTitolo() + "\nanno: " + getAnnoPubblicazione() + "\nnum pagine: " + getNumPagine()
				+ "\nGenere " + getGenere() + "\nAutore " + getAutore();
	}
}
