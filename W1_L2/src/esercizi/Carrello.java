package esercizi;

import java.util.Arrays;

public class Carrello {
	private Cliente cliente;
	private Articolo[] articoli = new Articolo[0];
	private Float prezzoTotale;

	public Carrello(Cliente cliente) {
		this.cliente = cliente;
		this.prezzoTotale = 0f;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Float getPrezzoTotale() {
		return prezzoTotale;
	}

//	public void setPrezzoTotale(Double prezzoTotale) {
//		this.prezzoTotale = prezzoTotale;
//	}

	public Articolo[] getArticoli() {
		return articoli;
	}

//	public void setArticoli(Articolo[] articoli) {
//		Articolo[] nuoviArticoli = new Articolo[articoli.length];
//		System.arraycopy(this.articoli, 0, nuoviArticoli, 0, this.articoli.length);
//		this.articoli = nuoviArticoli;
//	}

	public void aggiungiArticolo(Articolo articolo) {
		int newLength = this.articoli.length + 1;
		this.articoli = new Articolo[newLength];

		this.articoli = Arrays.copyOf(this.articoli, newLength);

		this.articoli[newLength - 1] = articolo;

		this.prezzoTotale += articolo.getPrezzo();
		articolo.setNumPezziDisponibili(articolo.getNumPezziDisponibili() - 1);

//		Articolo[] nuoviArticoli = new Articolo[this.articoli.length + 1];
//		System.arraycopy(this.articoli, 0, nuoviArticoli, 0, this.articoli.length);
		// Aggiungo articolo in ultima posizione
//		nuoviArticoli[this.articoli.length] = articolo; 
	}

	public String toString() {
		String text = "Carrello di:\n" + cliente.toString() + "\n\nArticoli:\n";
//		System.out.println( this.articoli.length);
		for (int i = 0; i < this.articoli.length; i++) {

			text += (i + 1) + ":\n" + this.articoli[i].toString();
		}

		text += "Totale = " + this.getPrezzoTotale() + "Euro";

		return text;
	}
}
