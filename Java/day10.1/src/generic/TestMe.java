package generic;

public class TestMe {

	public static void main(String[] args) {
		//Create a holder class instance to hold an integer
		Holder<Integer> h1= new Holder<Integer>(1234);		//int->Integer
		int data=h1.getRef();			//No need for explicit downcasting
		
		//Create a holder class instance to hold the string
		Holder<String> h2 = new Holder<String>("Hello");
		String s=h2.getRef();
		
		//h1=h2;		//javac error: Holder<Integer> and Holder<String> are incompatible
	}

}
