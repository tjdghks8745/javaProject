package objects;

public class CalExample {
	public static void main(String[] args) {
		System.out.println(getSum(40, 50));
		System.out.println(getAverage(40, 50));
		Student s = new Student("박소연" , 87, 92);
		showInfo(s);
	}

	public static void showInfo(Student st) {
		System.out.println("이름: " + st.getName());
		System.out.println("합계점수: " + getSum(st.getEng(), st.getMath()));
		System.out.println("평균점수: " + getAverage(st.getEng(), st.getMath()));
	}

	public static int getSum(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	public static double getAverage(int a, int b) {
		int sum = a + b;
		double avg = sum / 2.0;
		return avg;
	}
}
