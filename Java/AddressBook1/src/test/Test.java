package test;
import static test.CustomFunction.*;
import java.util.Scanner;

import exception.Error;

public class Test {
public static void main(String[] args) throws Error {
	
	
	boolean enter=true;
		do {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number in manu\n"
					+ "99.Add predefine data"
					+ "1.Add new addresh\n"
					+ "2.serch by email\n"
					+ "3. serch by bday\n"
					+ "4.all addresh show\n"
					+ "5.deletaddresh by mail\n"
					+ "6.sort by name\n"
					+ "7.sort by date of birth\n"
					+ "0.Exiting");
			switch (sc.nextInt()) {
			case 99:predifine();break;
			case 1:addNewAddresh();break;
			case 2:serchByEmail();break;
			case 3:serchByBday();break;
			case 4:allAddreshShow();break;
			case 5:deletAddreshByMail();break;
			case 6:sortByName();break;
			case 7:sortbyBday();break;
			case 0:System.out.println("Exiting..."); enter=false;break;
			default:System.out.println("Dont enter wrong value"); enter=false;break;
			}	
			
		}while(enter);
	
} 
}

