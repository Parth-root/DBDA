package shapes;
import static java.lang.Math.*;

public class Circle extends BoundedShape {
	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "Circle-> "+super.toString()+", radius="+radius;
	}

	//Overriddig abstract area() method 
	@Override
	public double area() {
		return PI*pow(radius,2);
	}
		
}