package esercizi;

import java.util.ArrayList;
import java.util.List;

public class Es {

	public static void main(String[] args) {
		// Es1
//		Thread th1 = new MyThread('#');
//		Thread th2 = new MyThread('@');
//		th2.start();
//		th1.start();

		// Es2
//		List<Integer> randomNumbers = numeriCasuali(30);
//		List<Integer> firstTen = randomNumbers.subList(0, 10);
//		
//		for (Integer num : randomNumbers) {
//			System.out.println(num);
//		}
//		sommaNumeriConThread(randomNumbers);

		// Es3
		System.out.println("-Registro Presenze-");
		Presenza mauro = new Presenza("Mauro Galli", 10);
		Presenza luigi = new Presenza("Luigi Rossi", 2);
		Presenza antonio = new Presenza("Antonio Verdi", 5);
		
		RegistroPresenze rp = new RegistroPresenze("ilmioregistro.txt");
		rp.scriviPresenze(mauro);
		rp.scriviPresenze(luigi);
		rp.scriviPresenze(antonio);
		
		String contenutoFile = rp.leggiPresenze();
		System.out.println("Presenze:\n" + contenutoFile);

	}

	private static void sommaNumeriConThread(List<Integer> randomNumbers) {
		MyThreadSum th1 = new MyThreadSum(randomNumbers.subList(0, 10));
		MyThreadSum th2 = new MyThreadSum(randomNumbers.subList(10, 20));
		MyThreadSum th3 = new MyThreadSum(randomNumbers.subList(20, 30));
		try {
			th1.start();
			th2.start();
			th3.start();

			th1.join();
			th2.join();
			th3.join();

			System.out.println("Thread con id:" + th1.getId() + " somma = " + th1.getSum());
			System.out.println("Thread con id:" + th2.getId() + " somma = " + th2.getSum());
			System.out.println("Thread con id:" + th3.getId() + " somma = " + th3.getSum());
			Integer tot = th1.getSum() + th2.getSum() + th3.getSum();
			System.out.println("Totale: " + tot);

		} catch (InterruptedException e) {
			System.out.println("errore in thread join: " + e.getMessage());
			e.printStackTrace();
		} catch (IllegalThreadStateException e) {
			System.out.println("errore in thread start: " + e.getMessage());
			e.printStackTrace();
		}

	}

	private static List<Integer> numeriCasuali(int n) {
		// set di numeri casuali non duplicati
		List<Integer> numeri = new ArrayList<Integer>();
		int randomInt;
		for (int i = 0; i < n; i++) {
			randomInt = (int) Math.floor(Math.random() * 100);
			numeri.add(randomInt);
		}
		return numeri;

	}

}
