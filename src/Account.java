
public class Account {

	private double balance;
	
	public Account (double initBalance) {
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
