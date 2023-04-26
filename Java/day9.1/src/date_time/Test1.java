package date_time;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class Test1 {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Current date: "+LocalDate.now());
			System.out.println("Current time: "+LocalTime.now());
			System.out.println("Current date and time: "+LocalDateTime.now());
			
			/*
			System.out.println("\nEnter joining date and time: year, month, day");
			LocalDate joinDate1=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println("Joining date: "+joinDate1);
			System.out.println("\nEnter joining date and time: yyyy-MM-dd");
			LocalDate joinDate2=LocalDate.parse(sc.next());
			System.out.println("Joining date: "+joinDate2);
			
			System.out.println("\nIs before: "+joinDate1.isBefore(joinDate2));
			System.out.println("Compare to: "+joinDate1.compareTo(joinDate2));
			*/
			
			LocalDate today=LocalDate.now();
			System.out.println("Current date: "+today);
			System.out.println("Enter the waiting period: ");
			LocalDate startDate=today.plusDays(sc.nextLong());
			System.out.println("Starting date: "+startDate);
		}
		
	}

}
