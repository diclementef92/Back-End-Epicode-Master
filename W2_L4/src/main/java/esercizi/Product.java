package esercizi;

public class Product {
	private Long id;
	private String name;
	private String category;
	private Double price;

	public Product(Long id, String name, String category, Double price) {
		this.id = id;
		this.setName(name);
		this.setCategory(category);
		this.setPrice(price);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public Double getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

	public String toString() {
		return "Nome: " + getName() + "\ncategoria: " + getCategory() + "\nPrezzo: " + getPrice() + "\n";
	}
}
