package collections;

public class Student {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode(); // name 에 있는 hash 코드를 사용 한다는 의미 > this.name.hashCode
	}

	@Override
	public boolean equals(Object obj) {// hash코드 값이 같으면 .equals 라는 값으로 비교하게 됨.
		
		if(obj instanceof Student) {
		Student s = (Student) obj;
		return this.sno == s.sno && this.name.equals(s.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

}
