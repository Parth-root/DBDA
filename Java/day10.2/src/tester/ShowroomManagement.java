package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

import custom_exception.InvalidVehicleDetailsException;
import utils.ValidationRules;
import java.util.ArrayList;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//Create empty AL to store vehicle type refs
			ArrayList<Vehicle> showroom=new ArrayList<Vehicle>(100);	//size=0,capacity=100
			boolean exit = false;
			
			while (!exit) {
				System.out.println("1. Add Vehicle 2.Display all vehicles 3.Fetch vehicle 4. Update Vehicle Details details 0.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
							System.out.println(
									"Enter vehicle details : chasisNo,  vehicleColor,  basePrice,  manufactureDate,  company");
							Vehicle validVehicle = ValidationRules.validateAllInputs(sc.next(), sc.next(),
									sc.nextDouble(), sc.next(), sc.next(), showroom);
							showroom.add(validVehicle);
							System.out.println("Vehicle added .....");

						break;
					case 2:
						System.out.println("Showroom details");
						for(Vehicle v : showroom)
								System.out.println(v);
						break;
						
					case 3:{
						System.out.println("Enter the chasis no of the car");
						Vehicle tmp=new Vehicle(sc.next());
						int g=showroom.indexOf(tmp);
						if(g == -1)
							throw new InvalidVehicleDetailsException("Invalid Chasis no..");
						System.out.println(showroom.get(g));
					}
					case 4:
					{
						System.out.println("Enter the chasis no of the car");
						Vehicle tmp=new Vehicle(sc.next());
						int g=showroom.indexOf(tmp);
						if(g == -1)
							throw new InvalidVehicleDetailsException("Invalid Chasis no..");
						System.out.println(showroom.get(g));
						System.out.println("Enter price new price to set");
						
						showroom.get(g).setBasePrice(sc.nextDouble());
					}
					case 0:
						exit = true;

						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

	}

}
