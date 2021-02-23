package contrls;

public class SwitchExample {
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			int a = (int) (Math.random() * 5) + 1; // math.rnadom 메소드 는 0 ~ 1 사이의 임의 수
//			System.out.println(a);
//		}
		String msg = "짝수/홀수";
		int a = (int) (Math.random() * 10) + 1;
		switch (a) {
		case 1 :
		case 3 : 
		case 5 :
		case 7 : 
		case 9 : msg = "홀수"; break;
		case 2 :
		case 4 :
		case 6 :
		case 8 :
		case 10 : msg = "짝수"; break;
		}
		System.out.println(a + "는 " + msg + " 입니다.");
	}
}
