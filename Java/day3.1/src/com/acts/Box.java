package com.acts;


public class Box {
//Properties(non static data->instance variables)
	private double width;
	private double depth;
	private double height;
	//add a parameterized construction to initialize COMPLETE state of the box
	public Box(double w,double d,double height){
		width=w;
		depth=d;
		this.height=height;
	}
	//Behavior :functionality (method)
	//AQdd a method :to return Box detail in string form (dimension)
	public String getBoxDims() {
		return "The dimensions of the box are: "+this.width+" "+this.depth+" "+this.height;
		//NOTE : the keyword here is optional
	}
	//Add method to return computed volume of BOX.
	public double getComputedVolume() {
		return width*depth*this.height;
	}
}
