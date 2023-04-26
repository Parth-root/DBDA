package utils;

import java.time.LocalDate;
import exceptions.*;
import com.app.core.*;

public class ValidationRules {
	
	//Aggregating all validation rules into one single function
	public static Vehicle validateVehicle(Vehicle[] vehicles, String chasisno, String color, double basepr, 
			String manfdate, String company) throws Exception{
		Vehicle tmp = new Vehicle(chasisno);
		String validchno=validateChasis(vehicles, tmp);
		LocalDate validdate=validateDate(manfdate);
		Color validclr=validateColor(color);
		Vehicle newvehicle = new Vehicle(validchno, validclr, basepr+validclr.getColorCost(), validdate, company);
		return newvehicle;
	}
	
	//To validate whether the given chasis number is original
	public static String validateChasis(Vehicle[] vhs, Vehicle vh) throws DuplicateChasisNumberException {
		for(Vehicle v : vhs) {
			if(v!=null) {
				if(vh.equals(v))
					throw new DuplicateChasisNumberException("Chasis number already exists");
			}
		}
		return vh.getChasis();
	}
	
	//To validate whether the given date is in the present year
	public static LocalDate validateDate(String mandate) throws OutDatedManufacturingDateException {
		LocalDate mindate=LocalDate.parse("2022-12-31");
		LocalDate mdate=LocalDate.parse(mandate);
		if(mdate.isAfter(mindate))
			return mdate;
		throw new OutDatedManufacturingDateException("The car must be manufactured in the current year");
	}
	
	//To validate if the given color exists
	public static Color validateColor(String clr) {
		return Color.valueOf(clr.toUpperCase());
	}
	
}
