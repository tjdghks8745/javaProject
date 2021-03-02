package homework;

// 문제) 학생의 이름, 영어, 수학 점수를 저장.
// 1) 클래스를 활용해서 값을 저장 할 수 있도록 선언.
// 2) 3명 정도 값을 저장. (홍길동, 90, 85), (김길동, 88, 85), (이길동, 76, 90);
// 3) 학생의 정보를 저장 할 수 있도록 배열.
// 4) 전체 정보를 보여주도록 (이름 > 영어 > 수학 > 합계) 메소드.
public class Student {

	String name;
	int ES;
	int MS;
	int Sum;

	Student(String name, int ES, int MS) {
		this.name = name;
		this.ES = ES;
		this.MS = MS;
		this.Sum = ES + MS;
	}

	void im() {
		System.out.println(this.name + " " + this.ES + " " + this.MS + " " + this.Sum);
	}
}