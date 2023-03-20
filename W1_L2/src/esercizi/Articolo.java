package esercizi;

public class Articolo {
	private Long codice;
	private String descrizione;
	private Float prezzo;
	private Integer numPezziDisponibili;
	private static Float iva;

	public Articolo(String descr, Float prezzo, Integer numPezzi) {
		this.codice = (long) (Math.random() * 10000000L);
		this.setDescrizione(descr);
		this.setPrezzo(prezzo);
		this.setNumPezziDisponibili(numPezzi);
	}

	public Long getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public Integer getNumPezziDisponibili() {
		return numPezziDisponibili;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public void setNumPezziDisponibili(Integer numPezziDisponibili) {
		this.numPezziDisponibili = numPezziDisponibili;
	}

	public String toString() {
		return "Codice Articolo: " + codice + "\nDescrizione: " + descrizione + "\nPrezzo: " + prezzo
				+ "\nUnita' disponibili: " + numPezziDisponibili + "\n";
	}

	public static Float getIva() {
		return iva;
	}

	public static void setIva(Float f) {
		Articolo.iva = f;
	}

}
