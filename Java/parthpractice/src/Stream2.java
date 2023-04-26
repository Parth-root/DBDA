import java.util.stream.IntStream;

public class Stream2 {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 100)
		.filter(i -> i%2 != 0)
		.map(i -> Math.sqrt((i*i)-(int)Math.sqrt(i))
		.sum();
	System.out.println("Sum="+sum);
	}
}
