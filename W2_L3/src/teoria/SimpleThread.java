package teoria;


public class SimpleThread extends Thread {
	// TODO: IMPORTARE LOGGER
	String msg;
	int n;

	public static int counter = 0;

	public SimpleThread(String msg) {
		this.msg = msg;
		counter++;
	}

	@Override
	public void run() {
		System.out.println(msg + " " + counter);
	}
}
