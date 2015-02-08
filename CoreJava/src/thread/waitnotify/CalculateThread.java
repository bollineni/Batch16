package thread.waitnotify;

public class CalculateThread {

	public static void main(String[] args) {
		CalculatorThread calculator = new CalculatorThread();
		calculator.start();
		
		synchronized(calculator) {
			try{
				calculator.wait();
			}catch(InterruptedException exp) {
				exp.printStackTrace();
			}
		}
		System.out.println("Total value from Main = " + calculator.total);
	}
}

class CalculatorThread extends Thread {
	int total;
	@Override
	public void run() {
		synchronized(this) {
			for(int i=0 ; i < 3 ; i++) {
				total +=i;
				System.out.println("Calcuating....");
			}
			notify();	
		}
	}
}
