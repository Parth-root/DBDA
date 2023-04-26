package custom_exceptions;

@SuppressWarnings("serial")		//Compile time annotation to tell javac to suppress warnings
public class SpeedOutOfRangeException extends Exception{

	public SpeedOutOfRangeException(String message) {
		super(message);			//Invokes super class(Exception) constructor 
								//to create the Exception with error message
	}
		
}
