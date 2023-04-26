package inheritance;

public class Person {
		private String fname,lname;
		private int age;
		
		public Person(String fname, String lname, int age) {
			System.out.println("Person Class Constructor Invoked");
			this.fname=fname;
			this.lname=lname;
			this.age=age;
		}
		
		/*
		//Overloaded default constructor
		public Person() {}
		*/
		
		public String getDetails1() {
			return "Person Class-> "+fname+" "+lname+" Age:"+age;
		}
}
