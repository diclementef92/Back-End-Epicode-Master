package Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ElementoCartaceo;
import model.Libro;
import model.Periodo;
import model.Rivista;

public class Main {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("W3_project");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		ElementoCartaceo libro1 = new Libro(1L, "Iorobot", 1980, 56, "asimov", "fantascienza");
		aggingiElemento(libro1);

		Rivista rivista1 = new Rivista(2L, "Focus", 2004, 35, Periodo.MENSILE);
		aggingiElemento(rivista1);
	}

	private static void aggingiElemento(ElementoCartaceo e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("elemento aggiunto");

	}

}
