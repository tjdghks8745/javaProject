package Api;

public class MemberExample {
//	public static void main(String[] args) {
//		Member obj1 = new Member("blue");
//		Member obj2 = new Member("blue");
//		Member obj3 = new Member("red");
//
//		if (obj1.equals(obj2)) {
//			System.out.println("obj1과 obj2는 동등합니다.");
//		} else {
//			System.out.println("obj1과 obj2는 동등하지 않습니다.");
//		}
//
//		if (obj1.equals(obj3)) {
//			System.out.println("obj과 obj3는 동등합니다.");
//
//		} else {
//			System.out.println("obj1과 obj3는같지 않습니다.");
//		}
//	}
	String name;
	int age;
	int[] scores;
	
	public MemberExample(String name, int age, int[] scores) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
	}


	
	public static void main(String[] args) {
		//원본객체 생성
		Member original = new Member("blue" , "홍길동" , "12345" , 25 , true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id :" + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id :" + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
	}
}
