package references;

import java.util.Calendar;
enum Kind {
	MALE, FEMALE;
}
enum Choice{
	YES, NO;
}
public class EumExample {
	public static void main(String[] args) {
		int maleORFemali = 1; // 1 남자 , 2여자
		int yesORno = 1; //  1 yes , 2 no
		Week today = null;
		today = Week.SUNDAY;
//		today = "Hello"; 열거형 데이터 형이라 안됨 
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 > " + cal.get((Calendar.YEAR)));
		System.out.println("월 > " + cal.get((Calendar.MONTH))); // 월의 정보는 0부터 시작함 
		System.out.println("일 > " + cal.get((Calendar.DAY_OF_MONTH))); 
		System.out.println("요일 > " + cal.get((Calendar.DAY_OF_WEEK))); //일요일 부터 1
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week)  {
			case 1 :
				today = Week.SUNDAY; break;
			case 2 :
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4 :
				today = Week.WEDNESDAY; break;
			case 5 :
				today = Week.THURSDAY; break;
			case 6 :
				today = Week.FRIDAY; break;
			case 7 :
				today = Week.STURDAY; break;
		}
		if(today == Week.SUNDAY || today == Week.STURDAY) {
			System.out.println("주말에는 여해을 갑니다.");
		}else {
			System.out.println("주중에는 공부를 합니다.");
		}
		System.out.println("금일 요일 = " + week);
		
		if(week == 1 || week ==2 ) {
			System.out.println("주말에는 여해을 갑니다.");
		}else {
			System.out.println("주중에는 공부를 합니다.");
		}
		Kind manOfwoman = Kind.FEMALE;
		
		if (manOfwoman == Kind.MALE) {
			System.out.println("남성입니다.");
		} else if(manOfwoman == Kind.FEMALE) {
			System.out.println("여성입니다.");
		}
	}
}
