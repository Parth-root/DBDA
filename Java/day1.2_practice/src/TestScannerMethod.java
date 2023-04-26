import java.util.Scanner;
public class TestScannerMethod {
//Multiplying two numbers using a method
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creating Scanner class instance by wrapping stdin
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
		sc.close();
		System.out.print("Product= "+multiply(num1,num2));
	}
	
	private static int multiply(int num1,int num2) {
		return num1*num2;
	}
}
