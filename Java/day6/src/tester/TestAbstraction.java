package tester;
import shapes.*;

public class TestAbstraction {

	public static void main(String[] args) {
		BoundedShape[] shapes = {new Circle(10, 20, 10.5), new Rectangle(40, 80, 10, 12.5)};
		
		for(BoundedShape s : shapes) {
			System.out.println(s);
			System.out.println("Area="+s.area());
		}
	}

}
