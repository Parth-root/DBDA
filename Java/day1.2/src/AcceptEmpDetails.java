import java.util.Scanner;

public class AcceptEmpDetails {

	public static void main(String[] args) {
		// Accept emp id(int) , firstName(string) last name(string) ,salary(double) ,
		// permanentStatus(boolean) , deptName(string) n print them using printf

		// Create Scanner class instance , by wrapping stdin
		// Scanner(System.in)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id , fname , lname salary permanent dept name");
		System.out.printf("Emp Id %d Full Name %s %s Salary %.3f "
				+ "Is Permanent %b Dept %s %n", sc.nextInt(), sc.next(),
				sc.next(), sc.nextDouble(), sc.nextBoolean(),sc.next());
		sc.close();

	}

}
