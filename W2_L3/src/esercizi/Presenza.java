package esercizi;

public class Presenza {
	private String nome;
	private Integer ore;

	public Presenza(String nome, Integer ore) {
		this.setNome(nome);
		this.setOre(ore);
	}

	public String getNome() {
		return nome;
	}


	public Integer getOre() {
		return ore;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setOre(Integer ore) {
		this.ore = ore;
	}

	public String toString() {
		return getNome() + '@' + getOre() + '#';
	}
}
