package inheritance;

public class PolymorphismClient {

	public static void main(String[] args) {
		/*JavaProgrammer jprog = new JavaProgrammer("Jay", 345);
		jprog.coreJavaSkills();
		jprog.totalTime();

		ITEmployee javaItEmp = new JavaProgrammer("Anand", 345);
		javaItEmp.totalTime();*/
		// javaItEmp.coreJavaSkills(); // You cannot access the method using
		// super class reference

		Singable sing = new JavaProgrammer("Krish", 400);
		// sing.singingSkills();
		printSingingBehaviour(sing);
		sing = new DesktopAdmin("Aktar", 401);
		// sing.singingSkills();
		printSingingBehaviour(sing);
		
		Swimmable swim = new JavaProgrammer("Krish", 400);
		swim.swim();
		
		swim.toString();
	}

	public static void printSingingBehaviour(Singable sing) {
		sing.singingSkills();
	}
	
	public static void printSingingBehaviour(Swimmable swim) {
		swim.swim();
	}
}
