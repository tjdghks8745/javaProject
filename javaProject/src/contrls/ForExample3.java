package contrls;

public class ForExample3 {
	public static void main(String[] args) {
			for(int i = 2; i <= 9; i++) {
				showResult(i);
			}
	}
	public static void showResult(int a) {
		for (int i = 1; i <= 9; i++)
			System.out.println(a + " * " + i + " = " + (a * i));
	}
}