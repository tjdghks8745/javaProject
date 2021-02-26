package references;

public class Morning02262 {
	public static void main(String[] args) {
		String[] N = { "임성원", "정준영", "도왕락" };
		int[] S = { 88, 89, 90 };
		
		for(int i = 0 ; i <N.length; i++) {
			System.out.println(N[i] + "> " + S[i] );
			for (int j = 0 ; j< S.length; j++) {
				
			}
			}
		
		for (String n : N) {
			System.out.println(n);
		}
		int sum = 0;
		for (int s : S) {
			sum = sum + s;
			
		}
		System.out.println("합계 점수 : " + sum);
		}
	}
