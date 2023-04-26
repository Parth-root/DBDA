package inheritance;

public class Faculty extends Person{
		//Additional States
		private String pos;
		private String domain;
		private int exp;
		
		public Faculty(String fname, String lname, int age, String pos, String domain, int exp){
			//Explicitly invoke the matching super class constructor
			super(fname,lname,age);
			System.out.println("Faculty Class Constructor Invoked");
			this.pos=pos;
			this.domain=domain;
			this.exp=exp;
		}
		
		//Method overriding
		public String getDetails() {
			return super.getDetails()+"\tFaculty Class-> Position:"+pos+"   Domain:"+domain+"   Experience:"+exp;
		}
}
