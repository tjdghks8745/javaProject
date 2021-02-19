package variables;

public class GetAverageValue {
	public static void main(String[] args) {
		int a, b; 
		double result;
		a = 17;
		b = 18;
		result = (double)(a + b) / 2; // 이미 결과값이 실수이기 때문에 sysout에 적어도 17.0으로 결과값 표기 그래서 결과값이 아닌 함수식에 넣어야 함 .
		System.out.println("두수의 평균은:" + result + "입니다.");  
	}
}
