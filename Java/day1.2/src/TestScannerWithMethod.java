import java.util.Scanner;

public class TestScannerWithMethod {

	public static void main(String[] args) {
		// Accept 2 integers from user , using scanner , multiply n display the result
		// BUT using a separate method
		// Create Scanner class instance , by wrapping stdin
		// Scanner(System.in)
		Scanner sc = new Scanner(System.in);
		// prompt user for the 1st no
		System.out.println("Enter 1st integer");
		// parses the 1st token as int
		int num1 = sc.nextInt();
		// prompt user for the 2nd no
		System.out.println("Enter 2nd integer");
		// parses the 2nd token as int
		int num2 = sc.nextInt();
//		int result = num1 * num2;
//		System.out.println("Product of " + num1 + "&" + num2 + "=" + result);
		System.out.println("Product of " + num1 + "&" + num2 
				+ "=" + multiply(num1, num2));
		sc.close();

	}

	// write a method to accept 2 numbers n ret their product
	private static int multiply(int a, int b) {
		return a * b;
	}

}
