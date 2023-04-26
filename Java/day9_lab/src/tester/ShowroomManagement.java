package tester;

import java.util.Scanner;
import com.app.core.*;
import static utils.ValidationRules.*;

public class ShowroomManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		char ch;
		System.out.print("Enter the number of vehicles in the showroom: ");
		Vehicle[] vehicles = new Vehicle[sc.nextInt()];
		
		do {
			try {
				System.out.println("1.Add vehcile \n2.Display all vehicles \n0.Exit");
				
				switch(sc.nextInt()) {
					case 1:
							if(count<vehicles.length) {
									System.out.println("Vehicle details");
									System.out.println("chasisnumber, color, baseprice,"
											+ " manufacturingdate, company");
									Vehicle v1 = validateVehicle(vehicles, sc.next(), sc.next(),
											sc.nextDouble(), sc.next(), sc.next());
									vehicles[count++] = v1;
									System.out.println("Vehicle successfully added");
							}
							else
								System.out.println("Showroom is full");
							break;
							
					case 2:
							System.out.println("Details of all vehicles");
							for(Vehicle v : vehicles) {
								if(v!=null)
									System.out.println(v);
							}
							break;
							
					case 0:
							System.out.println("Program terminated");
							System.exit(0);
							break;
							
					default:
							System.out.println("Wrong input. Try again");
							break;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
			
			System.out.println("Do you want to continue?(Y/N)");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
		sc.close();
	}

}
