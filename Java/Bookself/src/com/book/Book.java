package com.book;

import java.time.LocalDate;

public class Book {
private String title;
private String autherName;
private double price;
private LocalDate pubDate;
public Book(String title, String autherName, double price, LocalDate pubDate) {
	super();
	this.title = title;
	this.autherName = autherName;
	this.price = price;
	this.pubDate = pubDate;
}
@Override
public boolean equals(Object obj) {
	if (obj instanceof Book) {
		Book other=(Book) obj;
		return this.title.equals(other.title);
	}
	
	return false;
}
@Override
public String toString() {
	return "Book [title=" + title + ", autherName=" + autherName + ", price=" + price + ", pubDate=" + pubDate + "]\n";
}

public Book(String title) {
	super();
	this.title=title;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAutherName() {
	return autherName;
}
public void setAutherName(String autherName) {
	this.autherName = autherName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public LocalDate getPubDate() {
	return pubDate;
}
public void setPubDate(LocalDate pubDate) {
	this.pubDate = pubDate;
}









}
