package com.project.gestioneincendi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.project.gestioneincendi.model.Coordinata;
import com.project.gestioneincendi.observable.Sonda;
import com.project.gestioneincendi.observer.CentroControllo;

@Configuration
public class SondaConfiguration {
	static Long n = 0l;

	@Bean
	@Scope("prototype")
	public Sonda newSonda(Long id, Coordinata coordinata, CentroControllo centroControllo) {
		return new Sonda(id, coordinata, centroControllo);
	}

	@Bean
	@Scope("prototype")
	public Sonda randomSonda() {
		return new Sonda(n, randomCoordinata(), new CentroControllo());
	}

	@Bean
	@Scope("prototype")
	public Coordinata randomCoordinata() {
		return new Coordinata(Math.floor(Math.random() * 90), Math.floor(Math.random() * 90));
	}
	

}
