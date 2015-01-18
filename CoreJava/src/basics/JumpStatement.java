package basics;

 /**
 * @author Jayram Rout
 * This is class is about jump statement
 *
 */
public class JumpStatement {
	String Name = "";
	String name = "";
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2)
//				continue;
//				break;
			System.out.println(i);
			callToPrint(i);
		}
	}
	
	/**
	 * This method is used to print the index Value
	 * @param i
	 */
	public static void callToPrint(int i){
		System.out.println("Value is "+ i);
	}
}