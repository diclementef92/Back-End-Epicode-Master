package teoria;

public class ThreadsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThread th1 = new SimpleThread("T1");
		th1.start();
		SimpleThread th2 = new SimpleThread("T2");
		th2.start();
		SimpleThread th3 = new SimpleThread("T3");
		th3.start();
		SimpleThread th4 = new SimpleThread("T4");
		th4.start();

	}

}
