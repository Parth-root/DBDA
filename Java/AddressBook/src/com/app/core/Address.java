package com.app.core;

import java.time.LocalDate;
import java.util.Objects;
// 
public class Address implements Comparable<Address> {
	// You can create class Address with attributes like Email, Name, Date of Birth,
	// Phone Number,
	// street, city etc. Email should be unique for each address.
	// You can use suitable data structure to store data in memory.
	private String email;
	private String name;
	private LocalDate birthDate;
	private long phoneNumber;
	private String street;
	private String city;
	
	public Address() {
		super();
	}

	public Address(String email) {
		super();
		this.email = email;
	}

	public Address(LocalDate birthDate) {
		super();
		this.birthDate = birthDate;
	}

	public Address(String email, String name, LocalDate birthDate, long phoneNumber, String street, String city) {
		super();
		this.email = email;
		this.name = name;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Address) {
			Address other=(Address)obj;
			return Objects.equals(birthDate, other.birthDate)||Objects.equals(email, other.email);
		}
		return false;
	}
	
	

	@Override
	public String toString() {
		return "Address [email=" + email + ",\n name=" + name + ",\n birthDate=" + birthDate + ",\n phoneNumber="
				+ phoneNumber + ",\n street=" + street + ",\n city=" + city + "]\n";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Address o) {
		return this.name.compareTo(o.name);		
	}
	
	
	
	
	
	
	

}
