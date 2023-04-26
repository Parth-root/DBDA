package banking;

public class BankAccount {
	private long acc_num;
	private String cust_name;
	private String acc_type;
	private double acc_bal;
	
	public BankAccount(long acc_num, String cust_name, String acc_type, double acc_bal) {
		this.acc_num=acc_num;
		this.cust_name=cust_name;
		this.acc_type=acc_type;
		this.acc_bal=acc_bal;
	}
	
	@Override
	public String toString() {
		return "Account Number: "+acc_num+"\tCustomer Name: "+cust_name
				+"\nAccount Type: "+acc_type+"\tAccount Balance: "+acc_bal;
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		if(this==obj)
			return true;
		*/
		if(this.acc_num==((BankAccount)obj).acc_num)
			return true;
		return false;
	}
	
	public double getBalance() {
		return acc_bal;
	}
	
	public String deposit(double amt) {
		acc_bal+=amt;
		return "Account Balance: "+acc_bal;
	}
	
	public String withdraw(double amt) {
		acc_bal-=amt;
		return "Account Balance: "+acc_bal;
	}
}
