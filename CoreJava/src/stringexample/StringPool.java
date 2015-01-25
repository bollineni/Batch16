package stringexample;

import classexample.Person;

public class StringPool {

	public static void main(String[] args) {
		String iphone1 = "Iphone5";
//		String iphone2 = "Iphone5";
//		String iphone4 = "Iphone5";
//		String iphone3 = new String("Iphone5");
		
//		iphone1 = "IphoneFive";
//		StringBuffer numbers = new StringBuffer();
		StringBuilder numbers = new StringBuilder();
		for(int i = 0 ; i < 10; i++) {
			numbers.append(i);
		}
		System.out.println(numbers);
	}
	// blank , 0 , 01 , 012 , 
}
