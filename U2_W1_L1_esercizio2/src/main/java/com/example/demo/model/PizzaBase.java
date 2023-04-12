package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

// ConcreteComponent
public class PizzaBase extends Consumation {

	List<String> ingredients = new ArrayList<>();

	public PizzaBase() {
		ingredients.add("pomodoro");
		ingredients.add("mozzarella");

		productName = "pizza margherita";

	}

	@Override
	public double getPrice() {
		return 5;
	}

}
