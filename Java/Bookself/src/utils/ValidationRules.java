package utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.book.Book;
import cust_exception.InvalidBook;
public class ValidationRules {
public static String validateTitle(ArrayList<Book>books,String title) throws  InvalidBook{
	Book b =new Book(title);
	if(books.contains(b)) {
		throw new InvalidBook("Duplicate book");
	}
	return title;
}
public static Book ValidateMapTitle(HashMap<String,Book> books,String title)throws InvalidBook {
	//Book b=new book(title)
	if(!books.containsKey(title)) {
		throw new InvalidBook("Book not in self");
	}
	Book b=new Book(title);
	return books.get(b.getTitle());
	}

}
