package xtra;
import java.util.Scanner;

public class ArrayDouble {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isFull=false;								//Flag used to check if array is full
		int len = 0;										//Stores size of array
		char ch;
		System.out.print("Enter the length of the array: ");
		int[] array=new int[sc.nextInt()];
		do {
			if(isFull) {							
				len=array.length;
				array=modArray(array);
			}
			System.out.println("Length of array= "+array.length);
			System.out.println("Enter the elements: ");
			for(int i=len;i<array.length;i++) 
				array[i]=sc.nextInt();
			
			System.out.println("The array elements are: ");
			viewArray(array);
			isFull=true;
			System.out.println("\nArray is full. Do you want to continue insertion?(Y/N)");
			ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
				
		sc.close();
	}
	
	//Method takes array as input, creates a new array twice its size and returns that new array
	//after copying all the elements from the previous array 
	static int[] modArray(int array[]) {
		int[] temp=new int[array.length*2];
		for(int i=0;i<array.length;i++)
			temp[i]=array[i];
		return temp;
	}
	
	static void viewArray(int array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
}
