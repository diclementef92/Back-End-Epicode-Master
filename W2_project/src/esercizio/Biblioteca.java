package esercizio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;

public class Biblioteca {
	@Getter
	private List<ElementoBiblioteca> catalogo = new ArrayList<ElementoBiblioteca>();

	public Biblioteca() {

	}

	public List<ElementoBiblioteca> carcaPerIsbn(Long isbn) {
		return catalogo.stream().filter(e -> e.getISBN() == isbn).collect(Collectors.toList());
	}

	public List<ElementoBiblioteca> ricercaPerAnno(Integer anno) {
		return catalogo.stream().filter(e -> e.getAnnoPubblicazione() == anno).collect(Collectors.toList());
	}

	public void aggiungiElemento(ElementoBiblioteca elem) {
		if (!catalogo.contains(elem) && !catalogo.stream().anyMatch(e -> e.getISBN() == elem.getISBN()))
			catalogo.add(elem);
	}

	public List<Libro> getLibri() {
		return catalogo.stream().filter(e -> e instanceof Libro).map(x -> (Libro) x).collect(Collectors.toList());
	}
}
