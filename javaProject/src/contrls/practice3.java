package contrls;
// 1~10까지의 짝수의 합
public class practice3 {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <=10; i++) {
			if(i % 2 == 0)
				result += i;
		}
		System.out.println(result);
	}
}
