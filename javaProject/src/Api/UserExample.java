package Api;

import java.util.HashMap;

public class UserExample {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello2323".hashCode());
		
		User user1 = new User();
		user1.userId = "user1";
		user1.score = 80;
		User user2 = new User();
		user1.userId = "user2"
		//두 수의 합을 구하고 합의 결과를 3자리 단위로. ,4,530,890 보여주는 메소드.
			public static void sum(String a, String B) {
			System.out.println(a+b);
		}
			
		
//		User user2 = new User();
//		
//		User user1 = new User();
//		User user2 = new User();
		
		System.out.println(user1 == user2);
		
		HashMap<User, String> hashMap = new HashMap<>();
		hashMap.put(user1, "홍길동");
		hashMap.put(user1, "박길동");
		hashMap.put(user2, "박길동");
		
		String r1 = hashMap.get(user1);
		String r2 = hashMap.get(user2);
		
		System.out.println(r1 + "," + r2);
		
				
			
	}
}
