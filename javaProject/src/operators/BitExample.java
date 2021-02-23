package operators;

public class BitExample {
	public static void main(String[] args) {
		int x = 45;
		int y = 25;
		
		System.out.println(x & y);// 만약에 값을 이진수로 표기하려면 ? 
		System.out.println(Integer.toBinaryString(x)); // 101101
		System.out.println(Integer.toBinaryString(y)); // 011001
		//논리곱으로 계산하면 1 & 1 = 1 
		
		x = 8;
		y = 3;
		
		System.out.println(Integer.toBinaryString(x)); // 1000 >> 0011 으론쪽으로 이동 값 > 1
		System.out.println(Integer.toBinaryString(y)); // 0011
		System.out.println("Twomv =" + (x >> y));
		
		System.out.println(Integer.toBinaryString(x)); // 1000 << 0011 왼쪽으로 이동
		System.out.println(Integer.toBinaryString(y)); // 0011
		System.out.println(x << y);
		
		
		
		
	}
}
