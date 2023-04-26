import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		// Accept range from user , using scanner , display the numbers within the range
		// Create Scanner class instance , by wrapping stdin
		// Scanner(System.in)
		Scanner sc = new Scanner(System.in);
		// prompt user for the range
		System.out.println("Enter begin n end of the range");
		// parses the 1st token as int
		int start = sc.nextInt();
		// parses the 2nd token as int
		int end = sc.nextInt();
		System.out.println("Numbers from " + start + "--" + end);
		for (int i = start; i <= end; i++)
			System.out.print(i + " ");
		sc.close();

	}

}
