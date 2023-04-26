package date_time;

import java.time.LocalDate;


public class Test {

	public static void main(String[] args) {
		LocalDate date=LocalDate.parse("2000-04-03");
		System.out.println(LocalDate.now().compareTo(date));
	}

}
