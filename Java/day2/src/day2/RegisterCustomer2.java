package day2;
import java.util.Scanner;

public class RegisterCustomer2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			System.out.println("Provide customer details");
			Customer c2;
			c2 = new Customer(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
			System.out.println(c2.custDetails());
			sc.close();
	}

}
