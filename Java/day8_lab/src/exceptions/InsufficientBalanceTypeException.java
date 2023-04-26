package exceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceTypeException extends Exception{
	public InsufficientBalanceTypeException(String message) {
		super(message);
	}
}
