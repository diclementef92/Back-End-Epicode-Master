package com.example.demo.model;

// Component
public abstract class Consumation {

	String productName = "";

	public String getProductName() {
		return productName;
	}

	public abstract double getPrice();
}
