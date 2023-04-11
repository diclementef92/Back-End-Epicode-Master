package com.spring_intro_configuration.configuration.cconfig_xml;

public class TestXml {

	private String testo;

	public TestXml(String testo) {
		this.testo = testo;
	}

	public String saluta() {
		return "ciao " + this.testo;
	}
}
