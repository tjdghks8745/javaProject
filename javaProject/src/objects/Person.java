package objects;

public class Person {
	String name;
	int a;
	double kg;
	double cm;
	
	Person(){
		
	}

	Person(String name, int a, double kg, double cm) {
		this.name = name;
		this.a = a;
		this.kg = kg;
		this.cm = cm;
	}

	Person(String name) {
		this.name = name;

	}

	void eat() {
		System.out.println("먹는다.");
	}

	void sleep() {
		System.out.println("잔다.");
	}

	void introduce() {
		System.out.println("이름은: " + this.name + " 나이는: " + this.a + " 입니다.");
	}
}
