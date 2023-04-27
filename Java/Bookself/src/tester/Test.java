package tester;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.book.Book;
import utils.BookUtils;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			HashMap<String, Book> books=BookUtils.populate();
			ArrayList<Book> Cart =new ArrayList<Book>();
			boolean exit = false;
			while(!exit) {
				try {
					System.out.println("Select \n1: Print all book in Self \n2: Go to Cart \n3: Add Books to shelf \n0:Exit");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Print all Books");
						System.out.println(books.values());
						break;

					default:
						break;
					}
				
					
					
					
					
					
					
					
					
					
					
					
				}catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
