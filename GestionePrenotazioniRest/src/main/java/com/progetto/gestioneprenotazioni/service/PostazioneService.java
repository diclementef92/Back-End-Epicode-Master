package com.progetto.gestioneprenotazioni.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.progetto.gestioneprenotazioni.model.Edificio;
import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.repository.PostazioneDAORepository;

@Service
public class PostazioneService {

	// istanzia e implementa i metodi del'interfaccia PostazioneDAORepository
	@Autowired
	private PostazioneDAORepository repo;

	@Autowired
	@Qualifier("addPostazioneRandom")
	private ObjectProvider<Postazione> addPostazioneRandom;


	public List<Postazione> findPostazioneByEdificio(Edificio ed) {
		return repo.findByEdificio(ed);
	}

	public Postazione findPostazioneById(Long id) throws NoSuchElementException {
		return repo.findById(id).get();
	}


	public void insertPostazione(Postazione ed) {
		repo.save(ed);
	}

	public void updatePostazione(Postazione ed) {
		repo.save(ed);
	}

	public void removePostazione(Postazione ed) {
		repo.delete(ed);
	}

	public List<Postazione> getPostazioni() {
		return (List<Postazione>) repo.findAll();
	}

	public void createPostazioneRandom(Edificio ed) {
//		insertPostazione(addPostazioneRandom);
	}
}