import java.util.Scanner;
//Taking two numbers as input and printing the range of numbers in between them

public class forloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the beginning and end: ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
			System.out.print(i+" ");
		sc.close();
	}

}
