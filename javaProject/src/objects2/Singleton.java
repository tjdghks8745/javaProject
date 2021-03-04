package objects2;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {} // 외부에서 접근 못하도록 private 를 생성자 앞에 붙여야함 // 외부 연산자에서 new연산자로 생성자 호출을 없도록 막아야 함 > private 를 사용
		public static Singleton getInstance() {
			return singleton;
			
		
	}
}
