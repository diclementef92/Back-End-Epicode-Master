package com.progetto.gestioneprenotazioni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "edifici")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String indirizzo;
	private String citta;

	public Edificio(String nome, String indirizzo, String citta) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
}
