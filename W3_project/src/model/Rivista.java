package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "riviste")
@NoArgsConstructor

public class Rivista extends ElementoCartaceo {

	@Enumerated(EnumType.STRING)
	private Periodo periodo;

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Rivista(Long ISBN, String titolo, Integer annoPubblicazione, Integer numPagine, Periodo p) {
		super(ISBN, titolo, annoPubblicazione, numPagine);
		this.periodo = p;
	}

	public Rivista(String titolo, Integer annoPubblicazione, Integer numPagine, Periodo p) {
		super(titolo, annoPubblicazione, numPagine);
		this.periodo = p;
	}

	public String toString() {
		return super.toString() + ", periodo=" + periodo + "]";
	}
}
