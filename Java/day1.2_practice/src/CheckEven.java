import java.util.*;
public class CheckEven {

	public static void main(String[] args) {
		Scanner op=new Scanner(System.in); 
		System.out.println("Enter range to find an even number");
	    System.out.println("Enter first number");
	    int num1=op.nextInt();
	    System.out.println("Enter second number");
	    int num2=op.nextInt();
	    for(int i=num1;i<=num2;i++) {
	    	if(even(i))
	    		System.out.println("Even number= "+i);
	    }
	}
	    
	    public static boolean even(int y) {
	    	if(y%2==0)
	    		return true;
	    	return false;
	    }
	    	    
}
