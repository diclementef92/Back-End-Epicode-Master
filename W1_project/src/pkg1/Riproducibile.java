package pkg1;

public abstract class Riproducibile extends ElementoMultimediale {
	private double durata;
	private int volume;

	public Riproducibile(String titolo, double durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	@Override
	public void show() {
		play();
	}

	public abstract void play();

	public double getDurata() {
		return durata;

	}

	public int getVolume() {
		return volume;

	}
	public void setDurata(double durata) {
		this.durata = durata;

	}

	// accetta un valore di volume compreso tra 0 e 10 inclusi
	public void setVolume(int volume) {
		if (volume >= 0 && volume <= 10) {
			this.volume = volume;
		}
	}

	public void alzaVolume() {
		setVolume(this.volume++);
	}

	public void abbassaVolume() {
		setVolume(this.volume--);
	}


}
