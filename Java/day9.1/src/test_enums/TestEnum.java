package test_enums;
import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {
		//Display all colors
		for(Color c : Color.values()) {
			System.out.println(c);
		}
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Choose a color: ");
			Color chosenClr=Color.valueOf(sc.next().toUpperCase());
			System.out.println("You chose: "+chosenClr.name()+" Postion: "+chosenClr.ordinal());
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main over");
	}

}
