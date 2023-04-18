package com.progetto.gestioneprenotazioni.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.progetto.gestioneprenotazioni.model.Edificio;
import com.progetto.gestioneprenotazioni.repository.EdificioDAORepository;

@Service
public class EdificioService {

	// istanzia e implementa i metodi del'interfaccia EdificioDAORepository
	@Autowired
	private EdificioDAORepository repo;

	@Autowired
	@Qualifier("FakeEdificio")
	private ObjectProvider<Edificio> fakeEdificioProvider;


	public List<Edificio> findEdificioByName(String name) {
		return repo.findByNome(name);
	}

	public Edificio findEdificioById(Long id) throws NoSuchElementException {
		return repo.findById(id).get();
	}


	public Long insertEdificio(Edificio ed) {
		repo.save(ed);
		return ed.getId();
	}

	public void updateEdificio(Edificio ed) {
		repo.save(ed);
	}

	public void removeEdificio(Edificio ed) {
		repo.delete(ed);
	}

	public List<Edificio> getEdifici() {
		return (List<Edificio>) repo.findAll();
	}

	public Long createFakeEdificio() {
		return insertEdificio(fakeEdificioProvider.getObject());
	}
}