package inheritance;

public class Car {
	Tire frontLeft = new Tire("앞 왼쪽", 6);
	Tire frontRight = new Tire("앞 오른쪽", 5);
	Tire backLeft = new Tire("뒤 왼쪽", 3);
	Tire backRight = new Tire("뒤 오른쪽", 7);

	public int run() {
		if (frontLeft.roll() == false) {
			// 메세지
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
