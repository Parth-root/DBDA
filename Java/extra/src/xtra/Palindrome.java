package xtra;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.print("Enter a string: ");
		String str=sc.next();
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)==str.charAt((str.length()-1)-i)) 
				flag=true;
			else
				flag=false;
		}	
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		sc.close();
	}

}
