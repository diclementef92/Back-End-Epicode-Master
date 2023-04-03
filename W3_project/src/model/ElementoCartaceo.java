package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@OnDelete(action = OnDeleteAction.CASCADE)
public abstract class ElementoCartaceo {

	@Id
	private Long isbn;

	@Column(nullable = false)
	private String titolo;

	@Column(name = "anno_pubblicazione")
	private Integer annoPubblicazione;

	@Column(name = "num_pagine")
	private Integer numPagine;

	public ElementoCartaceo(Long isbn, String titolo, Integer annoPubblicazione, Integer numPagine) {
		this.isbn = isbn;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numPagine = numPagine;
	}

	public ElementoCartaceo(String titolo, Integer annoPubblicazione, Integer numPagine) {
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numPagine = numPagine;
	}
	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public Integer getNumPagine() {
		return numPagine;
	}

	public void setNumPagine(Integer numPagine) {
		this.numPagine = numPagine;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [isbn=" + isbn + ", titolo=" + titolo + ", annoPubblicazione="
				+ annoPubblicazione
				+ ", numPagine=" + numPagine;
	}

}
