package exceptions;

@SuppressWarnings("serial")
public class OutDatedManufacturingDateException extends Exception {
	
	public OutDatedManufacturingDateException(String message) {
		super(message);
	}
}
