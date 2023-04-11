package com.example.demo.model;

// Decorator
public abstract class ToppingDecorator extends Consumation {

	protected Consumation consumation;

	@Override
	public abstract String getProductName();

}
