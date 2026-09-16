package org.ycpaitbankapp.entity;

public class Account {
	
	//Fields
	private int balance;
	
	
	
	//Constructor
	public Account(int balance) {
		this.balance = balance;
	}
	//Getter 
	public int getBalance() {
		return balance;
	}

	//Withdraw Method
	synchronized public void withdraw(int amount) {
		System.out.println(this.balance + "Check Balance by " + Thread.currentThread().getName());
		this.balance = balance - amount;
		try {
			//wait();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.balance + "Check Balance by " + Thread.currentThread().getName());
	}
	
	//Deposit Method
	synchronized public void deposit(int amount) {
		System.out.println(this.balance + "Check Balance by " + Thread.currentThread().getName());
		this.balance = balance + amount;
		System.out.println(this.balance + "Check Balance by " + Thread.currentThread().getName());
		notify();
	}
}
