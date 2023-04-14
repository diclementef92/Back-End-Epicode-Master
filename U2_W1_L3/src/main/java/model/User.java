package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	private Long id;
	private String name;
	private String lastname;
	private String email;
	private int age;
	private String city;
	private String password;

	public User(String name, String lastname, String email, int age, String city, String password) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.city = city;
		this.password = password;
	}

}
