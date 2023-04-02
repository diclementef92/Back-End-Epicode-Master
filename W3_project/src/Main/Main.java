package Main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.ElementoCartaceo;
import model.Libro;
import model.Prestito;
import model.Utente;

public class Main {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("W3_project");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

//		Utente u1 = new Utente("mario", "rossi", LocalDate.of(1990, 3, 4), 12345);
//		Utente u2 = new Utente("giovanni", "Beri", LocalDate.of(1993, 8, 10), 12347);
//		aggingiUtente(u1);
//		aggingiUtente(u2);
////
//		ElementoCartaceo libro1 = new Libro(2L, "Delitto e castigo", 1866, 120, "Dostoevskij", "romanzo");
//		ElementoCartaceo libro2 = new Libro(3L, "la guerra degli elfi", 2003, 60, "Herbie Brennan", "fantasy");
//		ElementoCartaceo libro3 = new Libro(4L, "La fondazione", 1980, 150, "Asimov", "fantascienza");
//		aggingiElemento(libro1);
//		aggingiElemento(libro2);
//		aggingiElemento(libro3);
//
//		Rivista rivista1 = new Rivista(1L, "Focus", 2004, 35, Periodo.MENSILE);
//		aggingiElemento(rivista1);
////		Utente u = em.find(Utente.class, 1L);
//
//		Prestito p1 = new Prestito(u1, libro1, LocalDate.now());
//		Prestito p2 = new Prestito(u1, libro2, LocalDate.now());
//		Prestito p3 = new Prestito(u2, libro2, LocalDate.now());
//		aggingiPrestito(p1);
//		aggingiPrestito(p2);
//		aggingiPrestito(p3);
		
//		Libro l = em.find(Libro.class, 3L);
//		rimuoviElemento(3L);

//		ElementoCartaceo elem = ricercaByIsbn(1L);

		List<Libro> libri = getLibri();
		for (Libro l : libri) {
			System.out.println(l);
		}

		List<Libro> libriDiAsimov = cercaLibriPerAutore("Asimov");
		for (Libro l : libriDiAsimov) {
			System.out.println(l);
		}
		// chiusura applicazione
		em.close();
		// DUBBIO: se inserito nel blocco finally da errore
		// cannot rollback on status committed

		emf.close();
	}

	// Aggiunta di un elemento del catalogo
	private static void aggingiElemento(ElementoCartaceo e) {
		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("elemento aggiunto");
		} catch (Exception ex) {
			System.out.println("errore aggiungi elemento");
			em.getTransaction().rollback();
			ex.printStackTrace();
		}
	}

	private static void aggingiPrestito(Prestito e) {
		//TODO: verificare prima che non sia già in prestito cioè trovare l'elemento,  la data di consegna efffettiva sia diversa da null 
//		e non sia compresa tra inizio e fine 

		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("prestito aggiunto");
		} catch (Exception ex) {
			System.out.println("errore aggiungi prestito");
			em.getTransaction().rollback();
			ex.printStackTrace();
		}
	}

	private static void aggingiUtente(Utente e) {
		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("utente aggiunto");
		} catch (Exception ex) {
			System.out.println("errore aggiungi utente");
			em.getTransaction().rollback();
			ex.printStackTrace();
		}
	}

	// Rimozione di un elemento del catalogo dato un codice ISBN
	private static void rimuoviElemento(Long isbn) {
		try {
			em.getTransaction().begin();
			ElementoCartaceo elemToRemove = em.find(ElementoCartaceo.class, isbn);
			em.remove(elemToRemove);
			em.getTransaction().commit();
			System.out.println("elemento rimosso");
		} catch (Exception ex) {
			System.out.println("errore rimuovi elemento");
			em.getTransaction().rollback();
			ex.printStackTrace();
		}
	}

	// Ricerca per ISBN
	private static ElementoCartaceo ricercaByIsbn(Long isbn) {
		return em.find(ElementoCartaceo.class, isbn);
	}

	private static List<Libro> getLibri() {
		try {
			Query query = em.createQuery("Select singleLibro From Libro singleLibro");
			List<Libro> tuttilibri = query.getResultList();
			return tuttilibri;
		} catch (Exception e) {
			System.out.println("errore ricerca libri");
			e.printStackTrace();
		}
		return null;
	}

	private static List<Libro> cercaLibriPerAutore(String autore) {
		try {
			Query query = em
					.createQuery("Select singleLibro From Libro singleLibro where singleLibro.autore ="
							+ autore);
			List<Libro> res = query.getResultList();
			return res;
		} catch (Exception e) {
			System.out.println("errore ricerca libri");
			e.printStackTrace();
		}
		return null;
	}

	// TODO set data restituzione effettiva

}
