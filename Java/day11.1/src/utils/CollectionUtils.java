package utils;

import java.util.ArrayList;

import com.app.core.Color;
import com.app.core.Vehicle;
import static java.time.LocalDate.parse;

public class CollectionUtils {
//add a static method to return populated list of vehicles , with sample data to the caller
	public static ArrayList<Vehicle> populateShowroom() {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("abc-1234", Color.RED, 385678, parse("2023-02-23"), "Honda"));
		vehicles.add(new Vehicle("abc-1230", Color.WHITE, 285678, parse("2023-01-23"), "Honda"));
		vehicles.add(new Vehicle("abc-1236", Color.WHITE, 185678, parse("2023-03-23"), "Honda"));
		vehicles.add(new Vehicle("abc-1233", Color.RED, 895678, parse("2023-02-20"), "Honda"));
		vehicles.add(new Vehicle("abc-1235", Color.WHITE, 775678, parse("2023-01-13"), "Honda"));
		vehicles.add(new Vehicle("abc-1232", Color.SILVER, 195678, parse("2023-04-10"), "Honda"));
		vehicles.add(new Vehicle("abc-1237", Color.WHITE, 385678, parse("2023-02-19"), "Honda"));
		vehicles.add(new Vehicle("abc-1231", Color.RED, 855678, parse("2023-01-25"), "Honda"));
		vehicles.add(new Vehicle("abc-1238", Color.WHITE, 815678, parse("2023-02-09"), "Honda"));
		return vehicles;
	}
}
