package esercizi;

import java.util.Arrays;
import java.util.Scanner;

public class es1 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int[] n = new int[5];
		numeriCasuali(n);
		// riceve km e km/l e calcola litri
//		calcolaConsumo();

	}

	public static void numeriCasuali(int[] numeri) throws Exception {

		System.out.println("numeri");
		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = (int) (Math.random() * 10) + 1;
//			System.out.println("[" + (i + 1) + "] " + numeri[i]);
		}
		System.out.println(Arrays.toString(numeri));

		int n, pos;

		System.out.println("inserisci un numero tra 1 e 10 [0 per uscire]");
		n = s.nextInt();
		s.nextLine();

		while (n != 0) {
			if (n < 0 || n > 10) {
				throw new Exception("valore non valido");
			}
			System.out.println("Posizione: indicare numero tra 1 e 10 ");
			pos = s.nextInt();
			s.nextLine();
			try {
				numeri[pos - 1] = n;

				for (int i = 0; i < numeri.length; i++) {
					System.out.println("[" + (i + 1) + "] " + numeri[i]);
				}

				System.out.println("inserisci un numero tra 1 e 10 [0 per uscire]");
				n = s.nextInt();
				s.nextLine();

			} catch (IndexOutOfBoundsException e) {
				System.out.println("posizione non valida");
			}
		}
	}

	public static void calcolaConsumo() {
		try {
			System.out.println("inserisci i km percorsi");
			int km = s.nextInt();
			s.nextLine();

			System.out.println("inserisci i litri consumati");
			int litri = s.nextInt();
			s.nextLine();

			int consumo = km / litri;
//			PrintStream out = new PrintStream(System.out, true, "UTF-8");// permette di usare carattere accentato
			System.out.println("il consumo e': " + consumo + " km/l");

		} catch (ArithmeticException e) {
			System.out.println("errore - non e' possibile dividere per 0");
		}
//		catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
	}
}
