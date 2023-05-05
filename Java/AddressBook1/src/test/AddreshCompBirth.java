package test;

import java.util.Comparator;

import appcore.Address;

public class AddreshCompBirth implements Comparator<Address> {

	@Override
	public int compare(Address o1, Address o2) {
		int i=o1.getBday().compareTo(o2.getBday());
		return i;
	}
	

}
