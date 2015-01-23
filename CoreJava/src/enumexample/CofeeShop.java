package enumexample;

public class CofeeShop {
	
	public void serverCoffee (CoffeeType ct){
		System.out.println("I am serving you Cofee with " + ct.getValue());
		if(ct.getValue() == 1) {
			System.out.println("Small Coffee");
		} else if(ct == CoffeeType.MEDIUM) {
			System.out.println("Medium Coffee");
		}else if(ct == CoffeeType.LARGE) {
			System.out.println("Large Coffee");
		}
//		else {
//			System.out.println("Unknown size..");
//		}
		
	}
}
