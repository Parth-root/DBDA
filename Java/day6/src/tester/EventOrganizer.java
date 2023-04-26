package tester;
import java.util.Scanner;
import inheritance.*;
public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,counter=0;
		boolean exit=false;
		
		System.out.print("Enter the number of participants: ");
		num=sc.nextInt();
		Person[] participants=new Person[num];
				
		while(!exit) {
			System.out.println("1.Register Student \n2.Register Faculty "
					+ "\n3.Display details of all participants "
					+ "\n4.Display specific participant details "
					+ "\n5.Display specific functibality \n0. Exit");
			System.out.print("Choose Option: ");
			
			switch (sc.nextInt()) {
			case 1:
					if(counter<num) {
						System.out.println("Enter Student Details");
						System.out.println("fname,lname,age,rollno,course,marks");
						participants[counter++]=new Student(sc.next(),sc.next(),sc.nextInt(),
								sc.nextInt(),sc.next(),sc.nextDouble());
						System.out.println("Student Registered");
					}
					else
						System.out.println("Maximum number of participants reached");
					break;
					
			case 2:
					if(counter<num) {
						System.out.println("Enter Faculty Details");
						System.out.println("fname,lname,age,pos,domain,exp");
						participants[counter++]=new Faculty(sc.next(),sc.next(),sc.nextInt(),
							sc.next(),sc.next(),sc.nextInt());
						System.out.println("Faculty Registered");
					}
					else
						System.out.println("Maximum number of participants reached");
					break;
					
			case 3:
					System.out.println("All participants");
					for(Person p:participants) {
						if(p!=null)
							System.out.println(p);
						else
							break;
					}	
					break;
					
			case 4:
					System.out.println("Specific Details");
					System.out.print("Enter seat number: ");
					int index=sc.nextInt()-1;
					if(index>=0 && index<num) {
						if(index<=counter) 
							System.out.println(participants[index]);
						else
							System.out.println("Seat is vacant");
					}
					else
						System.out.println("Seat does not exist");
					break;
					
			case 5:
					System.out.println("Specific Functionality");
					System.out.print("Enter seat number: ");
					int ind=sc.nextInt()-1;
					if(ind>=0 && ind<num) {
						if(ind<=counter) {
							System.out.println(participants[ind]);
							if(participants[ind] instanceof Student) 
								((Student)participants[ind]).study();
							else
								((Faculty)participants[ind]).teach();
						}
					}
					break;
				
			case 0:
					System.out.println("Exiting Program");
					exit=true;
					break;
			default:
					System.out.println("Wrong input. Program terminated");
					exit=true;
					break;
			}
			System.out.println();
		}
		sc.close();		
	}

}