package arrays;
import java.util.Arrays;

public class TestMultiDimarray {

	public static void main(String[] args) {
			int value=10;
			
			//2D array to store values from 11 onwards
			int[][] data=new int[3][4];
			for(int i=0;i<data.length;i++) {
				for(int j=0;j<data[i].length;j++)
					data[i][j]=value++;
			}
			
			/*
			 //Displaying 2D array using for
			 for(int i=0;i<data.length;i++) {
				for(int j=0;j<data[i].length;j++)
					System.out.print(data[i][j]+" ");
				System.out.println();
				}
			}
			*/
			
			/*
			//Displaying 2D array using for-each
			for(int[] i: data) {
				for(int j: i) 
					System.out.print(j+" ");
				System.out.println();
			}		
			*/
			
			//Displaying nested array using built-in method in java.util.Arrays
			System.out.println(Arrays.deepToString(data));
	}
	
}


