package Check;

public class Account {
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	int balance;

	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		if (balance <= MAX_BALANCE && balance >= MIN_BALANCE)
			return balance;
		return balance;
		}
}
