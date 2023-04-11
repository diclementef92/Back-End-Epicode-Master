package com.example.model;

//Decorator del decorator patter
public abstract class Aggiunta extends Ordine {
	protected Ordine ordine;

	@Override
	public abstract String getNomeProdotto();

	public abstract double getPrice();
}
