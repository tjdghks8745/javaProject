package contrls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade = "F";
		int score = 75;

		// if구문과
		// 90점 이상 > A
		// 80점 이상 > B
		// 70점 이상 > C
		// etc. > F

		// 점수는 85는 B 입니다.

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade = "A+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = "B+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade = "C+";
			}
		} else {
			grade = "F";
		}
		System.out.println("등급은 = " + grade);
	}
}