package custom_ordering;

import java.util.Comparator;
import banking.BankAccount;

public class AccountBalanceComparator implements Comparator<BankAccount>{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		if(o1.getBalance()<=o2.getBalance())
			return -1;
		return 1;
	}

}
