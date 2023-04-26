package tester;
import java.util.Scanner;
import com.acts.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of boxes to be made: ");
		//Create Box[] to hold Box type of references
		Box[] boxes=new Box[sc.nextInt()];
		
		
		/*
		//Display array data using for-each
		for(Box b: boxes)
			System.out.println(b);
			*/
		
		
		//Accept box dimensions
		for(int i=0;i<boxes.length;i++) {
			System.out.println("Enter the box dimensions of box" +(i+1)+ ": ");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		
		//Displaying box dimensions and volume
		int j=0;
		for(Box bo: boxes) {
			j++;
			System.out.println(bo.getBoxDims());
			System.out.println("Volume of box"+j+"= "+bo.getComputedVolume());
		}
		
		//Modifying width
		j=0;
		for(Box box: boxes) {
			j++;
			if(box.getComputedVolume()>100) {
				box.setWidth();
				System.out.println("New width of box"+j+"= "+box.getWidth());
			}
		}
		
		sc.close();
	}

}
