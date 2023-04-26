package parthpractice;
import java.util.Scanner;
public class RegisterCustomer2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Add custumer data name email age and creditcard");
		Customer emp=new Customer(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
		System.out.println(emp.GetCustomer());
		sc.close();

	}

}
