package exceptions;

@SuppressWarnings("serial")
public class InvalidColorException extends Exception {
	
	public InvalidColorException(String message) {
		super(message);
	}
}
