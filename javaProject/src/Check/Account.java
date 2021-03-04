package Check;

public class Account {
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	int balance;

	public int getBalance() {
		
	}

	public void setBalance(int balance) {
		if (MIN_BALANCE > balance) {
			this.balance = 10000;
		} else if (balance > MAX_BALANCE) {
			this.balance = 10000;
		}
	}
}
