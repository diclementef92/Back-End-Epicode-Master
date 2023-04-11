package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro extends ElementoCartaceo {

	private String autore;

	private String genere;

	public Libro() {

	}

	public Libro(Long isbn, String titolo, Integer annoPubblicazione, Integer numPagine, String autore, String genere) {
		super(isbn, titolo, annoPubblicazione, numPagine);
		this.genere = genere;
		this.autore = autore;
	}

	public Libro(String titolo, Integer annoPubblicazione, Integer numPagine, String autore, String genere) {
		super(titolo, annoPubblicazione, numPagine);
		this.genere = genere;
		this.autore = autore;
	}
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}



	public String toString() {
		return super.toString() + ", autore=" + autore + ", genere=" + genere + "]";
	}
}
