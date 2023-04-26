package non_generic;

public class TestMe {

	public static void main(String[] args) {
		//Creating a Holder class instance to hold an int type
		Holder h1=new Holder(1234);		//int->Integer-->Object
		int data=(Integer)h1.getRef();	//To access data, explicit down casting is required
		
		//Create Holder class instance to hold a literal string
		Holder h2=new Holder("Hello"); 	//String-->Object
		String s=(String)h2.getRef();	//To access it,  explicit down casting is required
		
		h1=h2;
		data=(Integer)h1.getRef();
	}

}
