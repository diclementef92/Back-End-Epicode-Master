package com.spring_intro_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_intro_configuration.configuration.ConfigurationTest;
import com.spring_intro_configuration.configuration.Test;

@SpringBootApplication
public class SpringIntroConfigurationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroConfigurationDemoApplication.class, args);
//		configWithBeans();
		configWithXml();
	}

	public static void configWithBeans() {
		AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
		Test t1 = (Test) appcontext.getBean("test");
		Test t2 = (Test) appcontext.getBean("paramTest", "parameter bean Luca");

		System.out.println(t1.saluta());
		System.out.println(t2.saluta());

		appcontext.close();
	}

	public static void configWithXml() {
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("beans.xml");
		Test t1 = (Test) appcontext.getBean("TestXml");// nome del id bean nel xml
		System.out.println(t1.saluta());
		appcontext.close();
	}

}
