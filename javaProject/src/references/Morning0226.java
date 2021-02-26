package references;

public class Morning0226 {
	public static void main(String[] args) {
		int[] enScores = { 80, 72, 92 }; //  new int[3]; enScores[0] = 90; ...etc engScores = new int[] {90, 88, 87} ; ...etc
		int[] mathScores = { 70, 20, 90 }; // new int[3]; mathScores[0] = 90; ...etc mathScores = new int[] {90, 88, 87} ; ...etc
		double sum = 0;
		double sum1 = 0;
		double A = 0;
		double A2 = 0;

		System.out.println(enScores.length);
		System.out.println(mathScores.length);

		for (int i = 0; i < enScores.length; i++) {
			sum += enScores[i];
		}
		A = sum / enScores.length;
		System.out.println("영어평균 :" + A);
		for (int j = 0; j < mathScores.length; j++) {
			sum1 += mathScores[j];
		}
		A2 = sum1 / mathScores.length;
		System.out.println("수학평균 :" + A2);
	}
}