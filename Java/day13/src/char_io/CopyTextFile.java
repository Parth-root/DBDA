package char_io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyTextFile {

	public static void main(String[] args) {
		System.out.println("Enter source and destination file-names on separate lines");
		try(Scanner sc=new Scanner(System.in);
				//Java App <- BR <- FR <- src file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				//Java App -> Pw -> FR -> dest file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine()))
				)
		{
			br.lines()	//Stream of strings
			.forEach(s->pw.println(s));		//.forEach(pw::println)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
