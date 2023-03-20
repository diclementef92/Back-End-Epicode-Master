package esercizi;

public class Chiamata {
	private Long numeroTelefono;
	private String prefisso;
	private int duratainMinuti;

	public Chiamata(String prefisso, Long num, int durata) {
		this.prefisso = prefisso;
		this.duratainMinuti = durata;
		this.numeroTelefono = num;
	}

	public String toString() {
		return "Numero chiamato: " + prefisso + " " + numeroTelefono + " Durata: " + duratainMinuti + "\n";

	}

}
