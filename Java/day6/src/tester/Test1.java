package tester;
import inheritance.*;

public class Test1 {

	public static void main(String[] args) {
			//Upcasting
			Person p1=new Student("Ash", "Ketchum", 12, 5, "Animal Husbandry", 84.5);	   
			Person p2=new Faculty("Severus", "Snape", 46, "Professor", "Physics", 11);
			System.out.println(p1);			
			System.out.println(p2);		
			
			//p1.study();		//javac error: As compiler resolves by type of reference
			//p2.teach()		//Person class doesn't have a teach() method
			
			//Downcasting
			((Student)p1).study();
			((Faculty)p2).teach();
			
			//((Student)p2).study();	//No javac error but run-time error occurs -> ClassCastException
										//Faculty cannot be cast to a Student
			
			Person p=new Student("James", "Orwell", 16, 31, "Calculus-I", 71.5);
			//Checking reference before downcasting
			if(p instanceof Student)
				((Student)p).study();
			else
				System.out.println("Not a student");
			
			if(p instanceof Faculty)
				((Faculty)p).teach();
			else
				System.out.println("Not a faculty");
	}

	

}
