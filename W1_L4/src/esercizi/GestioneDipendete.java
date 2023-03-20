package esercizi;

public class GestioneDipendete {

	public static void main(String[] args) {
		Dipendente operaio1 = new Dipendente(250010L, Dipartimento.PRODUZIONE);
		Dipendente operaio2 = new Dipendente(250011L, Dipartimento.PRODUZIONE);
		Dipendente impiegato = new Dipendente(250012L, 1000, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dirigente = new Dipendente(250013L, 1000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

		operaio1.promuovi();
		impiegato.promuovi();
		dirigente.promuovi();

		operaio1.stampaDatiDipendente();
		operaio2.stampaDatiDipendente();
		impiegato.stampaDatiDipendente();
		dirigente.stampaDatiDipendente();

		double totale = Dipendente.calcolaPaga(operaio1, 5) + Dipendente.calcolaPaga(operaio2, 5)
				+ Dipendente.calcolaPaga(impiegato, 5) + Dipendente.calcolaPaga(dirigente, 5);

		System.out.println("\nTotale stipendi da pagare = " + totale);

// 		System.out.println("- operaioProd:\n" + operaioProd.toString());
//		System.out.println("\n- impiegatoAmm:\n" + impiegatoAmm.toString());
//		operaioProd.promuovi();
//		System.out.println("dopo promozione");
//		operaioProd.stampaDatiDipendente();
	}

}
