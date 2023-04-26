package p1;

public class Test3 {

	public static void main(String[] args) {
		Printer[] printers = {new ConsolePrinter(), new FilePrinter(), new NetworkPrinter()};		
		String[] msg = {"msg1","msg2","msg3"};
		int i=0;
		for(Printer p : printers) {
			p.print(msg[i++]);
		}

}
}
