package classexample;

public class FinalizeExample {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 500000 ; i++) {
			new Person("Person"+i);
		}
	}
}