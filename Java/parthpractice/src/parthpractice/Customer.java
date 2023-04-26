package parthpractice;
public class Customer {

	private String name;
	private String email;
	private int age;
	private double creditlimit;
	
	String GetCustomer() {
		
		return "Custumer name "+this.name+"\n Custumer email is :"+this.email+"\n Custumer age is:"+this.age+"\n Custumer creditlimit is:"+this.creditlimit;
	}
	
		
	Customer (String name,String email,int age,double creditlimit){
		this.name=name;
		this.email=email;
		this.age=age;
		this.creditlimit=creditlimit;
	}
}
