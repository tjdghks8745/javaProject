package variables;

public class CheckValueBefore {
	public static void main(String[] args) {
		int i = 15;
		System.out.println(Byte.MIN_VALUE);
		if(i <Byte.MIN_VALUE || (i > Byte.MAX_VALUE)) {
			System.out.println("byte타입으로 변환 할 수 없습니다.");
			System.out.println("값을 확인하세요.");
		} else {
			byte b = (byte) i ;
			System.out.println("byte타입 값 :" + b);

		}
	}
}
