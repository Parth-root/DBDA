import java.util.Scanner;

public class Prime_assg7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start and end of the range: ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("The prime numbers are:");
		for(int i=start;i<=end;i++) {
			if(prime(i))
				System.out.println(i);
		}
		sc.close();
	}
	
	public static boolean prime(int p) {
		int count=0;
		for(int n=1;n<p/2;n++){
			if(p%n==0)
				count++;
		if(count>2)
			return false;
		}
		return true;
	}

}
