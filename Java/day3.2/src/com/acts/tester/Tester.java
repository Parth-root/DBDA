package com.acts.tester;
import com.acts.geometry.Point2D;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Value of X co-ordinate: ");
		x1=sc.nextDouble();
		System.out.print("Value of Y co-ordiante: ");
		y1=sc.nextDouble();
		Point2D cord=new Point2D(x1,y1);
		System.out.println(cord.show());
		System.out.println("Value of x co-ordinate: ");
		x2=sc.nextDouble();
		System.out.println("Value of y co-ordiante: ");
		y2=sc.nextDouble();
		Point2D chod2 =new Point2D(x2,y2);
		System.out.println(cord.equals(chod2)?"Equal":"Not Equal");

		sc.close();
	}

}
