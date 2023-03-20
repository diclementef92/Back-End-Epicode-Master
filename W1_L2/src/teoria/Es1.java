package teoria;

import java.util.Scanner;

public class Es1 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String[] arr = leggiStringhe();
		String[] stringheOrd = stringheOrdinate(arr);
		System.out.println(stringheOrd);
	}

	static String[] leggiStringhe() {
		String[] stringhe = new String[3];
		System.out.println("inserisci stringa 1");
		stringhe[0] = s.nextLine();
		System.out.println("inserisci stringa 2");
		stringhe[1] = s.nextLine();
		System.out.println("inserisci stringa 3");
		stringhe[2] = s.nextLine();
		
		return stringhe;
	}

	static String[] stringheOrdinate(String[] stringhe) {
		System.out.println("inserire ordine");
		boolean order = s.nextBoolean();

		if (order) {
			for (int i = 0; i < stringhe.length; i++) {
				
			}
		} else {

		}
		return stringhe;

	}

}
