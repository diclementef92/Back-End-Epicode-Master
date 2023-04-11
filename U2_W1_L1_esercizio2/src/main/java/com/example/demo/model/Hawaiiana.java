package com.example.demo.model;

public class Hawaiiana extends Pizza {

	public Hawaiiana() {
		this.productName = " hawaiiana con " + Topping.prosciutto_cotto + " e " + Topping.ananas;
	}
	@Override
	public double getPrice() {
		return 11;
	}

}
