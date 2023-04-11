package com.example.demo.model;

// ConcreteComponent
public class Pizza extends Consumation {

	public Pizza() {
		productName = "pizza con pomodoro mozzarella";
	}

	@Override
	public double getPrice() {
		return 5;
	}

}
