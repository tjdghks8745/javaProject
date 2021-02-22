package operators;

public class MethodExample {
	public static void main(String[] args) {
		int result = sum(10, 20);
		int result1 = minus(30, 20);
		int result2 = multi(15, 13);
		int result3 = divide(30, 12);
		
		printAge(25); // sysout 업어도 출력 가능 .
		System.out.println("10 + 20 = " + result);
		System.out.println("30 - 20 = " + result1);
		System.out.println("15 * 13 = " + result2);
		System.out.println("30 / 12 = " + result3);
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}
	public static void printAge(int age) { // printAge 는 return 값을 안 해줘도 가능
		System.out.println("나이는 " + age + "입니다. ");
	}
}
