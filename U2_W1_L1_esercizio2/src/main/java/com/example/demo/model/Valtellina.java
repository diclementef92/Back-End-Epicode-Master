package com.example.demo.model;

public class Valtellina extends Pizza {
	public Valtellina() {
		this.productName = " Valtellina con " + Topping.bresaola + " e " + Topping.rucola;
	}
	@Override
	public double getPrice() {
		return 8;
	}

}
