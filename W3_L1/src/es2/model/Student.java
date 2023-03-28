package es2.model;

import java.time.LocalDate;

public class Student {
	private Long id;
	private String name;
	private String lastname;
	private char gender;
	private LocalDate birthdate;
	private Float avg;
	private Float min_vote;
	private Float max_vote;

	public Student(Long id, String name, String lastname, char gender, LocalDate birthdate, Float avg, Float min_vote,
			Float max_vote) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	public Student(String name, String lastname, char gender, LocalDate birthdate, Float avg, Float min_vote,
			Float max_vote) {
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Float getAvg() {
		return avg;
	}

	public void setAvg(Float avg) {
		this.avg = avg;
	}

	public Float getMin_vote() {
		return min_vote;
	}

	public void setMin_vote(Float min_vote) {
		this.min_vote = min_vote;
	}

	public Float getMax_vote() {
		return max_vote;
	}

	public void setMax_vote(Float max_vote) {
		this.max_vote = max_vote;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", birthdate="
				+ birthdate + ", avg=" + avg + ", min_vote=" + min_vote + ", max_vote=" + max_vote + "]";
	}


}
