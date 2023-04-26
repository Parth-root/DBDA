package exceptionhandling;

public class TestCheckedException2 {

	public static void main(String[] args) throws InterruptedException{
		//main method will not handle the exception if it arises
		//It delegates the exception handling to the caller
		//In this case the caller is JVM, which aborts the program execution
		System.out.println("Before sleep");
		Thread.sleep(9000);
		System.out.println("After sleep");
	}

}
