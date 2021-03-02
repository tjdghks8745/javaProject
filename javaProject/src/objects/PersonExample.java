package objects;

public class PersonExample {
	public static void main(String[] args) {
		// 문자열 : 이름, 정수:나이 int[], String[]
		// Person[] : String, int

		new Person();
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 175.5, 72.5);
		persons[1] = new Person("박성준", 22, 188.5, 55.7);
		persons[2] = new Person("이성조", 30, 165.5, 65.5);
		persons[3] = new Person("박훈", 38, 155.5, 43.5);
		persons[4] = new Person("연산", 41, 165.5, 82.5);
		for (Person person : persons) { // 변수 person 선언
			if (person.a > 20) {
				person.introduce();
				person.sleep();
				person.eat();

			}
		
		}

	}
}
