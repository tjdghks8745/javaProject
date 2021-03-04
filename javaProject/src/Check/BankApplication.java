package Check;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArry = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (true) {
			System.out.println("===============================================");
			System.out.println("1. 계좌생성 / 2. 계좌목록 / 3. 예금 / 4. 출금 / 5. 종료");
			System.out.println("===============================================");
			System.out.println("선택> ");

			int SelectNo = scanner.nextInt();

			if (SelectNo == 1) {
				createAccount();
			} else if (SelectNo == 2) {
				accountList();
			} else if (SelectNo == 3) {
				deposit();
			} else if (SelectNo == 4) {
				withdraw();
			} else if (SelectNo == 5) {
				run = false;
			}
		}
	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int money = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, money);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
	}

	private static void accountList() {

	}

	private static void deposit() {

	}

	private static void withdraw() {

	}

}
