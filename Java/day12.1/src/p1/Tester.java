package p1;

public class Tester {

	public static void main(String[] args) {
		//Add two numbers
		Adder a = new Adder();
		System.out.println("Addition= "+a.compute(10, 20));
		//Multiply two numbers
		Multiplier m = new Multiplier();
		System.out.println("Multiplication= "+m.compute(11, 12));
	}

}
