package contrls;

import java.io.IOException;

public class WhilekeyControlExample {
	public static void main(String[] args) throws IOException {
		while (true) {
		System.out.println("keyCoe 입력하세요.");
		int keyCode = System.in.read();
		System.out.println(keyCode);
		if(keyCode == 113) {
			break;
		}
		keyCode = System.in.read();
		System.out.println(keyCode);
		keyCode = System.in.read();
		System.out.println(keyCode);
	}
		System.out.println("end");
	}
}
