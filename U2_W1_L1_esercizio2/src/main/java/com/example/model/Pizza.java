package com.example.model;

public class Pizza extends Ordine {

	String ingredienti;

	public Pizza() {
		nomeProdotto = "pizza con " + ingredienti;
	}
	@Override
	public double getPrice() {
		return 5;
	}

}
