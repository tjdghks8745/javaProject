package references;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("================================================================================");
			System.out.println("1. 학생수" + "/" + "2. 점수입력" + "/" + "3.점수리스트" + "/" + "4.분석" + "/" + "5. 종료");
			System.out.println("=================================================================================");
			System.out.print("선택> ");

			int No = scn.nextInt();

			if (No == 1) {
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				System.out.println("학생수>" + scores.length);
			} else if (No == 2) {
				for (int i = 0; i< scores.length; i++) {
					System.out.println(i + ">");
					scores[i] = scn.nextInt();
				}
			} else if (No == 3) {
				//
			} else if (No == 4) {
				//
			} else if (No == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
