package custom_exception;

@SuppressWarnings("serial")
public class InvalidVehicleDetailsException extends Exception {
	public InvalidVehicleDetailsException(String mesg) {
		super(mesg);
	}
}
