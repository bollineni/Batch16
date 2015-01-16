package array;

public class ArrayExample {

	public static void main(String[] args) {
		int ages[] = {10,20,30};
//		System.out.println(ages[3]);
		
		int [] marks = new int[5];
		marks[0] = 50;
		marks[4] = 60;
		marks[5] = 60;
		
		for (int mark : marks) {
			System.out.println(mark);
		}
		
		String [] names = {"NameOne","NameTwo","NameThree"};
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}