package com.spring_intro_configuration.configuration;

public class Test {

	String testo;

	public Test(String testo) {
		this.testo = testo;
	}

	public String saluta() {
		return "ciao " + this.testo;
	}
}
