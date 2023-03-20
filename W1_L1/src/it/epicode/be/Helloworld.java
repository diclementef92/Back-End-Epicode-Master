package it.epicode.be;

import java.util.Arrays;

public class Helloworld {

	public static void main(String[] args) {
		// Stampa a console la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println("Es.2");
		System.out.println("moltiplica: " + moltiplica(5, 7));
		System.out.println("concatena: " + concatena("ciao", 7));

		String[] parole = { "hello", " epicodes ", " students!" };
		String[] nuoveParole = inserisciInArray(parole, "all", 2);

		System.out.println(Arrays.toString(nuoveParole));

		System.out.println("concatenaInverso: " + concatenaInverso("e'", "bello", "java"));

		System.out.println("concatenaDinamico: " + concatenaDinamico(parole));

		System.out.println("perimetroRettangolo: " + perimetroRettangolo(4, 5));
		System.out.println("pariDispari: " + pariDispari(11));
		System.out.println("areaTriangolo: " + areaTriangolo(3, 4, 5));
	}

	public static int moltiplica(int a, int b) {
		return a * b;
	}

	public static String concatena(String s, int n) {
		return s + " " + n;
	}

	public static String[] inserisciInArray(String[] parole, String parola, int index) {
		String[] nuoveParole = new String[parole.length + 1];

		for (int i = 0; i < nuoveParole.length; i++) {
			if (i < index) {
				nuoveParole[i] = parole[i];

			} else if (i == index) {
				nuoveParole[i] = parola;
			} else {
				nuoveParole[i] = parole[i - 1];
			}
		}

		return nuoveParole;

	}

	public static String concatena(String a, String b, String c) {
		return a.concat(b).concat(c);

	}

	public static String concatenaDinamico(String... parole) {
		// System.out.println(stringhe[0]);
		String risultato = "";
		for (String parola : parole) {
			risultato += parola;
		}
		return risultato;

	}

	public static String concatenaInverso(String a, String b, String c) {
		return c.concat(b).concat(a);
	}

	// a e b lati
	public static float perimetroRettangolo(float a, float b) {
		return (a + b) * 2;
	}

	// a, b, c lati
	public static float perimetroTriangolo(float a, float b, float c) {
		return a + b + c;
	}

	// a, b, c lati
	public static float areaTriangolo(float a, float b, float c) {
		float semiperimetro = perimetroTriangolo(a, b, c) / 2;
		float risultato = (float) Math
				.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
		return risultato;
	}

	public static short pariDispari(int num) {
		if (num % 2 == 0)
			return 0;

		return 1;

	}

}
