package custom_exceptions;

@SuppressWarnings("serial")
public class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String errMesg) {
		super(errMesg);
	}
}
