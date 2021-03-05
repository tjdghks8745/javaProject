package inheritance;

public class SmartPhone extends CellPhone {

	@Override
	void powerOn() {
		System.out.println("SmartPhone 전원을 킵니다.");
	}

	@Override
	void powerOff() {
		System.out.println("SmartPhone 전원을 끕니다.");
	}

}
