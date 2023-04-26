package com.acts.tester;
import java.util.Scanner;
import com.acts.geometry.Point2D;

public class Tester3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("add how many arrey you want to create");
		Point2D[] Point=new Point2D[sc.nextInt()]; //sc next int to store how many areey user want
		for(int i=0;i<Point.length;i++) {
			System.out.println("Enter cordinate of x and y for point"+(i+1)+": ");
			Point[i]=new Point2D(sc.nextDouble(),sc.nextDouble());
		}
		int j=0;
		for (Point2D pts:Point) {
			j++;
			System.out.println("Cordinate for the point "+j+"->"+pts.show());
		}
		//compering both point
		System.out.println("Enter the two point two compare");
		int arrey1=sc.nextInt()-1;
		int arrey2=sc.nextInt()-1;
		if (arrey1>Point.length || arrey2>Point.length ) {
			System.out.println("One or both point does not exist");
		}
		else {
			System.out.println(Point[arrey1].equals(Point[arrey2])?"Both coedinate is equal":"Both cordinate is not equal");
		}
		sc.close();
	}

}
