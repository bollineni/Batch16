package array;

public class LoopExample {

	public static void main(String[] args) {
		int age1 = 10;
		int age2 = 20;
		int age3 = 30;
		
//		printAges(age1);
//		printAges(age2);
//		printAges(age3);

		String name1 = "Name1";
		String name2 = "Name2";
		String name3 = "Name3";
		
		int ages[] = {10,20,30};
		
		System.out.println(ages.length);
		
		for(int i = 0 ; i< ages.length ; i++) {
			System.out.println("AGE IS : "+ages[i]);
		}
		
		for(int age : ages) {
			System.out.println("Enhanced For Loop: "+age);
		}
		
		int ageInx = 0;
		while(ageInx < ages.length) {
			System.out.println("For While Loop: "+ages[ageInx++]);
		}
		
		int ageDoInx = 0;
		
		do {
			System.out.println("For Do While Loop: "+ages[ageDoInx++]);
		} while (ageDoInx < ages.length);
		
		for(;;) {
			System.out.println();
		}
		
		/*while(true) {
			
		}*/
		
		
		
//		System.out.println("AGE IS : "+ages[0]);
//		System.out.println("AGE IS : "+ages[1]);
//		System.out.println("AGE IS : "+ages[2]);
		
//		printAges(age1);
		
//		System.out.println("AGE IS : "+age);
//		forLoopExample();
		
	}
	
	public static void printAges(int age) {
		System.out.println("AGE IS : "+age);
	}
	
	/*public static void printAllAge(int[] age) {
		System.out.println("AGE IS : "+age);
	}*/
	
	public static void forLoopExample() {
		for(int i = 0 ; i < 5; i++) {
			System.out.println(i);
		}
	}
}
