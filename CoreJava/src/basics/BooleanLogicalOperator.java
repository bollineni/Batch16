package basics;
public class BooleanLogicalOperator {
	// int b = 20; // instance variable
	static int c = 300; // class variable

	public static void main(String[] args) {
		int a = 10; // local variable
		int b = 10; // 
		int c = 30;
		System.out.println(a == b);
		System.out.println(((a == b) && (b >= c)));
		/*
		 * short circuit && : it check if the left condition is true it goes 
		 * and checks for the right hand side also.
		 * but if left condition is false it will not chk the right condtion.
		 * 
		 * logical and & : even ur left hand side is false , it will chk 
		 * the right hand side.
		 */
		/*
		 *short circuit OR || : in this case if left condtion is true , it will
		 *not go and chk the rigth hand side.
		 *but left is false it will go and chk for the right hand side. 
		 *
		 *Logical OR | : if left is true , then also it will go and chk the
		 *right hand side.
		 */
		
		if ((a == b) && (b >= c)){
//		if ((a == b) || (b >= c)){
			System.out.println("I am successfull");
		} else {
			System.out.println("Both are diff.");
			System.out.println("Both are diff again....");
			System.out.println("Both are diff again....");
		}
		
		String name = (a == b) ? "ValueA" : "ValueB";
		System.out.println(name);
		
		String name2 = "";
		 //
		if(a==b){
			name2 = "ValueA";
		}else {
			name2 = "ValueB";
		}
		
		System.out.println(name2);
	}
}