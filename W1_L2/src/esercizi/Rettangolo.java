package esercizi;

public class Rettangolo {
	private double latoa;
	private double latob;

	public Rettangolo(double latoa, double latob) {
		this.latoa = latoa;
		this.latob = latob;
	}

	public double calcolaPerimetro() {
		return (latoa + latob) * 2;
	}

	public double calcolaArea() {
		return latoa * latob;
	}

	public void stampaRettangolo() {
		System.out.println("Perimetro: " + calcolaPerimetro());
		System.out.println("Area: " + calcolaArea());
	}

	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		r1.stampaRettangolo();
		r2.stampaRettangolo();
		System.out.println("Somma dei perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
		System.out.println("Somma delle aree: " +(r1.calcolaArea() + r2.calcolaArea()) );
	}
}
