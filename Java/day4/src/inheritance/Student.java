package inheritance;

public class Student extends Person{
		//Additional States
		private int rollno;
		private String course;
		private double marks;
		
		public Student(String fname, String lname, int age, int rollno, String course, double marks){
			//Explicitly invoke the matching super class constructor
			super(fname,lname,age);
			System.out.println("Student Class Constructor Invoked");
			this.rollno=rollno;
			this.course=course;
			this.marks=marks;
		}
		
		public String getDetails2() {
			return "Student Class-> Rollno:"+rollno+"   Course:"+course+"   Marks:"+marks;
		}
}
