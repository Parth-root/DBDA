package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

import utils.ValidationRules;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * 0. Prompt showroom capacity Create suitable array.
			 */
			System.out.println("Enter showroom size");
			Vehicle[] showroom = new Vehicle[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("1. Add Vehicle 2.Display all vehicles 0.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < showroom.length) {
							System.out.println(
									"Enter vehicle details : chasisNo,  vehicleColor,  basePrice,  manufactureDate,  company");
							Vehicle validVehicle = ValidationRules.validateAllInputs(sc.next(), sc.next(),
									sc.nextDouble(), sc.next(), sc.next(), showroom);
							showroom[counter++]=validVehicle;
							System.out.println("Vehicle added .....");
						} else
							System.out.println("Showroom full!!!!!!!!!!!!!");

						break;
					case 2:
						System.out.println("Showroom details");
						for(Vehicle v : showroom)
							if(v != null)
								System.out.println(v);
						break;
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
