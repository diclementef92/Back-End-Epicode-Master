package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventi")
public class Evento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Long id;

	@Column(nullable = false)
	private String titolo;

	@Column(nullable = false)
	private LocalDate dataEvento;

	private String descrizione;

	@Enumerated(EnumType.STRING)
	private TipoEvento tipo;

	@Column(name = "max_partecipanti")
	private Integer numMassimoPartecipanti;

	public Evento() {

	}
	public Evento(Long id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo,
			Integer numMassimoPartecipanti) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numMassimoPartecipanti = numMassimoPartecipanti;
	}

	public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo,
			Integer numMassimoPartecipanti) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numMassimoPartecipanti = numMassimoPartecipanti;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumMassimoPartecipanti() {
		return numMassimoPartecipanti;
	}

	public void setNumMassimoPartecipanti(Integer numMassimoPartecipanti) {
		this.numMassimoPartecipanti = numMassimoPartecipanti;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipo=" + tipo + ", numMassimoPartecipanti=" + numMassimoPartecipanti + "]";
	}


}
