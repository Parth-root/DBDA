package com.app.core;
/*
 * Objective : Accept vehicle details : chasisNo(string) : Unique ID, 
 * color(enum) , basePrice(double) , manufactureDate(LocalDate),company,isAvailable

 */

import java.time.LocalDate;

public class Vehicle {
	private String chasisNo;
	private Color vehicleColor;
	private double basePrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;
	public Vehicle(String chasisNo, Color vehicleColor, double basePrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable=true;
	}
	//add overloaded ctor : chasis no
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", basePrice=" + basePrice
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	//to replace ref equality inherited from Object class , by chasis no equality 
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in vehicle equals");
		if(o instanceof Vehicle) {
			Vehicle anotherVehicle=((Vehicle)o);
			return this.chasisNo.equals(anotherVehicle.chasisNo);
		}
		return false;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public Color getVehicleColor() {
		return vehicleColor;
	}
	public String getChasisNo() {
		return chasisNo;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public String getCompany() {
		return company;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	

}
