package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class ReadTextFile2 {

	public static void main(String[] args) {
		//Read data from text file using buffer till EOF and print the same
		System.out.print("Enter file name: ");
		
		try(Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))
			)
		{
			//Declarative style
			System.out.println("File contents: ");
			br.lines()
			.forEach(System.out::println);
			System.out.println("File over");
			
		}					//JVM invokes autoclose: first br.close(), then sc.close()  
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
