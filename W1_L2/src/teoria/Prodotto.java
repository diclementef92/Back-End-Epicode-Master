package teoria;

public class Prodotto {
	private String nome;
	private double price = 20;
	private double sale = 0;

	static int priceChanged = 0;
	static int totProdotti = 0;

	public Prodotto() {
		System.out.println("costruttore prodotto");
		this.setNome("prodotto" + priceChanged);
	}
	public Prodotto(String nome,double price, double sale) {
		this.nome = nome;
		this.price = price;
		this.sale = sale;
		System.out.println("costruttore prodotto: " + this.nome);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		priceChanged++;
		price = p;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
