package com.progetto.gestioneprenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progetto.gestioneprenotazioni.model.Utente;

@Repository
public interface UtenteDAORepository extends CrudRepository<Utente, String> {
	public List<Utente> findByUserName(String username);

	public List<Utente> findByNomeCompleto(String nome);

	public List<Utente> findByEmail(String email);

}
