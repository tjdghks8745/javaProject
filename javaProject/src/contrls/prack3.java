package contrls;

public class prack3 {
	public static void main(String[] args) {
		int n1 = 44;
		int n2 = 67;
		int sum  = getSumValue(n1,n2);
		System.out.println(sum);
	}

	public static int getSumValue(int a, int b) {
		int startnu1 = (a > b) ? a : b;
		int endnu2 = (a>b) ? b:a ;
		for (int i = a; i<= b; i++) {
			sum += i;
		}
		return sum;
	}
}
//아직덜품
