package com.progetto.gestioneprenotazioni.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazioni")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descrizione;

	@Enumerated(value = EnumType.STRING)
	private TipoPostazione tipo;

	@Column(name = "num_posti")
	private Integer numPosti;


	@ManyToOne
	private Edificio edificio;

	@OneToMany
	private List<Prenotazione> prenotazioni;

	public Postazione(String descrizione, TipoPostazione tipo, Integer numPosti, Edificio edificio) {
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numPosti = numPosti;
		this.edificio = edificio;
	}

}
