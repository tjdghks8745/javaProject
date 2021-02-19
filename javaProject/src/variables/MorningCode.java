package variables;

public class MorningCode {
	public static void main(String[] args) {
		int a, b;
		a = 30;
		b = 29;
		
		if (a<b) {
			System.out.println("나이가 많음");
		} else if(a == b) {
			System.out.println("동점");	
		} else {
			System.out.println("나이가 적음");
		}
		
	}
}
