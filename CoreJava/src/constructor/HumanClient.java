package constructor;

public class HumanClient {

	public static void main(String[] args) {
		HumanClient client  = new HumanClient();
		int a = 2;
		int b = 3;
		System.out.println("Before a = "+ a +" b = "+ b);
		client.add(a, b);
		System.out.println("After a = "+ a +" b = "+ b);
		// Alt + Shift +X  : J
		Human jay = new Human("Jay",6);
		System.out.println("Before "+ jay.getName() + " " + jay.getHeight());
		client.printHumanDetails(jay);
		System.out.println("After "+ jay.getName() + " " + jay.getHeight());
	}

	public void printHumanDetails(Human human) {
		System.out.println("Inside "+ human.getName() + " " + human.getHeight());
		human.setName("Ram");
		human.setHeight(5);
	}
	
	public void add(int a , int b) {
		a += 1;
		b += 1;
		System.out.println(a+b);
	}
}
