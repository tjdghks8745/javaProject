package contrls;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		for (int a = 10; a>0; a--) {
			System.out.println("a :" + a + "\t ");
			sum = sum + a ;	
			System.out.println("sum :" + sum);
		}
		System.out.println("sum의 합 " + sum);
	}
}
