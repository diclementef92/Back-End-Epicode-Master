package com.spring_intro_configuration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationTest {

	@Bean
	@Scope(value = "singleton") // default
	public Test test() {
		return new Test("nuovo bean");
	}

	@Bean
	@Scope(value = "prototype")
	public Test paramTest(String nome) {
		return new Test("nuovo bean chiamato " + nome);
	}


}
