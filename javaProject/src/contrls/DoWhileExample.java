package contrls;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		//System.in.read();
		//Scanner.readline();
		Scanner scn = new Scanner(System.in); //사용자가 입력한 값을 받아오는 클래스
		System.out.println("값을 입력.");
		String str = scn.nextLine();
		System.out.println("입력한 값은 :" + str);
		boolean run = true;
		
		do {
			System.out.println(">");
			str = scn.nextLine(); // 읽어드린 값을 str 저장
			System.out.println(">>> " + str);
//			if(str.equals("q")) {
//				run = false;
//			}
		} while (!str.equals("q"));
		System.out.println("프로그램 종료");
	}
	
}
