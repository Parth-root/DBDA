package p2;

public class NetworkPrinter implements Printer{
	@Override
	public void print(String somemsg) {
		System.out.println("Sending message: "+somemsg+" to the server");
	}
}
