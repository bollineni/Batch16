package thread.waitnotify;

public class WaitNofityAll {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();

		calculator.start();
	}
}

class Reader extends Thread {
	Calculator calc;

	public Reader(Calculator calc) {
		this.calc = calc;
	}

	@Override
	public void run() {
		synchronized (calc) {
			try {
				System.out
						.println("I am waiting for the calcuator to finish...");
				calc.wait();
			} catch (InterruptedException exp) {
				exp.printStackTrace();
			}
			System.out.println("Total value from Main = " + calc.total);
		}
	}
}

class Calculator extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				total += i;
				try {
					System.out.println("Calculating....");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notifyAll();
		}
	}
}