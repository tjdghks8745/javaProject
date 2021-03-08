package inheritance;

public class HankookTrie extends Tire { // 기본 생성자를 무조건 만들어 줘야 한다.
	public HankookTrie(String location, int maxRotation) {
		super(location, maxRotation); // 무엇 알아보기	
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 :" + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}
	
}
