package com.progetto.gestioneprenotazioni.constraints;

import java.io.Serializable;
import java.time.LocalDate;

import com.progetto.gestioneprenotazioni.model.Postazione;

public class CompositeKeyPrenotazione implements Serializable {

	/**
	 * Autogenerated
	 */
	private static final long serialVersionUID = 6576572282373564281L;

	private Postazione postazione;

	private LocalDate data;
}
