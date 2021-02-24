package contrls;

public class Morning0224 {
	public static void main(String[] args) {
		int E = (int) (Math.random() * 100) + 1;
		int M = (int) (Math.random() * 100) + 1;
		String result = getAverage(E, M);
		System.out.println(result);
	}

	public static String getAverage(int n1, int n2) {
		int A = 2 / (n1 + n2);
		String grade = "";

		if (A >= 90) {
			grade = "수";
		} else if (A >= 80) {
			grade = "우";
		} else if (A >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		return grade;
	}
}
