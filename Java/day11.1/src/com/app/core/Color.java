package com.app.core;

public enum Color {
	WHITE(1000), BLACK(2000), SILVER(5000), BLUE(7000), RED(15000);
	//additional data member : colorCost
	private int colorCost;
	//enum ctors are implicitly : PRIVATE
	 Color(int colorCost)
	{
		//super(name,ordinal);
		this.colorCost=colorCost;
	}
	public int getColorCost() {
		return colorCost;
	}

	public void setColorCost(int colorCost) {
		this.colorCost = colorCost;
	}
	
	//This is just to show that you can override toString in the enum
	@Override
	public String toString() {
		return name().toLowerCase()+" Price "+colorCost;
	}

	
}
