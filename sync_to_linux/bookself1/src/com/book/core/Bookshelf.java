package com.book.core;

import java.time.LocalDate;

public class Bookshelf {
private String title;
private String author;
private float price;
private LocalDate publishDate;
public Bookshelf(String title, String author, float price, LocalDate publishDate) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
	this.publishDate = publishDate;
}
public Bookshelf(String title) {
	super();
	this.title = title;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public LocalDate getPublishDate() {
	return publishDate;
}
public void setPublishDate(LocalDate publishDate) {
	this.publishDate = publishDate;
}


@Override
public String toString() {
	return "Bookshelf [title=" + title + ", author=" + author + ", price=" + price + ", publishDate=" + publishDate
			+ "]";
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Bookshelf){
		Bookshelf b1=(Bookshelf)obj;
		return this.title.equals(b1.title);
	}
	return false;
	
}
















}

