package tester;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.book.Book;

import cust_exception.InvalidBook;
import utils.BookUtils;
import utils.ValidationRules;

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
					case 2:
						boolean flag=false;
						while (!flag) {
							System.out.println("\n \n "
									+ "Enter 1: Add book to cart \n2: Display books in cart \n3: Remove Book From cart\n"
									+ "4: Total Price \n"
									+ "5: exit");
							switch (sc.nextInt()) {
							case 1:
								System.out.println("Enter tital of book");
								String s = sc.next();
								String c= ValidationRules.validateTitle(Cart, s);
								Book t= ValidationRules.ValidateMapTitle(books, c);
								Cart.add(t);
								System.out.println("Book added to cart");
								break;
							case 2:
								System.out.println("All books in cart");
								for (Book b : Cart) {
									if(b !=null) {
										System.out.println("in");
										System.out.println(b);
									}
								}
								break;
							case 3:
								System.out.println("Enter Title of Book to remove");
								if(Cart.remove(new Book(sc.next()))) {
									System.out.println("Book removed");
								}else
									throw new InvalidBook("No such book");
								break;
							case 4:
								double cost=0;
								for(Book b:Cart) {
									cost=cost+b.getPrice();
								}
								System.out.println("Total cost of all book:  "+ cost);
								break;
							case 5:
								flag=true;
								break;
							default:
								System.out.println("Unknow input exiting.....");
								flag=true;
								break;
							}
						}
						break;
					case 3:
						System.out.println("Enter bookinfo: title, author name,price ,Publishing date");
						Book temp=new Book(sc.next(),sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()));
						if(books.putIfAbsent(temp.getTitle(),temp)==null) {
							System.out.println(books.values());//add if to null and if same book add book present
							System.out.println("Success!! ");
						}
						else
							System.out.println("Duplicate key cant add book");
						
						break;
					case 0: exit=true;
						break;
					default:
						System.out.println("Entering rendome value not ALLOWD EXITING........");
						exit=true;
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
