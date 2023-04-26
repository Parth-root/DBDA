import java.util.*;
public class calculator_assg6 {
//Calculator that continues working till the user explicitly inputs "quit"
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char ch;
		do {
			System.out.print("Enter the two number: ");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.print("Enter the operation to be performed: ");
			char op=sc.next().charAt(0);
			
			switch(op) {
				case '+':
					System.out.println("Sum= "+(a+b));
					break;
				case '-':
					System.out.println("Difference= "+(a-b));
					break;
				case '*':
					System.out.println("Product= "+(a*b));
					break;
				case '/':
					System.out.println("Result= "+(a/b));
					break;
				default:
					System.out.println("Wrong input! Program terminated");
					System.exit(0);
			}
			
			System.out.print("Do you want to continue?(Y/N) ");
			ch=sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		sc.close();
	}

}
