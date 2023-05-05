package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.book.core.Bookshelf;
import exception.Validate;
import java.time.LocalDate;
import utils.BookUtils;
public class Test {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		HashMap<String,Bookshelf>testbook=BookUtils.populate();
		ArrayList<Bookshelf> cart=new ArrayList<Bookshelf>();
		boolean enter=true;
		do
		{System.out.println("Welcome to book shelf\n"
				+ "Enter Value to"
				+ "\n1.Display all book"
				+ "\n2.Add book to cart(With cart)"
				+ "\n3.Add your books"
				+ "\n4.remove books"
				+ "\n5.Exit");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Printing all book sir as you requested \n");
			System.out.println(testbook.values());			
			break;
		case 2:
			boolean gotobook=true;
			do {System.out.println("1.Add book to cart \n2.book in cart \n3.remove book from cart \n4.total value in cart\n5.EXIT");
			switch (sc.nextInt()) {
			case 1:
				
				System.out.println(testbook.values());
				System.out.println("\nEnter tital of book");
				String temp=sc.next();
				String tital=Validate.validateCartbook(cart,temp);
				Bookshelf addbook= Validate.validatshelfbook(testbook, tital);
				cart.add(addbook);
				break;
			case 2:
				for(Bookshelf b:cart) {
					System.out.println(b);
				}
				break;
			case 3:
				if(cart.remove(new Bookshelf(sc.next())))
					System.out.println("Book removed sucesfully");
				else
					System.out.println("No book as such name in cart");
				break;
			case 4:
				float val=0;
				for(Bookshelf b:cart) {
					val=val+b.getPrice();}
				System.out.println(val);
				break;
			case 5:
				System.out.println("Exiting");
				gotobook=false;
			default:
				System.out.println("Dont add wrong input");
				gotobook=false;
				break;
			}	
			
			}while(gotobook);
			break;
		case 3:
			System.out.println("Add book name first\nthen add auther name\nPrice ofbook\nand publicing date");
			String s=sc.next();
			if(testbook.putIfAbsent(s,new Bookshelf(s,sc.next(),sc.nextFloat(),LocalDate.parse(sc.next())))==null)
				System.out.println("Book adeed");
			else
				System.out.println("same book not allowed twice");
			break;
		case 4:
			System.out.println("Give tital to remove book");
			if(testbook.remove(sc.next()) != null) {
				System.out.println("Book removed");
			}
			else
			System.out.println("noo book like that");
			break;
		default:
			enter=false;
			break;
		}
			
			
		}while(enter);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}








