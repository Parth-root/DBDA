package utils;
import java.util.HashMap;
import java.time.LocalDate;
import com.book.core.Bookshelf;

public class BookUtils {
	public static HashMap<String,Bookshelf>populate(){
	HashMap<String,Bookshelf> allbook=new HashMap<String, Bookshelf>();
	allbook.put("Book1",new Bookshelf("Book1","Man1",5478,LocalDate.parse("2022-12-12")));
	allbook.put("Book2",new Bookshelf("Book2","Man2",234,LocalDate.parse("2022-02-12")));
	allbook.put("Book3",new Bookshelf("Book3","Man3",342,LocalDate.parse("2022-03-12")));
	allbook.put("Book4",new Bookshelf("Book4","Man4",7645,LocalDate.parse("2022-04-12")));
	allbook.put("Book5",new Bookshelf("Book5","Man5",34456,LocalDate.parse("2022-05-12")));
	allbook.put("Book6",new Bookshelf("Book6","Man6",66,LocalDate.parse("2022-10-12")));
	return allbook;
	
}
}
