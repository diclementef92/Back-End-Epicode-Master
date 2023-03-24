package esercizi;

public class Customer {
	private Long id;
	private String name;
	private Integer tier;

	public Customer(Long id, String name, Integer tier) {
		this.id = id;
		this.setName(name);
		this.setTier(tier);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getTier() {
		return tier;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}

}
