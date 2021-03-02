package objects;

public class Student {
	// 속성(필드)
	String studentNo; // p21010101
	int grade;
	int math;
	int eng;

	// 생성자:필드값을 초기화 할 때 사용 보통
	Student(String string, int i, int j) {
		System.out.println("생성자를 호출합니다.");
	}

	Student(String studentNo) {
		this.studentNo = studentNo;
		
	}

	Student(int grade, int eng, int math){
		this.grade = grade;
		this.eng = eng;
		this.math = math;
		
	}

	// 기능(메소드)
	void study() {
		System.out.println("공부합니다.");
	}

	void run() {
		System.out.println("운동합니다.");
	}

	void intorduce() {
		System.out.println("학번: " + studentNo + ", 학년: " + grade);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getEng() {
		// TODO Auto-generated method stub
		return eng;
	}

	public int getMath() {
		// TODO Auto-generated method stub
		return math;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setEng(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setMath(int i) {
		// TODO Auto-generated method stub
		
	}
}
