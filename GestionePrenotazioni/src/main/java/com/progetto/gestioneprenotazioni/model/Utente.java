package com.progetto.gestioneprenotazioni.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utenti")
@Data
@NoArgsConstructor
public class Utente {

	@Id
	private String userName;
	@Column(name = "nome_completo")
	private String nomeCompleto;
	private String email;

	@OneToMany
	private List<Prenotazione> prenotazioni;

	public Utente(String userName, String nomeCompleto, String email) {
		super();
		this.userName = userName;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}

}
