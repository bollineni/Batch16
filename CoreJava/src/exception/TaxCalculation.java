package exception;

import classexample.Person;
public class TaxCalculation {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int age[] = {12,14,56,79,89};
		System.out.println("Addition = "+(a+b));
		
		try{
			System.out.println("I am in the try block...");
			System.out.println("Div ="+ (c/a));
			// open up a connection to do some operation
			// reading the values from a file
			// closing the connection
		}catch(Exception exp){
//			exp.printStackTrace();
			System.err.println("I am in the Error block");
//			System.out.println("Div ="+ 4);
		}finally{
			// close the connection
			System.out.println("I m in the finally block");
		}
		
		
		System.out.println("Fetch an index"+ age[c]);
		System.out.println("Multiplication ="+(c*b));
		
		Person per = null;
		System.out.println(per.getName());
	}
}