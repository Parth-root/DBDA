package exceptions;

@SuppressWarnings("serial")
public class InvalidLoginCredentials extends Exception {
	
	public InvalidLoginCredentials(String message) {
		super(message);

	}
}
