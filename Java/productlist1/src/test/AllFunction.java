package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import product.Product;
import productexception.ProductException;

public class AllFunction {
	static List<Product> listpro=new ArrayList<Product>();
	static Scanner sc=new Scanner(System.in);
	static int id=1;
//-------------------------------------------------------------------------------------------->
@SuppressWarnings("unchecked")
public static void ReadFile() throws ClassNotFoundException {
	try {
		ObjectInputStream OIS=new ObjectInputStream(new FileInputStream(new File("File1.dat")));
		listpro = (List<Product>)OIS.readObject();
		if(listpro.size()>0)
			id=listpro.size()+1;
	} catch (IOException e) {
		System.out.println(e);}}
//-------------------------------------------------------------------------------------------->
public static void displayProductList() {
	for(Product p:listpro) {
		System.out.println(p);}}
//-------------------------------------------------------------------------------------------->
public static void addNewProduct() {
	System.out.println("Add product data as \nName\nPrice\nDateofExpire");
	try {String s=sc.next();float f=sc.nextFloat();LocalDate d=LocalDate.parse(sc.next());
	if((listpro.contains(new Product(s)) && listpro.contains(new Product((float)f)))) {
		throw new ProductException("Duplicate product");}
	if(d.isBefore(LocalDate.of(LocalDate.now().getYear(),1,1)))
		throw new ProductException("Product expired cant add");
	listpro.add(new Product(id++,s,f,d));System.out.println("Product aded sucesfully");
	} catch (Exception e) {System.out.println(e);}
//-------------------------------------------------------------------------------------------->
	//saving file is in main due to final error
//-------------------------------------------------------------------------------------------->


}
}
