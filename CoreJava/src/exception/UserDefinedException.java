package exception;

public class UserDefinedException extends Exception {
	private String message;
	
	public UserDefinedException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Exception is ======" + message;
	}
}

class UDRuntime extends RuntimeException{
	
}
