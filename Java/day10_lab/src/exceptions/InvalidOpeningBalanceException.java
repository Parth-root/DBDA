package exceptions;

@SuppressWarnings("serial")
public class InvalidOpeningBalanceException extends Exception {
	
	public InvalidOpeningBalanceException(String message) {
		super(message);
	}

}
