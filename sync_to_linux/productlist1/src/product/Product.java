package product;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable {
private static final long serialVersionUID = 1L;
private int id;
private String namr;
private float price;
private LocalDate expdate;
public Product(int id, String namr, float price, LocalDate expdate) {
	super();
	this.id = id;
	this.namr = namr;
	this.price = price;
	this.expdate = expdate;
}

public Product(float price) {
	super();
	this.price = price;
}

public Product(String namr) {
	
	this.namr = namr;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNamr() {
	return namr;
}
public void setNamr(String namr) {
	this.namr = namr;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public LocalDate getExpdate() {
	return expdate;
}
public void setExpdate(LocalDate expdate) {
	this.expdate = expdate;
}
@Override
public String toString() {
	return "Product [id=" + id + ", namr=" + namr + ", price=" + price + ", expdate=" + expdate + "]";
}


	

}
