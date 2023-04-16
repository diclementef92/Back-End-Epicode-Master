package com.progetto.gestioneprenotazioni.model;

import java.time.LocalDate;

import com.progetto.gestioneprenotazioni.constraints.CompositeKeyPrenotazione;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prenotazioni")
@IdClass(CompositeKeyPrenotazione.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {

	@Id
	private LocalDate data;

	@Id
	@ManyToOne
	private Utente utente;

	@ManyToOne
	private Postazione postazione;


}
