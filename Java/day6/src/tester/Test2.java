package tester;
import inheritance.*;

//JVM resolves by type of object
//Compiler resolves type of reference

public class Test2 {

	public static void main(String[] args) {
			//Direct Referencing -> Type of reference is same as type of instance
			Student s1=new Student("Ash", "Ketchum", 12, 5, "Animal Husbandry", 84.5);
			Faculty f1=new Faculty("Severus", "Snape", 46, "Professor", "Physics", 11);
			
			/*
			System.out.println(s1);			//calls s1.toString() implicitly
			System.out.println(f1);			//calls f1.toString() implicitly
			*/
			
			//Upcasting
			Person p;
			p=s1;							//Student IS-A person
			System.out.println(p);			//Run-time polymorphism -> The toString() method to be called is decided by the JVM at run time
			p=f1;
			System.out.println(p);
	}

	

}
