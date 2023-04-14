package com.progetto.gestioneprenotazioni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utenti")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente {

	@Id
	private String userName;
	@Column(name = "nome_completo")
	private String nomeCompleto;
	private String email;

//	public Utente(String userName, String nomeCompleto, String email) {
//		this.userName = userName;
//		this.nomeCompleto = nomeCompleto;
//		this.email = email;
//	}

}
