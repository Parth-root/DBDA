package tester;
import com.shop.core.*;

import utils.IOUtils;

import java.util.Map;
import java.util.Scanner;
import static utils.ShopUtils.*;
public class RestoreProduct {

	public static void main(String[] args) {
		
	/* 	1.get product map from shop util
		2.save map of product in bin file :using serialization :I/O
		IOutils: i/f--add statuc method
	*/
		try (Scanner sc=new Scanner(System.in)){
				System.out.println("Enter file name to restore product");
				String fileName=sc.next();
				Map<Integer,Product> data=IOUtils.restoreData(fileName);
				data.forEach((k,v)->System.out.println(v));
				System.out.println("data restoreed successful!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");
	}

}
