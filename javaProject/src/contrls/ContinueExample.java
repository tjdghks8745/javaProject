package contrls;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10 ; i++) {
			if (i% 2 == 1 ) {
				continue; // 밑에 있는 코드를 인식 안하고 다시 반복문 nextline 과 동일
			}
			System.out.println(i);
		}
	}
}
