package contrls;
// 1~100 까지의 합 while문 사용
public class practice {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			sum += a;
			a++;
		}
		System.out.println(sum);
	}
}
