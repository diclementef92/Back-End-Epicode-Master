package com.example.demo.model;

public class Valtellina extends PizzaBase {
	public Valtellina() {
		this.productName = "pizza Valtellina con " + Topping.bresaola + " e " + Topping.rucola;
	}
	@Override
	public double getPrice() {
		return 8;
	}

}
