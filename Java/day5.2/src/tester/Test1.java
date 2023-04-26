package tester;
import inheritance.*;

public class Test1 {

	public static void main(String[] args) {
			Student s1=new Student("Ash", "Ketchum", 12, 5, "Animal Husbandry", 84.5);
			Faculty f1=new Faculty("Severus", "Snape", 46, "Professor", "Physics", 11);
			System.out.println(s1);			//calls s1.toString() implicitly
			System.out.println(f1);			//calls f1.toString() implicitly
			
	}

	

}
