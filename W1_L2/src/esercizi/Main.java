package esercizi;

import java.util.Date;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		Rettangolo r1 = new Rettangolo(10.5, 5.8);
//		Rettangolo r2 = new Rettangolo(5, 5);

//		r1.stampaRettangolo();
//		r2.stampaRettangolo();
//		Rettangolo.stampaDueRettangoli(r1, r2);
//
//		CartaSim miaSim = new CartaSim("+39", 35589378294L);
//		miaSim.aggiungiCredito(50);
//		miaSim.sottraiCredito(30);
//		Chiamata prima = new Chiamata("+39", 3496472856L, 23);
//		Chiamata seconda = new Chiamata("+42", 339738934L, 4);
//		Chiamata terza = new Chiamata("+39", 394750357L, 61);
//		Chiamata quarta = new Chiamata("+31", 394750357L, 3);
//		Chiamata quinta = new Chiamata("+28", 393578637568L, 7);
//		Chiamata sesta = new Chiamata("+39", 3333564574L, 11);
//		Chiamata settima = new Chiamata("+39", 336400798L, 5);
//		System.out.println("La miaSim:\n" + miaSim.toString());
//
//		miaSim.aggiungiUltimaChiamata(prima);
//		miaSim.aggiungiUltimaChiamata(seconda);
//		miaSim.aggiungiUltimaChiamata(terza);
//		miaSim.aggiungiUltimaChiamata(quarta);
//		miaSim.aggiungiUltimaChiamata(quinta);
//		System.out.println("La miaSim:\n" + miaSim.toString());
//
//		miaSim.aggiungiUltimaChiamata(sesta);
//		miaSim.aggiungiUltimaChiamata(settima);
//
//		System.out.println("La miaSim:\n" + miaSim.toString());
//
//		Long nuovonum  = 35589378222L;
//		miaSim.setNumeroTelefono(nuovonum);
//		nuovonum = 35589378888L;
//		
//		System.out.println("La miaSim:\n" + miaSim.toString());
//		
		Articolo penna = new Articolo("penna", 1.8f, 100);
		Cliente andrea = new Cliente("Andrea", "De Cecco", "andrea.dececco@mail.it");
		Carrello carrello = new Carrello(andrea);
		carrello.aggiungiArticolo(penna);
		carrello.aggiungiArticolo(penna);

//		System.out.println("Nuovo cliente:\n" + andrea.toString());
		System.out.println(carrello.toString());

		System.out.println("imposta iva: ");
		Articolo.setIva(scanner.nextFloat());
		System.out.println("con l'iva al " + Articolo.getIva() + "% il totale e' "
				+ (carrello.getPrezzoTotale() * (1 + Articolo.getIva() / 100)) + "Euro");

	}

}
