package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double price;
	private LocalDate expiryDate;
	public Product() {
		
	}
	public Product(int id, String name, double price, LocalDate expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "\nProduct [id=" + id + ",\n name=" + name + ",\n price=" + price + ",\n expiryDate=" + expiryDate + "]\n";
	}
	

}
