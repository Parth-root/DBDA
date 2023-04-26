import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		x=sc.nextInt();
		System.out.print("Enter the second number: ");
		y=sc.nextInt();
		swap(x,y);
		sc.close();
	}
	
	public static void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The varibles after swapping are: "+ a +" and "+ b);
	}

}
