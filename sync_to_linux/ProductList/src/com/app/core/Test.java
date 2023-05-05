package com.app.core;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ProtocolException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	static Scanner sc=new Scanner(System.in);
	static List<Product> listPro=new ArrayList<Product>();
	static int id=1;
	//main started//
	public static void main(String[] args) {
		ReadListProduct();
		boolean count=true;
		do {
			System.out.println("Manue\n");
			System.out.println("1. Display Product LIst\n"
					+ "2. Add New product\n3. save file in coleection in the bin file"
					+ "\n4. exit");
			switch (sc.nextInt()) {
			case 1:
				Display_product_list();
				break;
			case 2:
				Add_new_product();
				break;
			case 3:
				Save_To_File();
				break;
			case 4:
				count=false;
				break;
			default:
				System.out.println("No rendome value ALLOWD EXITING....");
				count=false;
				break;
								}
			}while(count);

	}

	@SuppressWarnings("unchecked")
	private static void ReadListProduct() {
	try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("File.dat")))){
		listPro=(List<Product>) ois.readObject();
		if(listPro.size()>0)
			id=listPro.size()+1;
		
	}catch (Exception e) {
		
	}
		
	}
	private static void Add_new_product() {
		boolean chack=false;
		System.out.println("Enter the name of product:");
		sc.nextLine();
		String name=sc.next();
		System.out.println("Enter the price of Product:  ");
		double price =sc.nextDouble();
		System.out.println("Enter expiry date(yyyy-mm-dd)");
		String date=sc.next();
		LocalDate curntdate=LocalDate.of(LocalDate.now().getYear(),1,1);
		LocalDate d1=LocalDate.parse(date);
		System.out.println(curntdate+"\n");
		System.out.println(d1);
		for(Product pro:listPro) {
			if((pro.getName().equals(name) && pro.getPrice()== price)){
				chack=true;
			}
		}
		try {
			if(chack) {
				throw new ProtocolException("Product is duplicated");
			}else {
				if(d1.isBefore(curntdate)) {
					throw new ProductException("Expiry date is greter than the currunt date");
				}
				listPro.add(new Product(id++,name, price, d1));
				System.out.println("Add product is successfull");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	private static void Display_product_list() {
		for(Product pro:listPro) {
			if(pro !=null) {
				System.out.println(pro);
			}
		}
	}
	

	private static void Save_To_File() {
		try (ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(new File("File.dat")))){
			oos.writeObject(listPro);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
