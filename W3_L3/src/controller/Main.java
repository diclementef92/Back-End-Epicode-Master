package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.User;

public class Main {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("W3_L3");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		User u1 = new User();
		u1.setName("marco");
		u1.setLastname("aurelio");
		u1.setEmail("m.aurelio@mail.it");

		try {

//		addUser(u1);
		User utenteletto = findUser(1L);
		System.out.println(utenteletto);

	} catch (Exception e) {
		// TODO: handle exception
	} finally {
		em.close();
		emf.close();
	}

	}

	public static void addUser(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("utente aggiunto");

	}

	public static User findUser(Long id) {
		em.getTransaction().begin();
		User u = em.find(User.class, id);
		em.getTransaction().commit();
		System.out.println("utente trovato");

		return u;
	}

	public static User updateUser(User u) {
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("utente aggiornato");

		return u;
	}

	public static User deleteUser(User u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("utente rimosso");

		return u;
	}
}
