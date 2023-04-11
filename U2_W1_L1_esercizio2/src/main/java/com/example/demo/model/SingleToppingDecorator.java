package com.example.demo.model;

// ConcreteDecorator
public class SingleToppingDecorator extends ToppingDecorator {

	Topping topping;

	public SingleToppingDecorator(Consumation c,Topping t) {
		this.consumation = c;
		this.topping = t;
	}

	@Override
	public String getProductName() {

		return consumation.getProductName() + " " + topping;
	}

	@Override
	public double getPrice() {
		return consumation.getPrice() + 1;
	}

}
