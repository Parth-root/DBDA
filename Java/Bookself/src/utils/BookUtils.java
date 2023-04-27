package utils;
import java.time.LocalDate;
import java.util.HashMap;

import com.book.Book;

public class BookUtils {
	public static HashMap<String ,Book> populate (){
		HashMap<String, Book> allBooks=new HashMap<>();
		
		allBooks.put("abcd1",new Book("abcd1","A",401,LocalDate.parse("2022-03-21")));
		allBooks.put("abcd2",new Book("abcd2","B",402,LocalDate.parse("2022-05-21")));
		allBooks.put("abcd3",new Book("abcd3","C",403,LocalDate.parse("2022-06-21")));
		allBooks.put("abcd4",new Book("abcd4","D",404,LocalDate.parse("2022-08-21")));
		return allBooks;
	}
}
