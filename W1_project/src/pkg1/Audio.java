package pkg1;

public class Audio extends Riproducibile {

	public Audio(String titolo, double durata, int volume) {
		super(titolo, durata, volume);
	}

	@Override
	public void play() {
		System.out.println("-Audio-");

		for (int i = 0; i < super.getDurata(); i++) {
			System.out.print(super.getTitolo());
		}
		for (int i = 0; i < super.getVolume(); i++) {
			System.out.print("!");
		}
	}
}
