package pkg1;

public abstract class ElementoMultimediale {
	private String titolo;

	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}

	public abstract void show();

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}
