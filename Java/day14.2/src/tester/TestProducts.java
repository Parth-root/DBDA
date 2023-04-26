package tester;
import com.shop.core.*;

import utils.IOUtils;

import java.util.Map;
import java.util.Scanner;
import static utils.ShopUtils.*;
import java.util.Scanner;

public class TestProducts {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner (System.in))
		{
			System.out.println("Enter file name");
			String fileName=sc.next();
			boolean exit=false;
			//restore the products (either from hard coded data or binary file)
			Map<Integer,Product>productMap=restoreData(fileName);
			while(!exit)
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
