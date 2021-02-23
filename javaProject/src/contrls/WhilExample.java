package contrls;

public class WhilExample {
	public static void main(String[] args) {
//		반복문
//		for(int = 0; i <= 9; i++){....}
		int i = 1;
		int sum = 0;
		while(true) {
			sum  = sum + i;
			if(i >= 10) {
				break;	
			}
			i++;
		}
		System.out.println(sum);
//		int i = 1;
//		int sum = 0;
//		while(i <=10) {
//			if (i % 2 == 0);
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 짝수의 합 " + sum);
	}
}
