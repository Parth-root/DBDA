package cust_exception;

public class InvalidBook extends Exception{
	
	private static final long serialVersionUID = 1L;

	public InvalidBook(String msg) {
		super(msg);
	}

}
