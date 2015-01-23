package classexample;

public class ClassVariableExample {

	public static void main(String[] args) {
//		System.out.println(Person.count);
		
		new Person("One");
		new Person("Two");
		new Person("Three");
		
		System.out.println(Person.count);
		ClassVariableExample cve = new ClassVariableExample();
		cve.callMe();
		ClassVariableExample.callMe();
		callMe();
	}

	public static void callMe(){
		System.out.println("Calling me...");
//		callMeAgain();
	}
	
	public void callMeAgain(){
		System.out.println("Calling me...again");
	}
}
