package esercizi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class es3 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		Map<String, Long> agenda = new HashMap<String, Long>();
		stampaAgenda(agenda);

		aggiungiContatto(agenda, "Leonardo Da Vinci", 3454563454L);
		aggiungiContatto(agenda, "Galeazzi", 3498888664L);
		aggiungiContatto(agenda, "Francesco Totti", 3455556661L);

		modificaContatto(agenda, "Leonardo Da Vinci", 3445477586L);

		try {
			rimuoviContatto(agenda, "Galeazzi");
			ricercaPerNome(agenda, "Francesco Totti");
			ricercaPerNumero(agenda, 3445477586L);

		} catch (ContattoException e) {
			System.out.println(e.getMessage());
		}

		stampaAgenda(agenda);


	}

	private static String ricercaPerNumero(Map<String, Long> agenda, Long numero) throws ContattoException {

			for (Map.Entry<String, Long> entry : agenda.entrySet()) {
				if (entry.getValue().equals(numero))
					return entry.getKey();
			}

			throw new ContattoException("contatto con numero " + numero + " non trovato");

	}

	private static Long ricercaPerNome(Map<String, Long> agenda, String nome) throws ContattoException {
		if (!agenda.containsKey(nome)) {
			throw new ContattoException("contatto con nome " + nome + " non trovato");
		}
		return agenda.get(nome);


	}

	private static void stampaAgenda(Map<String, Long> agenda) {
		System.out.println("\n-Agenda Telefonica-");
		for (Map.Entry<String, Long> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	private static void modificaContatto(Map<String, Long> agenda, String nome, Long telefono) {
		if (agenda.containsKey(nome)) {
			agenda.put(nome, telefono);
			System.out.println("contatto " + nome + " modificato");
		}
		else {
			// se non è già presente un contatto con lo stesso nome
			System.out.println("Contatto con nome " + nome + " non presente, vuoi aggiungerlo? [y / n]");
			if (s.next().toLowerCase().equals("y")) {
				agenda.put(nome, telefono);
			}
		}
	}

	public static void aggiungiContatto(Map<String, Long> agenda, String nome, Long telefono) {
		if (agenda.containsKey(nome)) {
			// se è già presente un contatto con lo stesso nome 
			System.out.println("Contatto con nome " + nome + " gia' presente, vuoi modificarlo? [y / n]");

			if (s.next().toLowerCase().equals("y"))
				agenda.put(nome, telefono);
		} else {
			agenda.put(nome, telefono);
			System.out.println("contatto " + nome + " aggiunto");
		}
	}

	public static void rimuoviContatto(Map<String, Long> agenda, String nome) throws ContattoException {
		if (agenda.remove(nome) != null)
			System.out.println("contatto con nome " + nome + " rimosso");
		else {
			throw new ContattoException("contatto non trovato");
		}
	}

}
// tentativo con ContattoException 
//try {
//	aggiungiContatto(agenda, "Leonardo Da Vinci", 3454563454L);
//	System.out.println("");
//
//} catch (ContattoException e) {
//	System.out.println(e.getMessage());
//	if (s.next().toLowerCase().equals("y")) {
//		modificaContatto(agenda, "Leonardo Da Vinci", 3454563454L);
//	} else {
//		System.out.println("contatto non modificato");
//	}
//}
