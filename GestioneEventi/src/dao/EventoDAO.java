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
		} catch (Exception ex) {
			System.out.println("errore in save evento");
		}
	}

	@Override
	public Evento getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Evento ev = em.find(Evento.class, id);
			return ev;
		} catch (Exception ex) {
			System.out.println("errore in getid evento");
		}
		finally {
			em.close();
		}
		return null;
	}

	@Override
	public void delete(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Evento ev = em.find(Evento.class, id);
			if (ev != null) {
				em.remove(ev);
			}
		} catch (Exception ex) {
			System.out.println("errore in delete evento");
		} finally {
			em.close();
		}
	}



}
