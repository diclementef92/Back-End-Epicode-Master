package lezione;

public class Prodotto {
	String nome;
	int qnt;

	public Prodotto(String nome, int n) throws Exception {
		this.qnt = n;
		if (nome == "") {
			throw new Exception("nome non valido");
		}
		if(qnt<=0) {
			throw new Exception("Qnt non accettata");
		}
		this.nome = nome;
	}
}
