package dao;

import model.Evento;

public interface IEventoDAO {
	abstract void save(Evento e);

	abstract Evento getById(Long id);

	abstract void delete(Long id);
}
