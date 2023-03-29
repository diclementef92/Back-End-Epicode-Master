package dao;

import javax.persistence.EntityManager;

import model.Evento;
import utils.JpaUtil;

public class EventoDAO implements IEventoDAO {

	@Override
	public void save(Evento e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("evento salvato");
		} catch (Exception ex) {
			System.out.println("errore in save evento");
			em.getTransaction().rollback();
			ex.printStackTrace();
		}
	}

	@Override
	public Evento getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Evento ev = em.find(Evento.class, id);

			return ev;
		} catch (Exception ex) {
			System.out.println("errore in getid evento");
			em.getTransaction().rollback();
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Evento ev = em.find(Evento.class, id);
			System.out.println("evento cancellato");

			if (ev != null) {
				em.remove(ev);
			}
		} catch (Exception ex) {
			System.out.println("errore in delete evento");
			em.getTransaction().rollback();
			ex.printStackTrace();

		} finally {
			em.close();
		}
	}



}
