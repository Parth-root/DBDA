package exceptions;

@SuppressWarnings("serial")
public class DuplicateAccountNumberException extends Exception {
	public DuplicateAccountNumberException(String message) {
		super(message);
	}
}

