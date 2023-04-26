import java.util.Scanner;
//Accept various kinds of inputs for saving employee details
public class AcceptEmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details");
		System.out.printf("\n Employee ID: %d\n First name: %s\n Last name: %s\n Salary %.3f\n Is permenenat? %b\n Department: %s",
				sc.nextInt(),sc.next(),sc.next(),sc.nextFloat(),sc.nextBoolean(),sc.next());
		sc.close();
	}

}
