package sihum;

public class Student {

	private String Student;
	private int Grade;
	private int Score;

	public Student(String student, int grade, int score) {
		super();
		Student = student;
		Grade = grade;
		Score = score;
	}

	public String getStudent() {
		return Student;
	}

	public void setStudent(String student) {
		Student = student;
	}

	public int getGrade() {
		return Grade;
	}

	public void setGrade(int grade) {
		Grade = grade;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public void showInfo() {

		System.out.println("이름 :" + getStudent());
		System.out.println("학년 :" + getGrade());
		System.out.println("점수 :" + getScore());

	}

}
