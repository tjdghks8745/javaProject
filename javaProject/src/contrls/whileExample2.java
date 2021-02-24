package contrls;

public class whileExample2 {
	public static void main(String[] args) {
		int i = 2;
		int a = 1;
		while (i <= 9) {
			while (a <= 9) {
				System.out.println(i * a);
				a++;
			}
			a=1;
			i++;
		}
	}
}
