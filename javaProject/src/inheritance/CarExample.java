package inheritance;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 7; i++) {
			int problemLcation = car.run();
			switch(problemLcation) {
			case 1 :
				System.out.println("앞 왼쪽 Hankooktrie 교체");
				car.frontLeft = new HankookTrie("앞 왼쪽", 10);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire 교체");
			car.frontRight = new KumhoTrie("앞 오른쪽" , 12) ; 
			break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTrie 교체");
				car.backLeft = new HankookTrie("뒤 왼쪽", 15);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire 교체");
				car.backRight = new KumhoTrie("뒤 오른쪽", 20);
			}
			System.out.println("======================================");
		}//end of main
		System.out.println("프로그램 종료.");
	}//end of main
}// end of class
