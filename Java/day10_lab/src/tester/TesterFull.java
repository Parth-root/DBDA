package tester;

import java.util.Scanner;
import java.util.ArrayList;
import banking.*;
import exceptions.*;
import static utils.ValidationRules.*;

public class TesterFull {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		boolean exit=false;
		int ch, uname;
		double amt;
		String pass;
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		//Account creation loop
		while(!exit) {
			try {
				System.out.println("Account creation menu");
				System.out.println("1.Create account \n0.Exit");
				ch=sc.nextInt();
				
				if(ch==1) {
					System.out.println("Enter account details");
					System.out.println("accnum, pin, custname, acctype, accbal, crtdate");
					BankAccount tmp = validateAllDetails(accounts, sc.nextInt(), sc.next(), sc.next(), sc.next(),
							sc.nextDouble(), sc.next());	
					accounts.add(tmp);
					System.out.println("Account successfully created");
				}
				
				else if(ch==0) {
					System.out.println("Exiting account creation");
					exit=true;
				}
				
				else
					System.out.println("Wrong input. Try again");	
				System.out.println();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		
		//Login menu
		exit=false;
		while(!exit) {
			try {
				System.out.println("Net Banking");
				System.out.println("1.Login \n0.Exit");
				ch=sc.nextInt();
				
				if(ch==1) {
					System.out.print("Enter Account ID: ");
					uname = sc.nextInt();
					System.out.print("Enter Password: ");
					pass = sc.next();
					int logindex = validateCredentials(accounts, uname, pass);
					BankAccount current = accounts.get(logindex);
					System.out.println("Successfully logged in. Welcome "+ current.getName());
					
					boolean login=true;
					while(login) {
						try {
							System.out.println("\n1.Deposit amount \n2.Withdraw amount"
									+ "\n3.Fund transfer \n4.Close account"
									+ "\n5.Log out");
							int choice=sc.nextInt();
							
							switch(choice) {
							
							case 1:
									System.out.println("Depositing");
									System.out.print("Enter amount to be deposited: ");
									amt=sc.nextDouble();
									current.deposit(amt);
									System.out.println("Current balance="+current.getBalance());
									break;
							
							case 2:
									System.out.println("Withdrawing");
									System.out.print("Enter amount to be withdrawn: ");
									amt=sc.nextDouble();
									validateBal(current,amt);
									current.withdraw(amt);
									System.out.println("Current balance="+current.getBalance());
									break;
									
							case 3:
									System.out.println("Money transfer");
									System.out.print("Enter beneficiary account number: ");
									uname=sc.nextInt();
									int index = validateBenNumber(accounts, uname);
									BankAccount beneficiary = accounts.get(index);
									System.out.print("Enter amount to be trasnfered: ");
									amt=sc.nextDouble();
									validateBal(current,amt);
									current.withdraw(amt);
									System.out.println("Sender balance="+current.getBalance());
									beneficiary.deposit(amt);
									System.out.println("Recepient balance="+beneficiary.getBalance());
									break;
									
							case 4:
									System.out.println("Closing account");
									System.out.println("All your account information will be erased."
											+ " Are you sure you want to continue?(Y/N)");
									char option=sc.next().charAt(0);
									if(option=='Y' || option=='y') {
										int ind=accounts.indexOf(current);
										accounts.remove(ind);
										System.out.println("Account terminated");
										login=false;
									}
									break;
									
							case 5: 
									System.out.println("Logging out");
									login=false;
									break;
									
							default:
									System.out.println("Invalid choice. Try again");
									break;
							}
						}catch(Exception e) {
							e.printStackTrace();
						}
					
					}
				}
				else if(ch==0)
					System.out.println("Exiting program");
					exit=true;
			}catch(InvalidLoginCredentials e) {
				e.printStackTrace();
			}
		}
		
	sc.close();
	}
	
}