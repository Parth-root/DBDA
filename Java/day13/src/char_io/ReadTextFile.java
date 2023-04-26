package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class ReadTextFile {

	public static void main(String[] args) {
		//Read data from text file using buffer till EOF and print the same
		System.out.print("Enter file name: ");
		
		try(Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))
			)
		{
			//Imperative style
			String line = null;
			while((line=br.readLine())!=null)
				System.out.println(line);
			System.out.println("File over");
			
		}					//JVM invokes autoclose: first br.close(), then sc.close()  
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
