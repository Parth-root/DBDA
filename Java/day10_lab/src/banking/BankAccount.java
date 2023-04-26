package banking;

import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount>{
	private int acc_num;
	private String pin;
	private String cust_name;
	private Account acc_type;
	private double acc_bal;
	private LocalDate crt_date;
	
	public BankAccount(int acc_num, String pin, String cust_name, Account acc_type, 
			double acc_bal, LocalDate crt_date) {
		this.acc_num=acc_num;
		this.pin=pin;
		this.cust_name=cust_name;
		this.acc_type=acc_type;
		this.acc_bal=acc_bal;
		this.crt_date=crt_date;
	}
	
	public BankAccount(int acc_num) {
		this.acc_num=acc_num;
	}
	
	@Override
	public String toString() {
		return "Account Number: "+acc_num+"\tCustomer Name: "+cust_name
				+"\nAccount Type: "+acc_type+"\tAccount Balance: "+acc_bal
				+"\nCreation Date: "+crt_date;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.acc_num==((BankAccount)obj).acc_num)
			return true;
		return false;
	}
	
	public String getName() {
		return cust_name;
	}
	
	public String getPIN() {
		return pin;
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

	@Override
	public int compareTo(BankAccount o) {
		if(this.acc_num<=o.acc_num)
			return -1;
		return 1;
	}
}
