package homework;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int sudentNum = 0;
		int num = 3;

		while (true) {
			System.out.println("====================================================================");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7. 수학평균점이상 9.종료");
			System.out.println("====================================================================");
			System.out.println("선택 >");

			int menu = scn.nextInt();
// 1) 이미 입력한 경우에는 이미 입력했습니다. 라는 메세지를 보여주고 메뉴를 화면에 보여주기 기능.
			if (menu == 1) {
// 1. 학생 수를 입력 받아서
				if (sudentNum != 0) {
					System.out.println("이미 입력 했습니다.");
				} else {
					System.out.println("학생수는 ?");
					sudentNum = scn.nextInt();
					students = new int[sudentNum][num];
				}
			} else if (menu == 2) {
// 1-1. 학생번호에 따라 영어, 수학 점수를 저장하세요.
				if (students[0][1] != 0) {
					System.out.println("이미 입력 했습니다.");
				} else {

					int S = 0;
					int ES = 0;
					int MS = 0;
					for (int i = 0; i < students.length; i++) {
						System.out.print("학생번호> ");
						S = scn.nextInt();
						students[i][0] = S;
						System.out.print("영어점수> ");
						ES = scn.nextInt();
						students[i][1] = ES;
						System.out.print("수학점수> ");
						MS = scn.nextInt();
						students[i][2] = MS;
					}
				}
			} else if (menu == 3) {
// 2. 입력한 값의 리스트를 학생번호 - 영어 / 수학 점수의 순으로 보여주는 코드를 작성하세요.
				for (int i = 0; i < students.length; i++)
					System.out.println(
							"학생정보 - 번호:" + students[i][0] + " 영어점수> " + students[i][1] + " 수학점수> " + students[i][2]);
			} else if (menu == 4) {
// 3. 학생번호를 입력하면 학생의 영어, 수학점수(또는 합계점수와 평균점수)를 보여주는 기능을 작성하세요.
				System.out.println("찾고자 하는 학생번호 입력> ");
				int student = 0;
				student = scn.nextInt();
				for (int i = 0; i < students.length; i++) {
					if (student == students[i][0]) {
						System.out.println(
								"학생정보 - 번호:" + students[i][0] + " 영어:" + students[i][1] + " 수학:" + students[i][2]);
					}
				}
			} else if (menu == 5) {
// 4. 영어점수가 가장 높은 학생번호와 점수를 보여주는 기능을 구현하세요.
				int M = 0;
				int MaxS = 0;
				for (int i = 0; i < students.length; i++) {
					if (M < students[i][1]) {
						M = students[i][1];
						MaxS = students[i][0];
					}
				}
				System.out.println("영어최고점: 학생번호 - " + MaxS + " 영어 : " + M);
			} else if (menu == 6) {
// 5. 합계점수가 가장 높은 학생번호와 평균을 보여주는 기능을 작성하세요.
				double sum = 0;
				double MSum = 0;
				double avg = 0;
				int MStudent = 0;
				for (int i = 0; i < students.length; i++) {
					for (int j = 1; j < students[i].length; j++) {
						sum += students[i][j];
						if (MSum < sum) {
							MSum = sum;
							avg = sum / 2;
							MStudent = students[i][0];
						}
					}
					sum = 0;
				}
				System.out.println("학생번호: " + MStudent + " 평균점수: " + avg);
			} else if (menu == 7) {
// 6. 수학점수가 수학평균점수 이상인 학생의 번호와 수학점수를 보여주도록 코드를 작성하세요.
				double MSum = 0;
				for (int i = 0; i < students.length; i++) {
					MSum += students[i][2];
				}
				System.out.println("평균점수:" + MSum / students.length);
				for (int i = 0; i < students.length; i++) {
					if (MSum / students.length < students[i][2]) {
						System.out.println("학생번호: " + students[i][0] + ", 수학점수: " + students[i][2]);
					}
				}
			} else if (menu == 9) {
				break;
			}

		}
		System.out.println("프로그램 종료.");
	}
}
