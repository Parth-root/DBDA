import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 100)
		.filter(i->i%2!=0)
		.sum();
	System.out.println("Sum="+sum);
	}
}
