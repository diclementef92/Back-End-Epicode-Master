package esercizi;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		String frase;
//
//		System.out.println("Scrivi frase: [esc per uscire]");
//		frase = scanner.nextLine();
//		while (!frase.toLowerCase().equals("esc")) {
//			System.out.println("il numero di caratteri e' " + (stringaPariDispari(frase) ? "pari" : "dispari"));
//			System.out.println("Scrivi frase: [esc per uscire]");
//			frase = scanner.nextLine();
//		}
//
//		System.out.println("scrivi anno: ");
//		int anno = scanner.nextInt();
//		System.out.println((annoBisestile(anno) ? " bisestile" : " non bisestile"));
//		for (int i = 0; i <= 4; i++) {
//			stampaNumeroInlettere(i);
//		}

		String frase = "";
		System.out.println("Scrivi stringa: [:q per uscire]");
		frase = scanner.nextLine();
		while (!frase.equals(":q")) {
			String caratteri = frase.replace("", ",");
			System.out.println(caratteri.substring(1, caratteri.length() - 1));
//			for (int i = 0; i < caratteri.length; i++) {
//				System.out.print(caratteri[i] + ",");
//			}
			System.out.println("\nScrivi stringa: [:q per uscire]");
			frase = scanner.nextLine();
		}

		System.out.println("inserisci un numero");
		int n = scanner.nextInt();
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}

	}

	// return true se il numero di caratteri è pari, false altrimenti
	static boolean stringaPariDispari(String stringa) {
		return stringa.length() % 2 == 0;
	}

	static boolean annoBisestile(int anno) {
		if (anno % 4 == 0 || (anno % 100 == 0 && anno % 400 == 0)) {
			return true;
		}
		return false;
	}

	static void stampaNumeroInlettere(int num) {
		String testo = "";
			switch (num) {
			case 0:
				testo = "zero";
				break;
			case 1:
				testo = "uno";
				break;
			case 2:
				testo = "due";
				break;
			case 3:
				testo = "tre";
				break;

			default:
				testo = "il numero " + num + " non e' compreso tra 0 e 3";
				break;
			}
			System.out.println(testo);

	}


}
