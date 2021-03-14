package exceptions;

public class CustomException extends RuntimeException {

	public CustomException() {
		this("Custom");
	}
	
	public CustomException(String name) {
		super(name + " exception");
	}
}
