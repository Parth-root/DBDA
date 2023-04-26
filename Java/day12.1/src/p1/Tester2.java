package p1;

public class Tester2 {

	public static void main(String[] args) {
		System.out.println("Addition= "+testCompute(10, 20, new Adder()));
		System.out.println("Multiplication= "+testCompute(10, 20, new Multiplier()));
		
		//Functional programming -> Declarative style of programming
		System.out.println(testCompute(10,20, (a,b) -> a+b));
		System.out.println(testCompute(10,20, (a,b) -> a/b));
	} 
	
	private static double testCompute(double a, double b, Computable ref) {
		return ref.compute(a, b);
	}

}
