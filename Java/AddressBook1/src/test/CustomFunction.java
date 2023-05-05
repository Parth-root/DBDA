package test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import appcore.Address;
import exception.Error;

public class CustomFunction {
static Scanner sc=new Scanner(System.in);
	static ArrayList<Address>listadd =new ArrayList<Address>();
//-----------------------------------------------------------------------
	public static void predifine() {
		listadd.add(new Address("abcd@123.mail.com","man1",LocalDate.parse("2018-12-01"),1234,"Ahm"));
		listadd.add(new Address("efgh@123.mail.com","man2",LocalDate.parse("2016-01-23"),5678,"Mumb"));
		listadd.add(new Address("ijkl@123.mail.com","man3",LocalDate.parse("2014-11-12"),91011,"Pune"));
		listadd.add(new Address("mnop@123.mail.com","man4",LocalDate.parse("2019-09-06"),121314,"Cdac"));
		listadd.add(new Address("qrst@123.mail.com","man5",LocalDate.parse("2022-03-07"),15161718,"Acts"));
	}
//-------------------------------------------------------------------		
	public static void addNewAddresh() {
		System.out.println("Add email\nAdd name\nAdd birth Date\nAddMobile numer\nAdd city");
	listadd.add(new Address(sc.next(), sc.next(),LocalDate.parse(sc.next()) ,sc.nextInt(),sc.next()));	
		}
//--------------------------------------------------------------------
	 public static void serchByEmail()  {
		 try {
		 System.out.println("Enter email to find");
		 String email=sc.next();
		 if(listadd.contains(new Address(email))) {
			 System.out.println(listadd.get(listadd.indexOf(new Address(email))));
		 }else {System.out.println("Email is not in list"); throw new exception.Error("email is not found");}
		}catch(Exception e){
			System.out.println(e);}}
		
//----------------------------------------------------------------------
	public static void serchByBday() {
		try {
		System.out.println("Enter birthday in yyyy-mm-dd formate");
		 LocalDate bday= LocalDate.parse(sc.next());
		 if(listadd.contains(new Address(bday))) {
			 System.out.println(listadd.get(listadd.indexOf(new Address(bday))));
		 }else {System.out.println("Birthday is not available"); throw new exception.Error("Birthday not found");}
		}catch(Exception e) {System.out.println(e);}
		}

//-------------------------------------------------------------------------
	public static void allAddreshShow() throws Error {
		try {
		for(Address a:listadd) {
			System.out.println(a);}
		}catch(Exception e) {throw new exception.Error("NO data in list");}}
//-------------------------------------------------------------------------
	public static void deletAddreshByMail() {
		try {
		 System.out.println("Enter email to delet coroshpond addresh");
		 String email=sc.next();
		 if(listadd.contains(new Address(email))) {
		listadd.remove(listadd.indexOf(new Address(email)));
		System.out.println("Succesfully removed");
		 }else {System.out.println("Email is not in list so cant delet"); throw new exception.Error("email id not in list");}
		}catch(Exception e) {System.out.println(e);}}
//-------------------------------------------------------------------------
	public static void sortByName() throws Error {
		System.out.println("Sort by name");
		Collections.sort(listadd);
		allAddreshShow();}
//-------------------------------------------------------------------------
	public static void sortbyBday() throws Error {
		System.out.println("Sort by bday");
		Collections.sort(listadd,new AddreshCompBirth());}
//-------------------------------------------------------------------------
	//<0> end of code<0>

}


