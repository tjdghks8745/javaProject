package nestedClasses;

public class Tri {
	public static void main(String[] args) {
//		  1  2  3  4  5
//		  6  7  8  9 10
//		 11 12 13 14 15
//		 16 17 18 19 20
//		 21 22 23 24 25

		int[][] a = new int[5][5];
		int b = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = b++;
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