package utils;

import java.time.LocalDate;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.InvalidVehicleDetailsException;

public class ValidationRules {
	// add a static mehtod to validate all i/ps
	public static Vehicle validateAllInputs(String chasisNo, String vehicleColor, double basePrice,
			String manufactureDate, String company, Vehicle[] vehicles) throws InvalidVehicleDetailsException {
		String validChasisNo = validateChasisNo(vehicles, chasisNo);
		LocalDate validManufacturingDate = validateManufacturingDate(manufactureDate);
		Color validColor = validateColor(vehicleColor);
		// => all valid i/ps

		return new Vehicle(validChasisNo, validColor, basePrice + validColor.getColorCost(), validManufacturingDate,
				company);
	}

//add a static method to chk for dup chasis no
	public static String validateChasisNo(Vehicle[] vehicles, String newChasis) throws InvalidVehicleDetailsException {
		// vehicles : {v1(mh-101,.....),v2(mh-202),v3(mh-300....),null....null}
		// wrap the chasis no int Vehicle class instance
		Vehicle v1 = new Vehicle(newChasis);
		for (Vehicle v : vehicles)
			if (v != null)
				if (v.equals(v1))
					throw new InvalidVehicleDetailsException("Dup chasis no !!!!!!");
		return newChasis;
	}

	// add a static method to validate man. date
	public static LocalDate validateManufacturingDate(String date) throws InvalidVehicleDetailsException {
		LocalDate curntYrDate = LocalDate.of(LocalDate.now().getYear(), 1, 1);
		// parse string ---> local date
		LocalDate d1 = LocalDate.parse(date);
		// validate
		if (d1.isAfter(curntYrDate))
			return d1;
		// => older date : raise exc
		throw new InvalidVehicleDetailsException("Manufacture date can't be old !!!!!!");

	}

	// add a static method to validate color
	public static Color validateColor(String color) {
		return Color.valueOf(color.toUpperCase());
	}

}
