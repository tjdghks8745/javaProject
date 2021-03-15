package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 10);
		map.put("김민수", 20);
//		map.remove("홍길동"); // map에서 홍길동이라는 값을 null 로 변경
		

		//set<String>
		Integer result = map.get("홍길동");
		System.out.println(result);
		if (map.containsKey("홍길동")) {
			System.out.println(result);
		}
		Set<String> set = map.keySet(); // key 에 해당하는 값만 불러오는 것
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println(result + key + val);

		}
		// key + val 값을 같이 가져오는 방법 Map.Entry<String, Integer> Entry > 중첩클래스
		Set<Entry<String, Integer>> entSet = map.entrySet();
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while (entIter.hasNext()) {
			Entry<String, Integer> ent = entIter.next();
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println(key + val);
		}
	}
}
