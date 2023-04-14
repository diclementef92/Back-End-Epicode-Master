package model;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

@Configuration
@PropertySource("classpath:application.properties")
public class UserConfiguration {

	@Value("${user.admin.name}")
	private String adminName;
	@Value("${user.admin.lastname}")
	private String adminLastname;
	@Value("${user.admin.email}")
	private String adminEmail;
	@Value("${user.admin.age}")
	private int adminAge;
	@Value("${user.admin.city}")
	private String adminCity;
	@Value("${user.admin.password}")
	private String adminPassword;

	@Bean
	@Scope("singleton")
	public User adminUser() {
		return new User(adminName, adminLastname, adminEmail, adminAge, adminCity, adminPassword);
	}

	@Bean
	@Scope("prototype")
	public User customUser() {
		return new User();
	}

	@Bean
	@Scope("prototype")
	public User paramsUser(String name, String lastname, String email, Integer age, String city, String password) {
		return new User(name, lastname, email, age, city, password);
	}

	@Bean
	@Scope("prototype")
	public User newFakeUser() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		User u = new User();

		u.setName(fake.name().lastName());
		u.setLastname(fake.name().lastName());
		u.setAge(fake.number().numberBetween(16, 80));
		u.setEmail(u.getName() + "." + u.getLastname() + "@example.com");
		u.setCity(fake.address().cityName());
		u.setPassword(fake.internet().password(6, 10, true, true));
		return u;
	}


}
