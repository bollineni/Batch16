package thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATMCard implements Runnable {
	private Account acct = new Account();
	private Lock accountLock;

	public ATMCard() {
		accountLock = new ReentrantLock();
	}

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
	// We can synchronize method or synchronized block or ReentrantLock::lock() as shown below
//	private synchronized void makeWithdrawal(int amt) {
//		synchronized(this)
		accountLock.lock();
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			accountLock.unlock();
		}
	}
}