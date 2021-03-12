package collections;


import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
	public static void main(String[] args) {
		String[] strAry = new String[10];
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice" ;
		for (int i = 0; i < strAry.length; i++) {
			if(strAry[i] != null) {
				System.out.println(strAry[i]);
			}
		}
		
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.get(0);
		List<String> strList = new ArrayList<>(); //<String> 타입을 붙여주면 강제로 전체 문자열로 바뀌게 됨 . 
		strList.add("Hello");
		strList.add("Nice");
		strList.add("Good");
		strList.add(0, "Very"); //배열에 위치에 입력값을 저장하게 함 .
		for(int i = 0 ; i < strList.size(); i ++) {
			strList.get(i);
			
		}
		strList.get(0);
		strList.remove(2);
		System.out.println(strList.size());
		strList.remove(0); //remove 는 배치 열에 삭제 
		System.out.println(strList.size());
//		for(int i = 0 ; i < 50 ; i++) {
//			strList.add(String.valueOf(i));
//		}
//		strList.add(100);
		for (Object obj : strList) {
			String str = (String) obj;
			System.out.println(str.equals("Hello"));// Hello 첫번째는 확인 두번째 nice 는 걸러짐 3번째 100은 숫자타입이라 오류
		}
		
	}
}
