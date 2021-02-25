package references;
// 랜덤 숫자를 배열에 넣어서 출력
public class ArrayExample1 {
	public static void main(String[] args) {
		int[] intArys = {1, 2, 3, 4, 5 };
		for (int i = 0; i <5; i++) {
			intArys[i] = (int)(Math.random() * 10) + 1;
		}
			System.out.println(intArys[0]);
			System.out.println(intArys[1]);
			System.out.println(intArys[2]);
			System.out.println(intArys[3]);
			System.out.println(intArys[4]);
			
			int maxValue = 0;
			for (int i = 0; i <intArys.length ; i++) {
				if (intArys[i] > maxValue) {
					maxValue = intArys[i];
				}
				
			}
			System.out.println("최대값 :" + maxValue);
		}
	}