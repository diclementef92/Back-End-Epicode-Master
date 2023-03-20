package pkg1;

import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static final int numElementi = 3;

	public static void main(String[] args) {
		ElementoMultimediale[] elementi = new ElementoMultimediale[numElementi];

		System.out.println("Inserire 5 Elementi Multimediali");
		System.out.println("I=immagine, A=audio, V=video");
		String inputText = "";
		
		int i = 0;
		while (i < numElementi) {
			System.out.println("Nuovo elemento:");
			inputText = s.nextLine();
			System.out.println("Scrivi titolo");
			String titolo = s.nextLine();

			int lum, vol;
			double durata;

			switch (inputText) {
			case "I":
				System.out.println("Indica luminosita' da 0 a 10");
				lum = promptInt();

				elementi[i] = new Immagine(titolo, lum);
				i++;

				break;

			case "A":
				System.out.println("Indica durata");
				durata = promptDouble();
				System.out.println("Indica volume da 0 a 10");
				vol = promptInt();
				elementi[i] = new Audio(titolo, durata, vol);
				i++;
				break;

			case "V":
				System.out.println("Indica durata");
				durata = promptDouble();
				System.out.println("Indica volume da 0 a 10");
				vol = promptInt();
				System.out.println("Indica luminosita' da 0 a 10");
				lum = promptInt();

				elementi[i] = new Video(titolo, durata, vol, lum);
				i++;
				break;

			default:
				System.out.println("tipo elemento non valido\n");
				break;
			}


		}

		int inputIndex;
		do {
			System.out.println("\nSeleziona un elemento:");
			for (int j = 0; j < elementi.length; j++) {
				System.out.println((j + 1) + "." + elementi[j].getTitolo());
			}
			inputIndex = promptInt() - 1;
			if (inputIndex >= 0 && inputIndex < elementi.length) {
				elementi[inputIndex].show();
			} else {
				System.out.println("indice non valido");
			}

		} while (inputIndex != -1);

	}

	static double promptDouble() {
		double res = s.nextDouble();
		s.nextLine();
		return res;

	}

	static int promptInt() {
		int res = s.nextInt();
		s.nextLine();
		return res;

	}

}
