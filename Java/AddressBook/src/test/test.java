package test;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import com.app.core.Address;
import com.app.core.AddressCompBirth;

import addressEXCP.AddressHandException;

import java.time.LocalDate;
import static java.time.LocalDate.parse;
public class test {
static Scanner sc =new Scanner(System.in);
static ArrayList<Address>listAddress=new ArrayList<Address>();


	public static void main(String[] args) {
		boolean count=true;
		do {
			System.out.println("Choose manu\n"
					+ "1. Add new address\n2. Serch address by email\n3. serch address by Date of birth\n4. Display all addresses\n5. Delete address by email\n6. Sort by name\n7. Sort by date of birth");
			System.out.println("0. Exit");
			switch (sc.nextInt()) {
			case 1:
				Add_new_address_hardcode();break;
			case 2: Serch_address_by_email();break;
			case 3: serch_address_by_birthdate();break;
			case 4: Display_all_address();break;
			case 5: Delete_address_by_email();break;
			case 6: Sort_by_name();break;
			case 7: Sort_by_birthdate(); break;
			case 0: System.out.println("Exiting...");count=false;break;
			default:System.out.println("Wrong input NOT ALLOWD EXITING.....");count=false;break;
			}
		}while(count);
	}
private static void Add_new_address_hardcode() {
	
	listAddress.add(new Address("truht@ptithcm.edu.vn","Tru",parse("1989-03-17"),986981177,"masha a","Pune"));
	listAddress.add(new Address("bcd@ptithcm.edu.vn","Bcd",parse("1991-10-14"),986981177,"masha a","Pune"));
	listAddress.add(new Address("vcd@ptithcm.edu.vn","Vcd",parse("1990-09-03"),986981177,"masha a","Pune"));
	listAddress.add(new Address("abc@ptithcm.edu.vn","Abc",parse("1979-03-17"),986981177,"masha a","Pune"));
	listAddress.add(new Address("lolisfor@lol.com", "phg",parse("2022-05-12"), 123123345,"pucnhvati", "pune"));
	
	
}
//add from user 
private static void Serch_address_by_email() {
	System.out.println("Enter email of address to serch");
	int index = listAddress.indexOf(new Address(sc.next()));
	boolean check = false;
	if(index == -1)
		check = true;
	try {
		if (check)
			throw new AddressHandException("Email is not Available");
		else 
			System.out.println(listAddress.get(index));	
	}catch (Exception e) {
		System.out.println(e);
	}
}
	private static void serch_address_by_birthdate() {
		System.out.println("Enter birthdate (yyyy-mm-dd) of address to serch");
		LocalDate dateBirth=LocalDate.parse(sc.next());
		int index1 = listAddress.indexOf(new Address(dateBirth));
		boolean check=false;
		if(index1 == -1)
			check=true;
		try {
			if(check)
				throw new AddressHandException("Birthday is not available");
			else
				System.out.println(listAddress.get(index1));
		}catch (Exception e) {
		System.out.println(e);}}
	
	
	private static void Display_all_address() {
		for (Address add:listAddress) {
			System.out.println(add);
		}
	}
	private static void Delete_address_by_email() {
		boolean found = false;
		System.out.println("Enter email of addres to remove");
		String email=sc.next();
		Iterator<Address> itret= listAddress.iterator();
		while (itret.hasNext()) {
			Address address=(Address) itret.next();
			if(address.getEmail().equals(email)) {
				itret.remove();
				found = true;
				break;
			}
			try {
				if (!found)
					System.out.println("Successfully removed");
				else
					throw new AddressHandException("Email is not availabel");
			} catch(Exception e) {
			System.out.println(e);}}}
	
	private static void Sort_by_name() {
		System.out.println("sort by name");
		Collections.sort(listAddress);
		Display_all_address();
	}
	
	private static void Sort_by_birthdate() {
		System.out.println("Sort by datwe of birth");
		Collections.sort(listAddress,new AddressCompBirth());
		Display_all_address();
	}

	
	
	
}
