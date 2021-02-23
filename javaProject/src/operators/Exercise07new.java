package operators;

public class Exercise07new {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		boolean z = (x > 7) && (y <= 5);
		System.out.println(z);
		z = (x % 3 == 2 ) || (y % 2 != 1);
		System.out.println(z);
		
		z = (x++ % 2 == 0) || (y++ % 3 == 0); //  ||(2개일 경우) 둘중에 하나만 참이면 true 이기 때문에 하지만 | 한개가 된다면 두개의 논리를 계산 후 판단 그래서 false 로 바뀌면서 y 값이 계산 됨. 
		if(z) {
			System.out.println("true :" + x + ", y:" + y);
		}else {
			System.out.println("false:" + x + ", y:" + y); 
		}
	}
}
