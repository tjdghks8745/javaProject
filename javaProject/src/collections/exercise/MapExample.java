package collections.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	public static void main(String[] args) {
		
		//평균점수 91
		//최고점수 96
		//최고점수를 받은 아이디 : blue
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator()	;
		
		
		// 이쪽에 작성
			String str;
			System.out.println("b".compareTo("a"));
			TreeSet<String> tSet = new TreeSet<>();
			
		}
	}

