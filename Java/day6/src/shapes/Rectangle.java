package shapes;

public class Rectangle extends BoundedShape {
	private double w,h;
	
	public Rectangle(int x, int y, double w, double h) {
		super(x,y);
		this.w=w;
		this.h=h;
	}
	
	@Override
	public String toString() {
		return "Rectangle-> "+super.toString()+", w="+w+", h="+h;
	}
	
	//Overriddig abstract area() method
	@Override
	public double area() {
		return w*h;
	}
}
