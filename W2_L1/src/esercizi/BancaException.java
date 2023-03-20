package esercizi;

public class BancaException extends Exception {

	private String message;

	public BancaException(String message) {
		super(message);
		this.message = message;
	}

	public String toString() {
		return message;
	}
}
