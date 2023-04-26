package exception_handling;
import java.util.Scanner;
import static utils.ValidationRules.validateSpeed;;

public class TestCustomException {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter current speed: ");
			validateSpeed(sc.nextInt());
			int g=100;
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of main");
	}

}
