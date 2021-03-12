package sihum;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] studentt = null;
		int menu = 0;
		Student[] stu = new Student[4];

		while (true) {
			System.out.println("===============================");
			System.out.println("1.등록 2.수정 3.삭제 4.리스트 9.종료");
			System.out.println("===============================");
			System.out.print("선택> ");
			menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("학생이름을 입력하세요> ");
				String student = scn.nextLine();
				scn.nextLine();
				System.out.print("학년을 입력하세요> ");
				int gread = scn.nextInt();
				System.out.print("점수를 입력하세요> ");
				int score = scn.nextInt();

				Student stud = new Student(student, gread, score);
				int a = 0;
				stu[a] = stud;
				System.out.println("등록되었습니다.");

			} else if (menu == 2) {
				System.out.println("수정 할 학생 이름을 입력 하세요>");
				String name = scn.nextLine();

			} else if (menu == 3) {
				System.out.println("삭제 할 학생 이름을 입력 하세요 >");
				String name = scn.nextLine();

			} else if (menu == 4) {
				for (int i = 0; i < 4; i++) {
					stu[i].showInfo();
					System.out.println("\n");
				}
			} else if (menu == 9) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
