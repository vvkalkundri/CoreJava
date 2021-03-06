package com.java.threads;

public class SynchroniseIssue implements Runnable {
	private Account account = new Account();

	public static void main(String[] args) {
		SynchroniseIssue si = new SynchroniseIssue();
		Thread one = new Thread(si);
		Thread two = new Thread(si);
		one.setName("Vijay");
		two.setName("Anitha");

		one.start();
		two.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(" The current balance in the account is : " +account.getBalance()) ;
			withDrawMoney(10);
			if (account.getBalance() < 0) {
				System.out.println("The account is over drawn");
			}
			System.out.println("--------------------------------------------------------");

		}
	}

	private synchronized  void withDrawMoney(int i) {
		if (account.getBalance() >= i) {
			System.out.println(Thread.currentThread().getName()
					+ " is going to withdraw ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			account.withdrawal(i);
			System.out.println(" The " + Thread.currentThread().getName()
					+ " is going to withdraw" + i + " ruppees");

		} else {
			System.out.println("Not enough money in the account for  "
					+ Thread.currentThread().getName()
					+ " to withdraw from the account");
		}
	}
}

class Account {
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void withdrawal(int amount) {
		balance = balance - amount;
	}

}
