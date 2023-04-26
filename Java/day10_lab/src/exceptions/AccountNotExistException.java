package exceptions;

@SuppressWarnings("serial")
public class AccountNotExistException extends Exception {
	
	public AccountNotExistException(String message) {
		super(message);
	}
	
}
