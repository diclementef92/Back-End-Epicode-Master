package esercizi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class es1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("quante parole vuoi inserire?");
		int n = s.nextInt();
		s.nextLine();
		System.out.println("inserisci le parole");
		paroleNonRipetute(n);

	}

	private static void paroleNonRipetute(int n) {
		Set<String> paroleNonRipetute = new HashSet<String>();
		List<String> paroleRipetute = new ArrayList<String>();
		int i = 0;
		while (i < n) {
			String parola = s.nextLine();
			if(!paroleNonRipetute.add(parola)) {
				// se già presente
				paroleRipetute.add(parola);
			}
			i++;
		}

		System.out.println("parole ripetute: ");
		for (String p : paroleRipetute) {
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.println("\nle parole non ripetute sono " + paroleNonRipetute.size());
		for (String p : paroleNonRipetute) {
			System.out.print(p);
			System.out.print(" ");
		}
	}

}
