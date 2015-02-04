package exception;

import classexample.Person;
public class ExceptionExample {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 3;
		
		int age[] = {12,14,56,79,89};
		System.out.println("Multiplication ="+(c*b));
		
		try{
			System.out.println("Div ="+ (c/a));
			System.out.println("Fetch an index"+ age[c]);
			String str = null;
			str.toLowerCase();
			
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException er){
//			exp.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception exp) {
			System.out.println("Got an Exception...");
		}
		/*catch(NullPointerException npp) {
			System.out.println("NullPointerException");
		}*/
		
		System.out.println("I m finally Done....");
	}
}