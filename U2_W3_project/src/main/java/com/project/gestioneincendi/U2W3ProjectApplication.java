package com.project.gestioneincendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.gestioneincendi.model.Coordinata;
import com.project.gestioneincendi.observable.Sonda;
import com.project.gestioneincendi.observer.CentroControllo;

@SpringBootApplication
public class U2W3ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(U2W3ProjectApplication.class, args);
		System.out.println("Run...");

		CentroControllo centro = new CentroControllo();

		Sonda s1 = new Sonda(1L, new Coordinata(100d, 200d), centro);
		Sonda s2 = new Sonda(2L, new Coordinata(90d, 10d), centro);
		Sonda s3 = new Sonda(3L, new Coordinata(40d, 50d), centro);


		centro.addSonda(s1);
		centro.addSonda(s2);
		centro.addSonda(s3);


		System.out.println(centro.toString());

		s1.setSmokeLevel(3);
		s2.setSmokeLevel(4);
		s3.setSmokeLevel(6);

		System.out.println(centro.toString());
	}

}
