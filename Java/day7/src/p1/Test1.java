package p1;

public class Test1 {

	public static void main(String[] args) {
		ConsolePrinter cp = new ConsolePrinter();
		cp.print("Message 1");
		FilePrinter fp = new FilePrinter();
		fp.print("Message 2");
		NetworkPrinter np = new NetworkPrinter();
		np.print("Message 3");
	}

}
