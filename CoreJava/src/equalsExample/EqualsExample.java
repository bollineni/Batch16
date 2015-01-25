package equalsExample;

public class EqualsExample {

	public static void main(String[] args) {
		Phone one = new Phone("iphone", "6");
		Phone two = new Phone("iphone", "6");
		
		System.out.println(one.equals(two));
		
//		String str1 = new String("Iphone6");
//		String str2 = new String("Iphone6");
//		
//		System.out.println(str1.equals(str2));
	}

}
