package abstractClasses;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		// 달력만들기
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DATE));

		System.out.println("////////////////////////////////////");
		cal.set(2021, 1, 3);// cal 변수값에 > 2021년 5월 1일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		System.out.printf("%3d", 9);
		System.out.printf("%3d", 10);
		System.out.printf("%5s", "Mon");
		System.out.printf("%3d", 9);
		System.out.printf("%3d", 10);
		System.out.printf("%5s", "Mon");
		System.out.printf("%3d", 9);
		System.out.printf("%3d", 10);
		System.out.printf("%5s", "Mon");
		System.out.printf("%3d", 9);
		System.out.printf("%3d", 10);
		System.out.printf("%5s", "Mon");

//		 1  2  3  4  5  6  7
//		 8  9 10 11 12 13 14
//		15 16 17 18 19 20 21
//		22 23 24 25 26 27 28
//		29 30 31
		
		System.out.println();
		System.out.println("==========================================");
		for (int i = 1; i < 8; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		for (int i = 8; i < 15; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		for (int i = 15; i < 22; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		for (int i = 29; i < 32; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("==========================================");

		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1 ; i < firstDay; i++) {
			System.out.printf("%3s" , " ");
		}
		for (int i = 1 ; i <= lastDate; i++) {
			cal.set(Calendar.DATE, i);
			System.out.printf(i + "\t") ;
			
			int j =  cal.get(Calendar.DAY_OF_WEEK);
			if(j % 7 == 0) {
				System.out.println();
			}
					
			
		}
		System.out.println(); //https://velog.io/@kyukim/%EC%BD%94%EB%93%9C%EC%8A%A4%EC%BF%BC%EB%93%9C-%EC%BD%94%EC%BD%94%EC%95%84-%EA%B3%BC%EC%A0%95%EC%9E%90%EB%B0%94-%EB%8B%AC%EB%A0%A5-%EC%B6%9C%EB%A0%A5
	}
}
