package lamdbaExpression;

interface MyFunctionalInterface {
	void run(); // 구현해야 할 메소드가 하나만 있는 인터페이스 : FunctionalInterface

}

class MyFunctionClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("run을 실행합니다. ");
	}

}

public class FunctionalExmple {
	public static void main(String[] args) {
		MyFunctionalInterface mif = new MyFunctionalInterface() {
			@Override
			public void run() {
				System.out.println("run()를 실행합니다.");
			}
		};
		mif.run();

		mif = () -> System.out.println("run()메소드를 실행합니다."); // 람다표현식
		mif.run();
	}
}