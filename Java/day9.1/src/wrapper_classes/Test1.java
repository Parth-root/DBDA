package wrapper_classes;

public class Test1 {

	public static void main(String[] args) {
		int data=1234;
		Integer i1=Integer.valueOf(data);	//Boxing
		double d1=1234.56;
		Double d=Double.valueOf(d1);		//Boxing
		double val=d.doubleValue();			//Unboxing
		Integer i2=987;						//Auto-boxing
		Double d2=987.65;					//Auto-boxing
		//d2=18.26f;						//javac first auto-boxes. float cannot be upcast to wrapper Double
											//float can only be upcast to primitive double
		Number n1=12.34f;					//float autoboxes into Float. It then gets upcast into Number
		n1=12;								//int autoboxes into Integer. It then gets upcast into Number
		Object o=true;						//boolean autoboxes into Boolean. It then gets upcast into Number
	}
}
