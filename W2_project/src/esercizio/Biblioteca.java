package esercizio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;

public class Biblioteca {
	@Getter
	private List<ElementoBiblioteca> catalogo = new ArrayList<ElementoBiblioteca>();

	public Biblioteca() {

	}

	public List<ElementoBiblioteca> ricercaPerIsbn(Long isbn) {
		return catalogo.stream().filter(e -> e.getISBN() == isbn).collect(Collectors.toList());
	}
	public List<ElementoBiblioteca> ricercaPerTitolo(String titolo) {
		return catalogo.stream().filter(e -> e.getTitolo() == titolo).collect(Collectors.toList());
	}

	public List<ElementoBiblioteca> ricercaPerAnno(Integer anno) {
		return catalogo.stream().filter(e -> e.getAnnoPubblicazione() == anno).collect(Collectors.toList());
	}

	public void aggiungiElemento(ElementoBiblioteca elem) {
		if (!catalogo.contains(elem) && !catalogo.stream().anyMatch(e -> e.getISBN() == elem.getISBN()))
			catalogo.add(elem);
	}

	public void rimuoviElementoPerIsbn(Long isbn) {
		catalogo = catalogo.stream().filter(e -> e.getISBN() != isbn).collect(Collectors.toList());
	}

	public List<Libro> getLibri() {
		return catalogo.stream().filter(e -> e instanceof Libro).map(x -> (Libro) x).collect(Collectors.toList());
	}

	public List<Libro> ricercaPerAutore(String autore) {
		return getLibri().stream().filter(e -> e.getAutore().contains(autore)).collect(Collectors.toList());
	}

	public void salvaSuFile(String nomefile) {
		File f = new File(nomefile);
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			fw.write(this.toString());
			fw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}



	}

}
