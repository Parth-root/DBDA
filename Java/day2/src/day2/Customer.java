package day2;

public class Customer {
		private String name,email;
		private int age;
		private double creditlimit;
		
		Customer(){
			
		}
		
		Customer(String name,String mail,int age,double credit){
			this.name=name;
			email=mail;
			this.age=age;
			creditlimit=credit;
		}
		
		String custDetails() {
			return "Name: " + name + "\nEmail: " + email + "\nAge: " + age+ "\nCredit Limit: " + creditlimit;
		}
}
