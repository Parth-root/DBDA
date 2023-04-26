package p1;

public class MyFormula implements Formula{
	
	@Override
	public double calculate(double a, double b) {
		System.out.println("Abstract method implementation");
		return a+b;
	}
}
