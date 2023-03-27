package esercizio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import lombok.Getter;

public class Biblioteca {
	@Getter
	private List<ElementoBiblioteca> catalogo = new ArrayList<ElementoBiblioteca>();

	private File file;

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
		try {
			file = new File(nomefile);
			FileUtils.writeStringToFile(file, this.toString(), StandardCharsets.UTF_8, false);
			System.out.println("catalogo salvato su file" + nomefile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String leggiDafile(String nomefile) {
		try {
			file = new File(nomefile);
			return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
			return "errore lettura file";
		}
		

	}

	public String toString() {
		String res = "";
		for (ElementoBiblioteca elementoBiblioteca : catalogo) {
			res += elementoBiblioteca.toString();
		}
		return res;
	}

}
