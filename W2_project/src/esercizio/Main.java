package esercizio;

public class Main {

	public static void main(String[] args) {
		ElementoBiblioteca rivista1 = new Rivista(70000012L, "Focus", 2007, 24, Periodo.MENSILE);
		ElementoBiblioteca rivista2 = new Rivista(70000013L, "Focus", 2006, 26, Periodo.MENSILE);
		ElementoBiblioteca libro1 = new Libro(70000011L, "ritratto di dorian gray", 1890, 55, "Oscar Wild",
				"fantascienza");
		ElementoBiblioteca libro2 = new Libro(70000014L, "La fondazione", 1980, 55, "Asimov", "fantascienza");


		Biblioteca miaBiblioteca = new Biblioteca();
		miaBiblioteca.aggiungiElemento(rivista1);
		miaBiblioteca.aggiungiElemento(rivista2);
		miaBiblioteca.aggiungiElemento(libro1);
		miaBiblioteca.aggiungiElemento(libro1);
		miaBiblioteca.aggiungiElemento(libro2);
		miaBiblioteca.rimuoviElementoPerIsbn(70000014L);

		miaBiblioteca.getCatalogo().forEach(System.out::println);

		miaBiblioteca.salvaSuFile("backup_catalogo.txt");

		System.out.println("\nlettura da file ");
		System.out.println(miaBiblioteca.leggiDafile("backup_catalogo.txt"));

	}

	
	
}
