package lezione;

public class Veicolo {
	private Marca marca;
	
	public Veicolo (Marca m) {
		this.marca = m;
	}
	public void setMarca(Marca m) {
		this.marca = m;
	}
	public Marca getMarca () {
		return marca;
	}
	
}
