package com.progetto.gestioneprenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progetto.gestioneprenotazioni.model.Edificio;

@Repository
public interface EdificioDAORepository extends CrudRepository<Edificio, Long> {
	public List<Edificio> findByNome(String nome);

	public List<Edificio> findByCitta(String citta);

	public List<Edificio> findByIndirizzo(String indirizzo);


}
