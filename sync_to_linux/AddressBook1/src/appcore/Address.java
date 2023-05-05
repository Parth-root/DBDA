package appcore;

import java.time.LocalDate;
import java.util.Objects;

public class Address implements Comparable<Address> {
private String email;
private String name;
private LocalDate bday;
private long no;
private String city;
public Address(String email, String name, LocalDate bday, long no, String city) {
	super();
	this.email = email;
	this.name = name;
	this.bday = bday;
	this.no = no;
	this.city = city;
}

public Address(LocalDate bday) {
	super();
	this.bday = bday;
}

public Address(String email) {
	super();
	this.email = email;
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
public LocalDate getBday() {
	return bday;
}
public void setBday(LocalDate bday) {
	this.bday = bday;
}
public long getNo() {
	return no;
}
public void setNo(long no) {
	this.no = no;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [email=" + email + ", name=" + name + ", bday=" + bday + ", no=" + no + ", city=" + city + "]";
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Address) {
		Address other=(Address)obj;
		return Objects.equals(this.bday,other.bday)||Objects.equals(this.email,other.email);
	}
	return false;
}
@Override
public int compareTo(Address o) {
	
	return this.name.compareTo(o.name);
}




	
	
	
}
