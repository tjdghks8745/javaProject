package inheritance;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp =(CellPhone) new DmbPhone(); // int = (int)byte; 형태 변환에 상속되게되면 똑같아짐
//		cp =(CellPhone) new SmartPhone();
		cp.color = "";
		
		if(cp instanceof DmbPhone) {
		DmbPhone dp = (DmbPhone)cp;
		dp.model = "";
		dp.color = "";
		dp.powerOn();
		} else {
			System.out.println("Casting 할 수 없습니다. ");
		}
		// 다형성.
		// 부모 = 자식들이 담겨질 수 있음
		// 부모. 메소드 = 자식.메소드; 자식메소드가 호출 됨.
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}
}
