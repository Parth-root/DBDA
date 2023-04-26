package p1;

public class Test2 {

	public static void main(String[] args) {
		//Indirect referencing
		Printer p;					//Interface type of reference
		p=new ConsolePrinter();		//Upcasting using 'implements' keyword. Depicts IS-A relationship
									//Interface can directly refer to any implementation class instance(w/o type casting)
		p.print("Some message");	//Run time polymorphism
		p=new NetworkPrinter();
		p.print("Some message");
		p=new FilePrinter();
		p.print("Some message");
	}

}
