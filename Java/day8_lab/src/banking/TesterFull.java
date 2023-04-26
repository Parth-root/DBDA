package banking;
import java.util.Scanner;

import exceptions.*;
import static utils.ValidationRules.*;

public class TesterFull {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		int k=0, count, index, ind1, ind2;
		long num;
		double bal, amt;
		String name, type;
		
		System.out.print("Enter the number of accounts to be created: ");
		BankAccount[] accts = new BankAccount[sc.nextInt()];
			
			while(k<accts.length) {
				try {
					System.out.print("Account Number: ");
					num=sc.nextLong();
					num=validateNumber(accts,num);
					System.out.print("Customer Name: ");
					name=sc.next();
					System.out.print("Account Type: ");
					type=sc.next();
					validateType(type);
					System.out.print("Account Balance: ");
					bal=sc.nextDouble();
					accts[k++]=new BankAccount(num,name,type,bal);
				}catch(Exception e) {
					e.printStackTrace();	
					sc.nextLine();
				}
			}
			
			do {
				try {
					System.out.println("\n1.Display details of all accounts"
							+ "\n2.Display details of specific account"
							+ "\n3.Compare two accounts"
							+ "\n4.Deposit amount \n5.Withdraw amount"
							+ "\n5.Exit");
					
						switch (sc.nextInt()) {
						case 1:
								System.out.println("Details of all accounts");
								count=1;
								for(BankAccount act : accts)
									System.out.println("Account"+(count++)+"\n"+act);
								break;
						
						case 2:
								System.out.println("Details of specific account");
								System.out.print("Enter account index: ");
								index=sc.nextInt()-1;
								System.out.println(accts[index]);
								break;
							
						case 3:
								System.out.println("Comparing accounts");
								System.out.print("Enter 1st account index: ");
								ind1=sc.nextInt()-1;
								System.out.print("Enter 2nd account index: ");
								ind2=sc.nextInt()-1;
								if(accts[ind1].equals(accts[ind2]))
									System.out.println("Same accounts");
								else
									System.out.println("Different accounts");
								break;
								
						case 4:
								System.out.println("Depositing");
								System.out.print("Enter account index: ");
								ind1=sc.nextInt()-1;
								System.out.print("Enter amount to be deposited: ");
								amt=sc.nextDouble();
								accts[ind1].deposit(amt);
								break;
							
						case 5:
								System.out.println("Withdrawing");
								System.out.print("Enter account index: ");
								ind1=sc.nextInt()-1;
								System.out.print("Enter amount to be withdrawn: ");
								amt=sc.nextDouble();
								validateBal(accts[ind1],amt);
								accts[ind1].withdraw(amt);
								break;
						
						case 6:
								System.out.println("Program terminated");
								System.exit(0);
								break;
							
						default:
								System.out.println("Wrong input. Try again");
								break;
						}
				
				}catch(InsufficientBalanceTypeException e) {
					e.printStackTrace();
				}
				
				System.out.println("Do you want to continue?(Y/N)");
				ch=sc.next().charAt(0);
			}while(ch=='y' || ch=='Y');
			
		
	}
	
}