package exception;

public class ExceptionClient {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		try {
			calculateValue(3, 0);
		} catch (UserDefinedException e) {
			System.out.println(e);
		}
		ExceptionClient.divideValues(3,4);
		Computer comp = null;
		try {
			printDetails(comp);
		} catch (UserDefinedException e) {
			e.printStackTrace();
		}
		divideValues(3,4);
	}
	
	public static int calculateValue(int a , int b) throws UserDefinedException {
		if(b == 0) {
			throw new UserDefinedException("Cannot Divide by Zero");
		}
		return a / b;
	}
	
	public static void printDetails(Computer comp) throws UserDefinedException {
		if(comp == null) {
			throw new UserDefinedException("Cannot have a NULL Computer");
		}
		System.out.println(comp.getModel() + " " + comp.getName());
	}
	
	public static int divideValues(int a , int b) throws ArithmeticException {
		return a/b;
	}
}
