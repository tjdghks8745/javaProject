package contrls;

public class SwitchExample2 {
	public static void main(String[] args) {
		int score = 67;

		switch (score / 10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
