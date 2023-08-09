package servlet_basics.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientDto {
	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private long number;
	private String gender;
	private String checkbox;
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PatientDto [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", number="
				+ number + ", gender=" + gender + ", checkbox=" + checkbox + ", country=" + country + "]";
	}

}
