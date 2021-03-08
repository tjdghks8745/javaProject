package inheritance;

public class Tire {
	int maxRotation ; //최대회전수
	int accumulatedRotation; // 누적화전수
	String location ;
	
	//생성자 선언
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;	
	}
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Trie 수명 :" + (maxRotation - accumulatedRotation) + "회" );
			return true;
		}else {
			System.out.println("***" + location + "Trie 펑크 ***");
			return false;
		}
	}
}
