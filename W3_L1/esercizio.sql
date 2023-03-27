DROP TABLE clienti;
DROP TABLE fatture;

CREATE TABLE IF NOT EXISTS clienti (
	numero_cliente SERIAL UNIQUE PRIMARY KEY,
	nome varchar(20) NOT NULL,
	cognome varchar(20)  NOT NULL,
	data_nascita date  NOT NULL,
	regione_residenza varchar(20) NOT NULL
);

insert into clienti (nome,cognome,data_nascita,regione_residenza)
values ('MARCO','ROSSI','1990/10/20','MARCHE'),
	('ANDREA','DEL PIERO','1985/09/15','ABBRUZZO');



CREATE TABLE IF NOT EXISTS fornitori (
	numero_fornitore SERIAL UNIQUE PRIMARY KEY,
	denominazione varchar(20),
	regione_residenza varchar(20)
);


CREATE TABLE IF NOT EXISTS fatture (
	numero_fattura SERIAL UNIQUE PRIMARY KEY,
	tipologia varchar(20),
	importo double precision,
	iva character varying(3) DEFAULT '20%',
	data_nascita DATE,
	regione_residenza varchar(20),
	id_cliente int8 NOT NULL,
	id_fornitore int8 NOT NULL,
	CONSTRAINT fatture_cliente_fk FOREIGN KEY (id_cliente) REFERENCES clienti (numero_cliente),
	CONSTRAINT fatture_fornitori_fk FOREIGN KEY (id_fornitore) REFERENCES fornitori (numero_fornitore)
 );

CREATE TABLE IF NOT EXISTS prodotti(
	id_prodotto SERIAL UNIQUE PRIMARY KEY,
	descrizione varchar(20),
	in_produzione BOOLEAN NOT NULL,
	in_commercio BOOLEAN NOT NULL,
	data_attivazione DATE  NOT NULL,
	data_disattivazione DATE  NOT NULL,
);





