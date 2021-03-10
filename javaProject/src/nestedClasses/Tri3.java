package nestedClasses;

public class Tri3 {
	public static void main(String[] args) {
//	 5  4  3  2  1
//	10  9  8  7  6
//	15 14 13 12 11
//	20 19 18 17 16
//	25 24 23 22 21

			int[][] a = new int[5][5];
			int b = 1;

			for (int i = 0; i < a.length; i++) {
				for (int j = a[i].length - 1; j >= 0; j--) {
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
