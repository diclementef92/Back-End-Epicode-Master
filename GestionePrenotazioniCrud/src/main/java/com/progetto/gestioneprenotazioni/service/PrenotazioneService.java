package com.progetto.gestioneprenotazioni.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progetto.gestioneprenotazioni.model.Postazione;
import com.progetto.gestioneprenotazioni.model.Prenotazione;
import com.progetto.gestioneprenotazioni.model.Utente;
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

	// inserisce prenotazione solo se la postazione non è occupata in quella data e
	// se l'utente non ha già altre prenotazioni in quella data
	public Prenotazione insertPrenotazione(Prenotazione p) throws Exception {
		// TODO: inserire solo se la data della prenotazione è al massimo 3 giorni prima
		if (!isOccupied(p.getPostazione(), p.getData())) {
			if (repo.findByUtenteAndData(p.getUtente(), p.getData()).isEmpty())
				return repo.save(p);
			else
				throw new Exception("l'utente ha già una prenotazione per questa data");
		} else
			throw new Exception("postazione già occupata per questa data");

	}

	public Prenotazione updatePrenotazione(Prenotazione p) throws Exception {
		if (!isOccupied(p.getPostazione(), p.getData())) {
			if (repo.findByUtenteAndData(p.getUtente(), p.getData()).isEmpty())
				return repo.save(p);
			else
				throw new Exception("l'utente ha già una prenotazione per questa data");
		} else
			throw new Exception("postazione già occupata per questa data");

	}

	public void removePrenotazione(Prenotazione p) {
		repo.delete(p);
	}

	public List<Prenotazione> getPrenotazioni() {
		return (List<Prenotazione>) repo.findAll();
	}

	public List<Prenotazione> getPrenotazioniByUtente(Utente u) {
		return (List<Prenotazione>) repo.findByUtente(u);
	}


}