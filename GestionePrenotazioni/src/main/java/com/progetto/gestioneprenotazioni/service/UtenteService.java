package com.progetto.gestioneprenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.progetto.gestioneprenotazioni.model.Utente;
import com.progetto.gestioneprenotazioni.repository.UtenteDAORepository;

@Service
public class UtenteService {

	// istanzia e implementa i metodi del'interfaccia UtenteDAORepository
	@Autowired
	private UtenteDAORepository repo;

	@Autowired
	@Qualifier("FakeUser")
	private ObjectProvider<Utente> fakeUserProvider;


	// trova utente dato uno username
	public Utente findUtenteByUsername(String username) {
		return repo.findById(username).get();
	}

	public void insertUtente(Utente u) {
		repo.save(u);
	}

	public void updateUtente(Utente u) {
		repo.save(u);
	}

	public List<Utente> getUtenti() {
		return (List<Utente>) repo.findAll();
	}

	public void removeUtente(Utente u) {
		repo.delete(u);
	}

	public void createFakeUtente() {
		insertUtente(fakeUserProvider.getObject());
	}
}
