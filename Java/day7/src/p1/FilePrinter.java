package p1;

public class FilePrinter implements Printer{
	@Override
	public void print(String somemsg) {
		System.out.println("Saving a message: "+somemsg+" to the file");
	}
}
