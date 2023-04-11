package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Consumation;
import com.example.demo.model.Hawaiiana;
import com.example.demo.model.Pizza;
import com.example.demo.model.SingleToppingDecorator;
import com.example.demo.model.Topping;
import com.example.demo.model.Valtellina;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("-Godfather's Pizza-");
		Consumation pizza1 = new Pizza();

		System.out.println(
				"prodotto: " + pizza1.getProductName() + ", prezzo " + String.format("%.2f", pizza1.getPrice()));

		Consumation pizza2 = new SingleToppingDecorator(pizza1, Topping.funghi);
		System.out.println(
				"prodotto: " + pizza2.getProductName() + ", prezzo " + String.format("%.2f", pizza2.getPrice()));

		Consumation pizza3 = new SingleToppingDecorator(new SingleToppingDecorator(pizza1, Topping.funghi),
				Topping.verdure_grigliate);
		System.out.println(
				"prodotto: " + pizza3.getProductName() + ", prezzo " + String.format("%.2f", pizza3.getPrice()));

		Consumation hawaiana = new Hawaiiana();
		System.out.println(
				"prodotto: " + hawaiana.getProductName() + ", prezzo " + String.format("%.2f", hawaiana.getPrice()));

		Consumation valtellina = new Valtellina();
		System.out.println(
				"prodotto: " + valtellina.getProductName() + ", prezzo "
						+ String.format("%.2f", valtellina.getPrice()));

	}

}
