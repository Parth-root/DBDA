import java.util.Scanner;
public class TestScanner {
//Multiplying two numbers from user input
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creating Scanner class instance by wrapping stdin
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
		sc.close();
		System.out.print("Product= "+(num1*num2));
	}

}
