package tester;
import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;

import com.shop.core.Product;

public class TestShop {

	public static void main(String[] args) {
		System.out.println("Produdts in the shop : using List");
		List<Product> productList = populateProductList();
		productList.forEach(product -> System.out.println(product));
		System.out.println("Enter the date: ");
		sc.next();
	}

}
