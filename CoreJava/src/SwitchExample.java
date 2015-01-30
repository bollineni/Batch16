import inheritance.NonITEmployee;

public class SwitchExample {
	public static void main(String[] args) {
		System.out.println("Hello, Word!"); 
		int age = Integer.parseInt(args[0]);
		int mark = Integer.parseInt(args[1]);
		
		if(age == 5) {
			System.out.println("age is 5 with mark :" + mark);
		}else if(age == 6) {
			System.out.println("age is 6 with mark :" + mark);
		}else if(age == 7) {
			System.out.println("age is 7 with mark :" + mark);
		}else {
			System.out.println("Not sure of the age");
		}
		
		switch (age) {
		case 5:
			System.out.println("I am 5");
			break;
		case 6:
			System.out.println("I am 6");
			break;
		case 7:
			System.out.println("I am 7");
			break;	
		default:
			System.out.println("Not sure");
			break;
		}
		NonITEmployee nonItEmp = new NonITEmployee("Roja", 104);
		nonItEmp.efficientNonItEmp();
		nonItEmp.wearTie();
	}
}