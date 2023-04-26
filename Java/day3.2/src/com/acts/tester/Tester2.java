package com.acts.tester;
import com.acts.geometry.Point2D;

import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int ind1,ind2;
			System.out.print("Enter the number of points to be plotted: ");
			Point2D[] points=new Point2D[sc.nextInt()];
			
			//Inputting an array of points
			for(int i=0;i<points.length;i++) {
				System.out.println("Enter the X and Y coordinates for point"+(i+1)+": ");
				points[i]=new Point2D(sc.nextDouble(),sc.nextDouble());
			}
			
			//Displaying the array of points
			int j=0;	
			for(Point2D pts: points) {
				j++;
				System.out.println("Coordinates for the point"+j+"-> "+pts.show());
			}
			
			//Comparing points in two indices of the array
			System.out.print("Enter the points to be compared: ");
			ind1=sc.nextInt()-1;
			ind2=sc.nextInt()-1;
			if(ind1>points.length || ind2>points.length)
				System.out.println("One or both points do not exist");
			else
				System.out.println(points[ind1].equals(points[ind2])?"Points are equal":"Points are not equal");
			sc.close();
	}

}
