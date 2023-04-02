package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "prestiti")
@NoArgsConstructor
public class Prestito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utente")
	private Utente utente;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "isbn")
	private ElementoCartaceo elemPrestato;

	private LocalDate dataInizio;
	private LocalDate dataRestituzionePrevista;
	private LocalDate dataRestituzioneEffettiva;

	public Prestito(Utente utente, ElementoCartaceo elemPrestato, LocalDate dataInizio) {
		super();
		this.utente = utente;
		this.elemPrestato = elemPrestato;
		this.setDataInizio(dataInizio);

		// data restituzione prevista = data inizio + 30gg
		this.setDataRestituzionePrevista(dataInizio.plusDays(30));
	}

	public Prestito(Long id, Utente utente, ElementoCartaceo elemPrestato) {
		super();
		this.id = id;
		this.utente = utente;
		this.elemPrestato = elemPrestato;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}


}
