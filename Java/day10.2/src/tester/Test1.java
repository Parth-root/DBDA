package tester;

import java.time.LocalDate;

import com.app.core.Color;
import com.app.core.Vehicle;

import utils.ValidationRules;

public class Test1 {

	public static void main(String[] args) {
		try {
		Vehicle[] vehicles = { new Vehicle("mh-101", Color.BLACK, 12345, LocalDate.parse("2020-12-24"), "Maruti"),
				new Vehicle("mh-320", Color.BLACK, 12345, LocalDate.parse("2020-12-24"), "Maruti"),
				new Vehicle("mh-100", Color.BLACK, 12345, LocalDate.parse("2020-12-24"), "Maruti"), null, null, null };
		    String chNo="mh-322";
		    ValidationRules.validateChasisNo(vehicles, chNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");
	}

}
