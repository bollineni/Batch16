package thread.sync;

public class AccountClient {

	public static void main(String[] args) {
		Runnable atm = new ATMCard();
		
		Thread hero =  new Thread(atm,"Hero");
		hero.start();
		
		Thread heroine =  new Thread(atm,"Heroine");
		heroine.start();
	}
}