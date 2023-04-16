package com.progetto.gestioneprenotazioni.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.model.Prenotazione;
import com.progetto.gestioneprenotazioni.repository.PrenotazioneDAORepository;

@Service
public class PrenotazioneService {

	// istanzia e implementa i metodi del'interfaccia PrenotazioneDAORepository
	@Autowired
	private PrenotazioneDAORepository repo;

	public boolean isOccupied(Postazione p, LocalDate date) {
		if (repo.findByPostazioneAndData(p, date).isEmpty())
			return false;
		return true;
	}

	public void insertPrenotazione(Prenotazione p) throws Exception{
		if (!isOccupied(p.getPostazione(), p.getData()))
			repo.save(p);
		else{
			throw new Exception("postazione già occupata per questa data");
		}
	}

	public void updatePrenotazione(Prenotazione p) throws Exception {
		if (!isOccupied(p.getPostazione(), p.getData()))
			repo.save(p);
		else {
			throw new Exception("postazione già occupata per questa data");
		}
	}

	public void removePrenotazione(Prenotazione p) {
		repo.delete(p);
	}

	public List<Prenotazione> getPostazioni() {
		return (List<Prenotazione>) repo.findAll();
	}


}