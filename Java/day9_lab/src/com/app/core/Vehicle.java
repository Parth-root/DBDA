package com.app.core;
import java.time.LocalDate;

public class Vehicle {
	private String chasisno;
	private Color color;
	private double basepr;
	private LocalDate manfdate;
	private String company;
	private boolean isavb;
	
	//Constructor for creating a vehicle
	public Vehicle(String chasisno, Color color, double basepr, LocalDate manfdate, String company) {
		this.chasisno=chasisno;
		this.color=color;
		this.basepr=basepr;
		this.manfdate=manfdate;
		this.company=company;
		this.isavb=true;
	}
	
	//Constructor used for validating chasisno
	public Vehicle(String chasisno) {
		this.chasisno=chasisno;
	}
	
	//getter for chasis number
	public String getChasis() {
		return chasisno;
	}
	
	//Overridding equals method by checking equality between chasis numbers
	@Override
	public boolean equals(Object o) {
		Vehicle vh = (Vehicle)o;
		if(this.chasisno.equals(vh.chasisno))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Chasis Number: "+chasisno+"\tColor: "+color+"\tBase Price: "+basepr
				+ "\nManufacturing Date: "+manfdate+"\tComapny: "+"\tAvailable: "+isavb;
	}

}
