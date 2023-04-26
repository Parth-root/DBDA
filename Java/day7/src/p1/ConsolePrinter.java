package p1;

public class ConsolePrinter implements Printer{
	//All interface methods are public abstract
	//Overridding method should be public as the access-specifier(visibility) cannot be narrowed down
	@Override
	public void print(String somemsg) {
		System.out.println("Printing message: "+somemsg+" on the console");
	}
}
