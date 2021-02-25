package references;

public class ArrayExmple {
	public static void main(String[] args) {
		int score1= 90 ;
		int score2= 91 ;
		int score3= 92 ;
		int score4= 93 ;
		int score5= 94 ;
		
		int sum = score1 + score2 + score3 + score4 + score5 ;
		double avg = sum / 5.0;
		
		int[] score = new int [5];
		score[0] = 90;
		score[1] = 91;
		score[2] = 92;
		score[3] = 93;
		score[4] = 94;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println("변경후");
		score[0] = 70;
		score[1] = 78;
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println("for 문");
		sum = 0;
		for (int i = 0 ; i <5; i++) {
			sum += score[i];
			
		}
		avg = sum / 5.0;
		System.out.println(sum);
		System.out.println("for 문 끝");
		int[] scores2= { 90, 91, 92 ,93 , 94} ; // 정수형을 담을 수 있는 배열
		System.out.println(scores2[4]);
		System.out.println(scores2[2]);
		
	}
}
