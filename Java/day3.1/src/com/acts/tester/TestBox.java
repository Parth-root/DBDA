package com.acts.tester;
//A separate class for UI
import com.acts.Box;
import java.util.Scanner;
public class TestBox {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		Box b1;									//b1:class type of reference which can point to Box type object allocated in stack
		System.out.println("Enter the 1st box dimensions:");		//Prompt user for the box dimensions
		b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1.getBoxDims());
		System.out.println("Volume= "+b1.getComputedVolume());
		System.out.println("Enter the 2nd box dimensions:");
		Box b2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b2.getBoxDims());
		System.out.println("Volume= "+b2.getComputedVolume());	
		Box b3=b1;
		b1=null;
		System.out.println("Volume= "+b3.getComputedVolume());
		//System.out.println("Volume= "+b1.getComputedVolume());		//Null pointer exception
		sc.close();
		System.gc();
		
		}

}
