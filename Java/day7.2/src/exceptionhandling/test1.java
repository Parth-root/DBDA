package exceptionhandling;

public class test1 {

	public static void main(String[] args) {
		try {
			int[] data= {10,20,30,40,50};
			System.out.println(data[5]);										//ArrayIndexOutOfBoundExecption
			
			System.out.println("Int value: "+Integer.parseInt("abc123"));		//NumberFormatException
			
			int numerator=100;
			int denomenator=0;
			System.out.println("Result: "+numerator/denomenator);				//ArithmaticException
			
			String s=null;
			System.out.println("Character at 0th index: "+s.charAt(0));			//NullPointerException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error 1");
		}catch(NumberFormatException e) {
			System.out.println("Error 2");
		}catch(ArithmeticException e) {
			System.out.println("Error 3");
		}catch(NullPointerException e) {
			System.out.println("Error 4");
		}
		System.out.println("Main over");
	
	}

}
