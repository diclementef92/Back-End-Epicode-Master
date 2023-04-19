package com.progetto.gestioneprenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progetto.gestioneprenotazioni.model.Edificio;
import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.model.TipoPostazione;

@Repository
public interface PostazioneDAORepository extends CrudRepository<Postazione, Long> {
	public List<Postazione> findByDescrizione(String nome);

	public List<Postazione> findByTipo(TipoPostazione tipo);

	public List<Postazione> findByEdificio(Edificio ed);


}
