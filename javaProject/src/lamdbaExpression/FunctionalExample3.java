package lamdbaExpression;

interface MyFuncInterface {
	int run(int a, int b);
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncInterface mfi = (a, b) -> a + b;
		int result = mfi.run(5, 10);
		System.out.println(result);

		mfi = (num1, num2) -> num1 * num2;
		result = mfi.run(10, 20);
		System.out.println(result);

		mfi = (aa, bb) -> {
			return (aa + bb) / 2;
		};
		result = mfi.run(10, 20);
		System.out.println(result);
	}
}
