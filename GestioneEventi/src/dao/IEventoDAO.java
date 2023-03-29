package dao;

import model.Evento;

public interface IEventoDAO {
	abstract void save(Evento e);

	abstract Evento getById(int id);

	abstract void delete(int id);
}
