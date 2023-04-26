package xtra;
import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string: ");
			String str=sc.next();
			char[] rev=new char[str.length()];
			
			for(int i=str.length()-1, j=0 ; i>=0; i--, j++) {
				rev[j] = str.charAt(i);
			}
			
			System.out.print("Reverse of the string is: ");
			for(int k=0;k<str.length();k++) 
				System.out.print(rev[k]);
			sc.close();
	}

}
