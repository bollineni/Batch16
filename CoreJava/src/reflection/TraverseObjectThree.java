package reflection;

public class TraverseObjectThree {

	public static void main(String[] args) {
		String name = "java.lang.String";
		ReflectionOne refOne = new ReflectionOne();
//		System.out.println(name.getClass());
//		System.out.println(name.getClass().getClass());
//		System.out.println(name.getClass().getClass().getClass());
		
//		traverse(refOne);
		infiniteForLoop();
		
		String nameOne = "hello"; // new String("hello")
		String nameOne1 = "hello";
		
		String oo1 = new String("hello");// new String("hello")
		String oo2 = new String("hello");// new String("hello")
		
	}
	
	public static void traverse(Object obj) {
		for(int i = 0 ; ; obj = obj.getClass()) {
			System.out.println("Level "+ (++i) + " : " + obj +".getClass()= "+ obj.getClass());
			if(obj == obj.getClass()) break;
		}
	}
	
	public static void infiniteForLoop(){
		for(;;) {
			System.out.println("============");
		}
	}
}
