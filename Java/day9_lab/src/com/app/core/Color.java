package com.app.core;

public enum Color {
	WHITE(0), BLACK(0), GREY(2000), GREEN(3000), YELLOW(6000), RED(10000);
	
	private int colorcost;	//Variable for holding value associated with each enum object
	
	//Constructor to initialize cost associated with each color 
	Color(int cost){
		colorcost=cost;
	}
	
	//Setter
	public void setColorCost(int price) {
		colorcost=price;
	}
	
	//Getter
	public int getColorCost() {
		return colorcost;
	}
	
	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
