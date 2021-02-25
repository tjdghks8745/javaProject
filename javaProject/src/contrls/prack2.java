package contrls;

public class prack2 {
	public static void main(String[] args) {
		int n1 = 44;
		int n2 = 67;
		int sum  = getSumValue(n1,n2);
		System.out.println(sum);
	}

	public static int getSumValue(int a, int b) {
		int sum = 0;
		for (int i = a; i<= b; i++) {
			sum += i;
		}
		return sum;
	}
}
