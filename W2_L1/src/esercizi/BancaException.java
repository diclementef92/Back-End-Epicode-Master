package esercizi;

public class BancaException extends Exception {

	private String message;

	public BancaException(String message) {
		super();
		this.message = message;
	}

	public String toString() {
		return message;
	}
}
