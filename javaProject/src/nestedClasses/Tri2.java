package nestedClasses;

public class Tri2 {
	public static void main(String[] args) {
//	1  6 11 16 21
//	2  7 12 17 22
//	3  8 13 18 23
//	4  9 14 19 24
//	5 10 15 20 25

		int[][] a = new int[5][5];
		int b = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[j][i] = b++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

}
