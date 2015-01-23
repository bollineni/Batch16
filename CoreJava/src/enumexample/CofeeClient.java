package enumexample;

public class CofeeClient {
	public static final String CONSTANT  =  "VALUE";
	
	public static void main(String[] args) {
		CofeeShop cs = new CofeeShop();
		
		cs.serverCoffee(CoffeeType.LARGE);
	}
}