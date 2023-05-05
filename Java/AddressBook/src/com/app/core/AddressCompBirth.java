package com.app.core;

import java.util.Comparator;

public class AddressCompBirth implements Comparator<Address>{

	@Override
	public int compare(Address o1, Address o2) {
			System.out.println("in vehicle price comparator : desc");
			int i=o1.getBirthDate().compareTo(o2.getBirthDate());
		return i;
	}
	       

}
