package references;

public class parck1 {
	public static void main(String[] args) {
		double[] averages = { 1, 2, 3, 4, 5 }; // 실수형을 담을 수 있는 배열
		double d1 = averages[0];
		averages[3] = 4.5;
		for (int i = 0; i < averages.length; i++) {// lengh 는 그 문자열의 길이
			System.out.println(averages[i]);
		}
		String[] strs = {"Hello", " ","good"," ", "Nice" ," ", "20"}; // 문자형을 담을 수 있는 배열
		for(int i = 0; i <= strs.length; i++) {
			System.out.print(strs[i]);
		}
	}
}
