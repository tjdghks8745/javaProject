package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87)); // Integer 에 선은 프로그램 에러는 아닌데 이런 방법을 사용하지 말라는 뜻
		scores.add(new Integer(98)); // 87 을 기준으로 왼쪽 오른쪽 정렬 됨.
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());// 작은 값에서 오름차순으로 정렬 > 크다 작다 라는 말이 정의 되어 있음.
		}
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: "+ score + "\n");

	}
}
