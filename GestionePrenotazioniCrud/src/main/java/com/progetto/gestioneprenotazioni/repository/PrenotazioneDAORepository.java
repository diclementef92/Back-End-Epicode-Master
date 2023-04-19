package com.progetto.gestioneprenotazioni.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.model.Prenotazione;
import com.progetto.gestioneprenotazioni.model.Utente;

@Repository
public interface PrenotazioneDAORepository extends CrudRepository<Prenotazione, Long> {
	public List<Prenotazione> findByUtente(Utente utente);

	public List<Prenotazione> findByPostazione(Postazione postazione);

	public List<Prenotazione> findByData(LocalDate data);

	public List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);

}
