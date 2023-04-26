package utils;
import exceptions.InvalidAccountTypeException;
import exceptions.DuplicateAccountNumberException;
import exceptions.InsufficientBalanceTypeException;
import banking.BankAccount;

public class ValidationRules {
	public static final double MIN_BAL;
		
		static {
			MIN_BAL=2000;
		}
		
		
		public static long validateNumber(BankAccount[] accounts, long num) throws DuplicateAccountNumberException {
			BankAccount temp=new BankAccount(num, null, null, 0);
			for(BankAccount acct : accounts) {
				if(acct!=null) {
					if(temp.equals(acct))
						throw new DuplicateAccountNumberException("Account number already exiists");
				}
			}
			return num;
		}
		
		public static void validateBal(BankAccount obj, double amt) throws InsufficientBalanceTypeException{
			double temp=obj.getBalance();
			temp-=amt;
			if(temp<MIN_BAL)
				throw new InsufficientBalanceTypeException("Account balance will be less than minimum balance");	
		}
		
		
		public static void validateType(String type) throws InvalidAccountTypeException {
			String[] accounts = {"SAVINGS","CHECKING","LOAN","FD"};
			boolean match=false;
			
			for(String types : accounts) {
				if(type.equals(types))
					match=true;
			}
			
			if(!match)
				throw new InvalidAccountTypeException("Invalid account type");
		}
}
