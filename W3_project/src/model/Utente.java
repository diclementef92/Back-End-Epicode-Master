package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente")
	private Long id;

	private String nome;

	private String cognome;

	@Column(name = "data_nascita")
	private LocalDate dataNascita;

	@Column(name = "num_tessera", unique = true)
	private Integer numTessera;

//	@OneToOne
//	private Prestito prestito;

	public Utente(String nome, String cognome, LocalDate dataNascita, Integer numTessera) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numTessera = numTessera;
	}

	public Utente(Long id, String nome, String cognome, LocalDate dataNascita, Integer numTessera) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numTessera = numTessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Integer getNumTessera() {
		return numTessera;
	}

	public void setNumTessera(Integer numTessera) {
		this.numTessera = numTessera;
	}

	public Long getId() {
		return id;
	}


}
