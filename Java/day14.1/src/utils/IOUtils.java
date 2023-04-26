package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import static utils.ShopUtils.*;

import com.shop.core.Product;

public interface IOUtils {
	static void writeData(Map<Integer,Product> map,String fileName)throws IOException {
		/*1. create chain of i/o
				strem	
			Java app--->oos(bin)--->FOS--->bin file	 
		 */
	try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))){
		out.writeObject(map);
	}//out.close--->fos.close-->close the file
	}
// add a static method re store th eproducts from the bin
	//chain of strems for de-swerial
			//1 for java app <-----OIS<----FileInputStrem<-----Bin file
	@SuppressWarnings("unchecked")
	static Map<Integer,Product>restoreData(String fileName) throws IOException,ClassNotFoundException{
	try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(fileName)))
	{
	
		return (Map<Integer,Product>)in.readObject();
	}catch (Exception e) {
		System.err.println("in catch"+e);
	//file does not exist or some other run time error
		//return populated map to the caller
		System.out.println("returning populated map as the strtup condition");
		return populateProductMap(populateProductList());
	}
	}
	
}

