package com.example.demo.model;

public class Hawaiiana extends PizzaBase {

	public Hawaiiana() {
		this.productName = "pizza hawaiiana con " + Topping.prosciutto_cotto + " e " + Topping.ananas;
	}

	@Override
	public double getPrice() {
		return 11;
	}

}
