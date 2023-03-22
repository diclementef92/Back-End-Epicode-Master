package esercizi;

public class MyThread extends Thread {
	private char symbol;

	public MyThread(char c) {
		this.symbol = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.symbol);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("errore in Thread.sleep: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

	public char getSymbol() {
		return symbol;
	}
}
