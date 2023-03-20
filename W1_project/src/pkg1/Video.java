package pkg1;

public class Video extends Riproducibile {
	private int luminosita;

	public Video(String titolo, double durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		setLuminosita(luminosita);
	}

	@Override
	public void play() {
		System.out.println("-Video-");
		for (int i = 0; i < super.getDurata(); i++) {
			System.out.print(super.getTitolo());
		}
		for (int i = 0; i < getLuminosita(); i++) {
			System.out.print("*");
		}
		for (int i = 0; i < super.getVolume(); i++) {
			System.out.print("!");
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
		setLuminosita(this.luminosita++);
	}

	public void abbassaLuminosita() {
		setLuminosita(this.luminosita--);
	}



}
