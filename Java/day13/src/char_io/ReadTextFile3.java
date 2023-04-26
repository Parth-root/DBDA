package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class ReadTextFile3 {

	public static void main(String[] args) {
		//Read data from text file and print the lines which have greater than 80 characters in upper case
		System.out.print("Enter file name: ");
		
		try(Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))
			)
		{
			//Declarative style
			System.out.println("File contents: ");
			br.lines()
			.filter(line->line.length()>80)
			.map(line->line.toUpperCase())
			.forEach(System.out::println);
			
		}					//JVM invokes autoclose: first br.close(), then sc.close()  
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
