package thread.sync;

public class ATMCard implements Runnable {
	private Account acct = new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("Account is OverDrawn...");
			}
		}
	}

	private void makeWithdrawal(int amt) {
		synchronized (this) {

			if (acct.getBalance() >= amt) {
				System.out.println(Thread.currentThread().getName()
						+ " is going to withdraw money");
				acct.withdraw(amt);
				System.out.println(Thread.currentThread().getName()
						+ " has withdrawn " + amt + " Present balance is "
						+ acct.getBalance());
			} else {
				System.out.println("Not enough in account for "
						+ Thread.currentThread().getName() + " to withdraw "
						+ acct.getBalance());
			}
		}

	}
}