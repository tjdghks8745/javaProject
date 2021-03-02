package objects;

public class Student1 {
	private String name;
	private int eng;
	private int math;

	public Student1() {
	}

	public Student1(String name, int eng, int math) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}
