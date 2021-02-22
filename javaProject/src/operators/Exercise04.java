package operators;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = ( 534 / 30 );
		System.out.println(pencilsPerStudent);
		
		//남은 연필수
		int pencilsLeft = (534 % 30 ) ;
		System.out.println(pencilsLeft);
		
	}
}
