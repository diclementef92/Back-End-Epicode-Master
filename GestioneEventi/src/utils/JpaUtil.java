package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static final EntityManagerFactory entityManagerFactory;

	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("GestioneEventi");
		} catch (Throwable ex) {
			System.err.println("Initial EntityManagerFactory creation failed."
					+ ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	static void summa() {
		int a = 0;
		int sum = a + 5;
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
