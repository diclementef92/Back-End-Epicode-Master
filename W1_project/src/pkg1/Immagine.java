package pkg1;

public class Immagine extends ElementoMultimediale {
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		setLuminosita(luminosita);
	}

	@Override
	public void show() {
		System.out.println("-Immagine-");
		System.out.print(super.getTitolo());
		for (int i = 0; i < getLuminosita(); i++) {
			System.out.print("*");
		}
	}

	public int getLuminosita() {
		return luminosita;
	}
	// accetta un valore di luminosità compreso tra 0 e 10 inclusi

	public void setLuminosita(int luminosita) {
		if (luminosita >= 0 && luminosita <= 10) {
			this.luminosita = luminosita;
		}
	}

	public void aumentaLuminosita() {
		setLuminosita(this.luminosita + 1);
	}

	public void abbassaLuminosita() {
		setLuminosita(this.luminosita - 1);
	}

}
