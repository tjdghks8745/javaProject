package contrls;
// 1~10까지 홀수의 합은?
public class practice2 {
	public static void main(String[] args) {
		int result = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 2 == 1) {
				result += i;
			}
		}
		System.out.println(result);
	}
}
