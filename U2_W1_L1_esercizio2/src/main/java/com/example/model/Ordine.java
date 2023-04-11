package com.example.model;

//component del decorator patter
public abstract class Ordine {
	String nomeProdotto = "";

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public abstract double getPrice();
}
