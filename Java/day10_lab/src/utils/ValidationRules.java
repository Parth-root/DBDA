package utils;
import exceptions.*;
import banking.*;

import java.time.LocalDate;
import java.util.ArrayList;;

public class ValidationRules {
	public static final double MIN_BAL;
		
		static {
			MIN_BAL=2000;
		}
		
		public static BankAccount validateAllDetails(ArrayList<BankAccount> accounts, int num, String pin,
				String name, String type, Double bal, String date) throws Exception{
			int validnum = validateNumber(accounts, num);
			double validbal = validateOpenBal(bal);
			Account validact = validateAcc(type);
			return new BankAccount(validnum, pin, name, validact, validbal, LocalDate.parse(date));
		}
		
		public static int validateNumber(ArrayList<BankAccount> accounts, int num) throws DuplicateAccountNumberException {
			BankAccount temp=new BankAccount(num);
			if(accounts.contains(temp))
					throw new DuplicateAccountNumberException("Account number already exists");	
			return num;
		}
		
		public static double validateOpenBal(double amt) throws InvalidOpeningBalanceException{
			if(amt<MIN_BAL)
				throw new InvalidOpeningBalanceException("Opening balance has to be greater than minimum balance");	
			return amt;
		}
		
		public static Account validateAcc(String acc) {
			return Account.valueOf(acc.toUpperCase());
		}
		

		public static int validateCredentials(ArrayList<BankAccount> accounts, int num, String pass) 
				throws InvalidLoginCredentials {
			BankAccount temp=new BankAccount(num);
			if(accounts.contains(temp)) {
				int index=accounts.indexOf(temp);
				temp=accounts.get(index);
				if((temp.getPIN()).equals(pass))
					return accounts.indexOf(temp);
			}
			throw new InvalidLoginCredentials("Invalid login credentials. Try again");
		}
		
		public static void validateBal(BankAccount obj, double amt) throws InsufficientBalanceTypeException{
			double temp=obj.getBalance();
			temp-=amt;
			if(temp<MIN_BAL)
				throw new InsufficientBalanceTypeException("Account balance will be less than minimum balance");	
		}
		
		public static int validateBenNumber(ArrayList<BankAccount> accounts, int num) throws AccountNotExistException {
			BankAccount temp=new BankAccount(num);
			if(accounts.contains(temp)) 
				return accounts.indexOf(temp);		
			throw new AccountNotExistException("Account number doesn't exist");
		}
}
