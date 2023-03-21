package esercizi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class es2 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("quanti numeri casuali da 0 a 100?");
		int n = s.nextInt();
		s.nextLine();
		List<Integer> numCasuali = numeriCasuali(n);
		System.out.println("num casuali ordinati: ");
		Collections.sort(numCasuali);
		for (Integer num : numCasuali) {
			System.out.print(num);
			System.out.println(" ");
		}
		System.out.println("num casuali ordinati reverse: ");
		Collections.reverse(numCasuali);
		for (Integer num : numCasuali) {
			System.out.print(num);
			System.out.println(" ");
		}
		System.out.println("numeri in posizione pari");
		stampaNumeriPosizionePari(numCasuali, true);

	}

	private static void stampaNumeriPosizionePari(List<Integer> numeri, boolean pari) {
		for (int i = 0; i < numeri.size(); i++) {
			if (pari && i % 2 == 0 || (!pari && i % 2 != 0)) {
				System.out.println(numeri.get(i));
			}
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
