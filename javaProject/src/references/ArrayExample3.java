package references;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] a = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.print(a[0] + " ");
		System.out.print(a[1] + " ");
		System.out.print(a[2] + " ");
		System.out.print(a[3] + " ");
		System.out.print(a[4] + " ");
		System.out.print(a[5] + " ");
		System.out.print(a[6] + " ");
		System.out.print(a[7] + " ");
		System.out.print(a[8] + " ");
		System.out.print(a[9] + " ");
		
// 짝수의 합
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}
		}
		System.out.println("");
		System.out.println("그 중 짝수의 합 = " + sum);
		
// 총합 평균
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		System.out.println("총 합 평균 = " + avg);
		
// 짝수 개수 
		int cot = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				cot += 1;
			}
		}
		System.out.println("짝수 개수 = " + cot);
		
// 입력시 배치
		while (true) {
			System.out.println("배열위치입력 :");
			int i = scn.nextInt();
			if (i == 11) {
				break;
			}
			System.out.println(i + "위치 배열 값은 : " + a[i]);
		}
		scn.close();
		System.out.println("end");
	}
}
