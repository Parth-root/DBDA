package test;
import static test.AllFunction.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Ttest {
	public static void main(String[] args) throws ClassNotFoundException {
		ReadFile();
		boolean go=true;
		do {
			@SuppressWarnings("resource")Scanner sc= new Scanner(System.in);
			System.out.println("select option\n"
					+ "1.Display product list\n"
					+ "2.add new product\n"
					+ "3.save in binury file\n"
					+ "4.exit");
			switch (sc.nextInt()) {
			case 1:displayProductList();break;
			case 2:addNewProduct();break;
			case 3:saveInFile();break;
			case 4:System.out.println("Exiting...");go=false;break;
			default:System.out.println("No rendome Value allowed Exitin...");go=false;break;
			}}while(go);}
	//saving to data
	public static void  saveInFile() {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("File1.dat")))){
			oos.writeObject(listpro);}catch(Exception e){System.out.println(e);}}}
