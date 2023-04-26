package tester;
import com.shop.core.*;

import utils.IOUtils;

import java.util.Map;
import java.util.Scanner;
import static utils.ShopUtils.*;
public class ShopProduct {

	public static void main(String[] args) {
		
	/* 	1.get product map from shop util
		2.save map of product in bin file :using serialization :I/O
		IOutils: i/f--add statuc method
	*/
		try (Scanner sc=new Scanner(System.in)){
				Map<Integer,Product> productMap=populateProductMap(populateProductList());//1.
				System.out.println("Enter file name to store product");
				String fileName=sc.next();
				IOUtils.writeData(productMap,fileName);
				System.out.println("data saving successful!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");
	}

}
