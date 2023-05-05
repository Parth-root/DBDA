package exception;
import java.util.ArrayList;
import java.util.HashMap;

import com.book.core.Bookshelf;

public class Validate {
	public static String validateCartbook(ArrayList<Bookshelf>book,String title) throws BookError404 {
		Bookshelf b= new Bookshelf(title);
		if(book.contains(b)) {
			throw new BookError404("Book is Duplicated");}
		return title;
	}
	
	public static Bookshelf validatshelfbook(HashMap<String,Bookshelf> book,String title) throws BookError404 {
		Bookshelf b= new Bookshelf(title);
		if(!book.containsKey(title)) {
			throw new BookError404("Book is not in shelf");}
		return book.get(b.getTitle());
		
	}


}
