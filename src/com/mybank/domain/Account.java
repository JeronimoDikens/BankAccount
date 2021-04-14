package com.mybank.domain;

public class Account {

	protected double balance;
	
	protected Account (double initBalance) {
		balance = initBalance;
	}
	public double getBalance () {
		return balance;
	}
	
	public boolean deposit (double amt) {
		balance += amt;
		return balance > 0;
	}
	
	public boolean withdraw (double amt) {
		balance -= amt;
		return balance > 0;
	}
	
}
