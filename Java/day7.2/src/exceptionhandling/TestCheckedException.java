package exceptionhandling;

//Checked Exception: javac forces handling of checked exceptions
//Solution: Use a try-catch block or use the throws keyword 
public class TestCheckedException {

	public static void main(String[] args) {
		System.out.println("Before sleep");
		
		try {
			Thread.sleep(-9000);
		}catch(Exception e) {
			System.out.println("Error occured");
		}
		
		System.out.println("After sleep");
	}

}
